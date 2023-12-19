package ru.mirea.lab6_1;

// Абстрактный класс, описывающий собаку
abstract class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // Абстрактный метод
    public abstract void comand();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}


