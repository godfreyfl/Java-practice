package ru.mirea.lab6_3;

// Класс, представляющий стул
class Chair extends Furniture {
    private int numberOfLegs;

    public Chair(String name, double price, int numberOfLegs) {
        super(name, price);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стул: " + getName());
        System.out.println("Цена: " + getPrice() + " руб.");
        System.out.println("Количество ножек: " + numberOfLegs);
    }
}


