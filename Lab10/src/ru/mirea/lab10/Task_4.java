package ru.mirea.lab10;

import java.util.Scanner;

/* Дано натуральное число N. Вычислите сумму его цифр. При решении
этой задачи нельзя использовать строки, списки, массивы (ну и циклы,
разумеется). */

public class Task_4 {
    public static int sumOfDigits(int n) {
        if (n < 10) {
            // Если число меньше 10, оно состоит из одной цифры, и сумма равна самой цифре.
            return n;
        } else {
            // Рекурсивно вызываем функцию для суммы цифр оставшейся части числа и добавляем текущую цифру.
            return n % 10 + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число N: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Пожалуйста, введите натуральное число (больше или равное нулю).");
        } else {
            int sum = sumOfDigits(n);
            System.out.println("Сумма цифр числа " + n + " равна " + sum);
        }
    }

}
