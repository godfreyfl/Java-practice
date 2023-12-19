package ru.mirea.lab16;

public class Task_1{
    public void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Task_1 task1 = new Task_1();
        task1.exceptionDemo();
    }
}