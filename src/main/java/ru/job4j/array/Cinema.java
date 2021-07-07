package ru.job4j.array;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        Place freePlace = null;
        for (int i = 0; i < places.length; i++) {
            for (int k = 0; k < places.length; k++) {
                if ((i + k) % 2 == 0) {
                    if (places[i][k] == null) {
                        freePlace = new Place(i, k);
                        return freePlace;
                    }
                }
            }
        }
        return freePlace;
    }

    public static class Place {
        private int row;

        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row
                    && cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }

        public void setRow(int row) {
            this.row = row;
        }

        public void setCell(int cell) {
            this.cell = cell;
        }
    }
}