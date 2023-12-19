package ru.mirea.lab11;

public class Student {
    private String name;
    private int idNumber;

    public Student(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", idNumber='" + idNumber + '\'' + '}';
    }
}
