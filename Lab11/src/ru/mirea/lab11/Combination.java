package ru.mirea.lab11;

import java.util.ArrayList;
import java.util.List;

public class Combination{
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Alice", 3));
        list1.add(new Student("Charlie", 1));
        list1.add(new Student("Eva", 2));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("David", 4));
        list2.add(new Student("Mike", 5));

        List<Student> mergedList = mergeSort(list1, list2);

        System.out.println("Объединенный и отсортированный список студентов: ");
        for (Student student : mergedList) { // Цикл for-each для вывода информации о студентах
            System.out.println(student);
        }
    }

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) { // Метод для объединения и сортировки двух списков студентов
        List<Student> mergedList = new ArrayList<>(); // Создание и инициализация нового списка студентов
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) { // Цикл while для сравнения элементов обоих списков
            Student student1 = list1.get(i); // Получение студента из list1
            Student student2 = list2.get(j); // Получение студента из list2

            if (student1.getIdNumber() < student2.getIdNumber()) { // Сравнение идентификационных номеров студентов
                mergedList.add(student1);
                i++;
            } else {
                mergedList.add(student2);
                j++;
            }
        }
        // Добавление оставшихся элементов из list1 (если есть)
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }
        // Добавление оставшихся элементов из list2 (если есть)
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList; // возвращение объединённого списка
    }
}
