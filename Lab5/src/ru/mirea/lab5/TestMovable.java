package ru.mirea.lab5;

public class TestMovable {
    public static void main(String[] args) {
        // Тест класса MovablePoint
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        System.out.println("Текущая позиция точки: " + point);
        point.moveUp();
        point.moveRight();
        System.out.println("Новая позиция точки: " + point);

        // Тест класса MovableCircle
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);
        System.out.println("Текущая позиция и радиус круга: " + circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("Новая позиция и радиус круга: " + circle);

        // Тест класса MovableRectangle
        MovableRectangle rectangle = new MovableRectangle(0, 0, 2, 2, 1, 1);
        System.out.println("Текущие позиции верхнего левого и нижнего правого углов прямоугольника: " + rectangle);
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println("Новые позиции верхнего левого и нижнего правого углов прямоугольника: " + rectangle);

        // Проверка на одинаковую скорость двух точек прямоугольника
        System.out.println("Прямоугольник имеет одинаковую скорость для обеих точек: " + rectangle.hasSameSpeed());
    }
}

