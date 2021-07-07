package ru.job4j.map;


import java.util.*;

public class Weather {
    public static List<Info> editData(List<Info> list) {
        HashMap<String, Integer> map = new HashMap<>();
        List<Info> rsl = new ArrayList<>();
        for (Info info : list) {
            map.putIfAbsent(info.getCity(), 0);
            map.computeIfPresent(info.getCity(), (key, value) -> value + info.getRainfall());
        }
        for (String city : map.keySet()) {
            rsl.add(new Info(city, map.get(city)));
        }
        return rsl;
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall
                    && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}