package ru.mirea.lab9_1;

public class Main {
    public static void main(String[] args) {
        Nameable[] objects = new Nameable[3];

        objects[0] = new Planet("Земля");
        objects[1] = new Car("Toyota", "Camry");
        objects[2] = new Animal("Лев");

        for (Nameable obj : objects) {
            System.out.println("Имя объекта: " + obj.getName());
        }
    }
}
