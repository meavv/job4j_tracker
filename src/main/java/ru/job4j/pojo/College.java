package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Qwe Rty ");
        student.setGroup("RGD-5 ");
        student.setDate("10-11-2020");
        System.out.println(student.getName() + student.getGroup() + student.getDate());
    }
}
