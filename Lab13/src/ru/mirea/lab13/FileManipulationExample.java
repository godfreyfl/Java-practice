package ru.mirea.lab13;

import java.io.*;

public class FileManipulationExample {
    public static void main(String[] args) {
        try {
            // 1. Запись в файл введенной с клавиатуры информации
            writeToFile("sample.txt");

            // 2. Вывод информации из файла на экран
            readFromFile("sample.txt");

            // 3. Замена информации в файле на информацию, введенную с клавиатуры
            replaceInFile("sample.txt");
            readFromFile("sample.txt");

            // 4. Добавление в конец исходного файла текста, введенного с клавиатуры
            appendToFile("sample.txt");
            readFromFile("sample.txt");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Запись в файл
    public static void writeToFile(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Введите информацию для записи в файл. Для завершения введите \"exit\":");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input;
            while (!(input = reader.readLine()).equals("exit")) {
                writer.write(input);
                writer.newLine();
                writer.flush(); // Добавлен вызов flush
            }
        }
    }

    // Вывод информации из файла на экран
    public static void readFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)) ) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    // Замена информации в файле
    public static void replaceInFile(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false))) {
            System.out.println("Введите информацию для замены в файле. Для завершения введите \"exit\":");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input;
            while (!(input = reader.readLine()).equals("exit")) {
                writer.write(input);
                writer.newLine();
                writer.flush(); // Добавлен вызов flush
            }
        }
    }

    // Добавление в конец файла
    public static void appendToFile(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            System.out.println("Введите информацию для добавления в конец файла. Для завершения введите \"exit\":");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input;
            while (!(input = reader.readLine()).equals("exit")) {
                writer.write(input);
                writer.newLine();
                writer.flush(); // Добавлен вызов flush
            }
        }
    }
}


