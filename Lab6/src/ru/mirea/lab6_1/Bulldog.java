package ru.mirea.lab6_1;

class Bulldog extends Dog {
    public Bulldog(String name, int age, String color) {
        super(name, age, color); // вызов конструктора супер класса (класса-родителя)
    }

    // Переопределение метода bark() для бульдога
    @Override
    public void comand() {
        System.out.println("Бульдог по имени " + getName() + " знает 15 команд.");
    }
}
