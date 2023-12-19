package ru.mirea.lab6_2;

// Абстрактный класс, описывающий посуду
abstract class Dish {
    private String material;
    private String color;

    // Конструктор
    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }

    // Абстрактный метод для использования посуды
    public abstract void use();

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}


