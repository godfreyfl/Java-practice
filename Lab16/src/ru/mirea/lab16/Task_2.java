package ru.mirea.lab16;

import java.util.Scanner;

public class Task_2{
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString); System.out.println( 2 / i );
    }

    public void exceptionDemo2(){
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch (NumberFormatException e){
            System.out.println("Not correct number");
        }
    }

    public static void main(String[] args) {
        Task_2 task2 = new Task_2();
        task2.exceptionDemo2();
        task2.exceptionDemo();
    }
}
