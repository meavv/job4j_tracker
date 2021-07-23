package ru.job4j.stream;

public class Notebook {
    private String model;
    private String operatingSystem;
    private boolean discreteGraphicsCard;
    private String cpu;
    private int price;

    @Override
    public String toString() {
        return "Notebook{" + "model='" + model + '\''
                + ", operatingSystem='" + operatingSystem + '\''
                + ", discreteGraphicsCard=" + discreteGraphicsCard
                + ", CPU='" + cpu + '\''
                + ", price=" + price + '}';
    }

    static class Builder {
        private String model;
        private String operatingSystem;
        private boolean discreteGraphicsCard;
        private String cpu;
        private int price;

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        Builder buildDiscreteGraphicsCard(boolean discreteGraphicsCard) {
            this.discreteGraphicsCard = discreteGraphicsCard;
            return this;
        }

        Builder buildCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        Builder buildPrice(int price) {
            this.price = price;
            return this;
        }

        Notebook build() {
            Notebook notebook = new Notebook();
            notebook.model = model;
            notebook.operatingSystem = operatingSystem;
            notebook.discreteGraphicsCard = discreteGraphicsCard;
            notebook.cpu = cpu;
            notebook.price = price;
            return notebook;
        }
    }

    public static void main(String[] args) {
        Notebook notebook = new Builder().buildModel("Asus")
                .buildOperatingSystem("Win10")
                .buildDiscreteGraphicsCard(true)
                .buildCPU("i7")
                .buildPrice(1000)
                .build();
        System.out.println(notebook);
    }

}
