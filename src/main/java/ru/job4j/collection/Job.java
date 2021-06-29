package ru.job4j.collection;

public class Job implements Comparable<Job>{
    private String name;

    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }
}
//Меньше нуля - если входящее значение больше, чем текущий объект.
//
//Ноль - если значение равны.
//
//Больше нуля - если текущее значение больше, чем входящее.
//        Примечание. Текущее значение - это объект у которого вызван метод compareTo.