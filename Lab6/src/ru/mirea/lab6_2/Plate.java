package ru.mirea.lab6_2;

// Подкласс, представляющий тарелку
class Plate extends Dish {
    private int diameter;

    // Конструктор для создания объекта тарелки
    public Plate(String material, String color, int diameter) {
        super(material, color);
        this.diameter = diameter;
    }

    // Переопределение метода use() для тарелки
    @Override
    public void use() {
        System.out.println("Положите еду на тарелку.");
    }

    public int getDiameter() {
        return diameter;
    }
}


