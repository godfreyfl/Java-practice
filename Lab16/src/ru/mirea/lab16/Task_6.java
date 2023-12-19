package ru.mirea.lab16;

import java.util.Scanner;

public class Task_6 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public void printDetails(String key) {
        try {
            if (key.equals("")) {
                throw new Exception("Key set to empty string");
            }

            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    private String getDetails(String key) {
        return "data for " + key;
    }

    public static void main(String[] args) {
        Task_6 exceptionExample = new Task_6();
        exceptionExample.getKey();
    }
}
