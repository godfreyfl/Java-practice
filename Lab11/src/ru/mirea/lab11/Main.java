package ru.mirea.lab11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] iDNumber = {
                new Student("Alice", 105),
                new Student("Charlie", 121),
                new Student("Mike", 95),
                new Student("Eva", 112),
                new Student("David", 91)
        };
        System.out.println("Before: ");
        for (Student student: iDNumber){ // Цикл for-each для вывода информации о студентах до сортировки
            System.out.println(student);
        }

        insertSort(iDNumber);
        // Arrays.sort(iDNumber, new SortingStudentsByGPA());

        System.out.println("\nAfter: ");
        for (Student student: iDNumber){
            System.out.println(student);
        }
    }

    public static void insertSort(Student[] arr) { // Метод сортировки вставками
        for (int i = 1; i < arr.length; i++){
            Student tmp = arr[i]; // Временная переменная для хранения текущего элемента массива
            int j = i - 1;

            while (j >= 0 && arr[j].getIdNumber() > tmp.getIdNumber()){ // Цикл while для сравнения элементов массива и их перемещения
                arr[j + 1] = arr[j]; // Перемещение элемента вправо
                j = j - 1;
            }
            arr[j + 1] = tmp; // Вставка временной переменной на правильное место в отсортированной части массива
        }
    }
}
