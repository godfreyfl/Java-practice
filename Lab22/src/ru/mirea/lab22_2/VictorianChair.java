package ru.mirea.lab22_2;

public class VictorianChair implements Chair {
    private int age;
    public int getAge() {
        return age;
    }

    VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public void sit(Chair chair) {
        System.out.println("VictorianChair");
    }
}
