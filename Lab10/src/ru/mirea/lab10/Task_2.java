package ru.mirea.lab10;

import java.util.Scanner;

// Дано натуральное число n. Выведите все числа от 1 до n.

public class Task_2 {
    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Введите натуральное число больше нуля.");
        } else {
            printNumbers(n);
        }
    }
}
