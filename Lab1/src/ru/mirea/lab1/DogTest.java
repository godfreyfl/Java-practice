package ru.mirea.lab1;

public class DogTest {
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
    }
}
