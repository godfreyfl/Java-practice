package ru.mirea.lab10;

import java.util.Scanner;

/* Даны два целых числа A и В (каждое в отдельной строке). Выведите все
числа от A до B включительно, в порядке возрастания, если A < B, или в
порядке убывания в противном случае. */

public class Task_3 {
    public static void printRange(int a, int b) {
        if (a < b) {
            System.out.println(a);
            printRange(a + 1, b);
        } else if (a > b) {
            System.out.println(a);
            printRange(a - 1, b);
        } else {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число A: ");
        int a = scanner.nextInt();
        System.out.print("Введите целое число B: ");
        int b = scanner.nextInt();

        if (a < b) {
            printRange(a, b);
        } else if (a > b) {
            printRange(a, b);
        } else {
            System.out.println(a); // Если A равно B, просто вывести одно число.
        }
    }
}
