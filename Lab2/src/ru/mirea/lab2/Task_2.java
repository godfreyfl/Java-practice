package ru.mirea.lab2;

public class Task_2 // аргументы командной строки
{
    public static void main(String[] args) {
        // Проверяем, есть ли аргументы командной строки
        if (args.length > 0) {
            System.out.println("Аргументы командной строки:");

            // Используем цикл for для перебора всех аргументов
            for (int i = 0; i < args.length; i++) {
                System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("Нет аргументов командной строки.");
        }
    }
}




