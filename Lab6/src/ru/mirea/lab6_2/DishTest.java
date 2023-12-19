package ru.mirea.lab6_2;

public class DishTest {
    public static void main(String[] args) {
        Plate plate = new Plate("Керамика", "Белый", 20);
        Mug mug = new Mug("Стекло", "Прозрачный", 300);

        plate.use();
        mug.use();

        System.out.println("Тарелка: Материал - " + plate.getMaterial() + ", Цвет - " + plate.getColor() + ", Диаметр - " + plate.getDiameter() + " см");
        System.out.println("Кружка: Материал - " + mug.getMaterial() + ", Цвет - " + mug.getColor() + ", Объем - " + mug.getVolume() + " мл");
    }
}

