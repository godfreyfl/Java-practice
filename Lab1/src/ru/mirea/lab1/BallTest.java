package ru.mirea.lab1;

public class BallTest {
    public static void main(String[] args) {
        Ball ball1 = new Ball("blue", 30);
        Ball ball2 = new Ball("purple", 45);
        Ball ball3 = new Ball("red");

        ball3.setDiameter(25);

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
