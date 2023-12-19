package ru.mirea.lab2;

import java.util.Arrays;
import java.util.Random;

public class Task_4 // Отсортированный рандомный массив
{
    public static void main(String[] args)
    {
        // Генерируем массив случайных чисел
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = random.nextInt(100); // Генерируем случайное число от 0 до 99
        }

        System.out.println("Неотсортированный массив: " + Arrays.toString(numbers));

        // Сортируем массив
        Arrays.sort(numbers);

        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));
    }
}

