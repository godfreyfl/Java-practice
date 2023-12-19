package ru.mirea.lab1;

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String n) {
        name = n;
        age = 0;
    }

    public Dog() {
        name = "Dog";
        age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age;
    }

    public String calculateHumanAge() {
        return name + "'s age in human years is " + age * 7 + " years";
    }
}

