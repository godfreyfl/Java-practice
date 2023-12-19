package ru.mirea.lab6_1;

class Labrador extends Dog {
    public Labrador(String name, int age, String color) {
        super(name, age, color); // вызов конструктора супер класса (класса-родителя)
    }
    // Переопределение метода bark() для лабрадора
    @Override
    public void comand() {
        System.out.println("Лабрадор по имени " + getName() + " знает 8 команд.");
    }
}
