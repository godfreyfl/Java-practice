package ru.mirea.lab22_2;

public class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sit(Chair chair) {
        System.out.println("FunctionalChair");
    }
}
