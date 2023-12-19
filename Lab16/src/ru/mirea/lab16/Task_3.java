package ru.mirea.lab16;

import java.util.Scanner;

public class Task_3{
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e) {
            System.out.println("Not correct number");
        }
        catch (Exception e) {
            System.out.println("Exception happened!");
        }
    }

    public static void main(String[] args) {
        Task_3 task3 = new Task_3();
        task3.exceptionDemo();
    }
}
