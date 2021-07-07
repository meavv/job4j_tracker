package ru.job4j.set;

import java.util.*;

public class UniqueName {
    public static int collectUniqueName(List<User> users) {
        int count = 0;
        HashSet<User> set = new HashSet<User>();
        for (User user : users) {
            if (set.add(user)) {
                count++;
            }
        }
        return count;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}