package ru.mirea.lab6_1;

public class DogTest {
    public static void main(String[] args) {
        Labrador labrador = new Labrador("Лав", 3, "Шоколадный");
        Bulldog bulldog = new Bulldog("Спайк", 5, "Белый с пятнами");

        labrador.comand();
        bulldog.comand();

        System.out.println("Информация о лабрадоре: Имя - " + labrador.getName() + ", Возраст - " + labrador.getAge() + " года, Цвет шерсти - " + labrador.getColor());
        System.out.println("Информация о бульдоге: Имя - " + bulldog.getName() + ", Возраст - " + bulldog.getAge() + " лет, Цвет шерсти - " + bulldog.getColor());
    }
}
