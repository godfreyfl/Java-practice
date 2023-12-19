package ru.mirea.lab19;

import java.util.List;
import java.util.ArrayList;

public class ArrayConverter {
    private Object[] array;

    public ArrayConverter(Object[] array) {
        this.array = array;
    }

    // Метод для получения элемента массива по индексу
    public Object getElementAtIndex(int index) {
        // Проверка, что индекс находится в пределах массива
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
    }

    // Метод для конвертации массива в список
    public List<Object> convertArrayToList() {
        List<Object> list = new ArrayList<>();
        for (Object element : array) {
            list.add(element);
        }
        return list;
    }

    // Метод для вывода первых пяти элементов списка
    public void printFirstFiveElements(List<Object> list) {
        System.out.println("First 5 elements of the list:");
        for (int i = 0; i < 5 && i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {

        // Создание экземпляра ArrayConverter с массивом чисел
        Integer[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayConverter converter = new ArrayConverter(numbersArray);

        // Вывод элемента массива по индексу
        int indexToRetrieve = 3;
        System.out.println("Element at index " + indexToRetrieve + ": " + converter.getElementAtIndex(indexToRetrieve));

        // Создание экземпляра ArrayConverter с массивом строк
        String[] stringArray = {"Apple", "Banana", "Orange", "Grapes", "Watermelon", "Pineapple"};
        ArrayConverter stringConverter = new ArrayConverter(stringArray);

        // Преобразование массива строк в список
        List<Object> stringList = stringConverter.convertArrayToList();

        // Вывод первых 5 элементов списка
        stringConverter.printFirstFiveElements(stringList);
    }
}
