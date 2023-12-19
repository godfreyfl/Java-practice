package ru.mirea.lab2;

public class Task_3 // Гармонический ряд
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++) {
            double harmonic = 1.0 / i;
            System.out.println("Число " + i + ": " + harmonic);
        }
    }
}

