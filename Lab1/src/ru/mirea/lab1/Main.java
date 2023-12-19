package ru.mirea.lab1;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Charlie", 3);
        Dog dog2 = new Dog("Lily", 5);
        Dog dog3 = new Dog();

        dog3.setName("Kyle");
        dog3.setAge(4);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        System.out.println(dog1.calculateHumanAge());
        System.out.println(dog2.calculateHumanAge());
        System.out.println(dog3.calculateHumanAge());

        System.out.println("\n");

        Ball ball1 = new Ball("blue", 30);
        Ball ball2 = new Ball("purple", 45);
        Ball ball3 = new Ball("red");

        ball3.setDiameter(25);

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);

        System.out.println("\n");

        Book book1 = new Book("Pollianna", 2003);
        Book book2 = new Book("Waffle heart", 2005);
        Book book3 = new Book();

        book3.setTitle("Runing after the wind");
        book3.setYear(2003);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
