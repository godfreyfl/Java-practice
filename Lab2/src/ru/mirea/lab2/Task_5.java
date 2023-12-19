package ru.mirea.lab2;

public class Task_5 // Факториал
{
    public static void main(String[] args)
    {
        int number = 5;
        long result = factorial(number);
        System.out.println("Факториал " + number + " = " + result);
    }

    // Метод для вычисления факториала числа с использованием цикла
    public static long factorial(int n)
    {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        }

        long fact = 1;
        for (int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        return fact;
    }
}

