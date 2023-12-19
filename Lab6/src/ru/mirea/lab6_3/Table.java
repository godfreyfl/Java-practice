package ru.mirea.lab6_3;

// Класс, представляющий стол
class Table extends ru.mirea.lab6_3.Furniture {
    private int numberOfSeats;

    public Table(String name, double price, int numberOfSeats) {
        super(name, price);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стол: " + getName());
        System.out.println("Цена: " + getPrice() + " руб.");
        System.out.println("Количество мест: " + numberOfSeats);
    }
}


