package ru.mirea.lab21;

// Объявление интерфейса Queue, представляющего базовые методы для работы с очередью
public interface Queue {
    // Метод для добавления элемента в очередь
    void enqueue(Object element);

    // Метод для удаления и возврата элемента из начала очереди
    Object dequeue();

    // Метод для возврата элемента из начала очереди без его удаления
    Object element();

    // Метод для возврата размера очереди
    int size();

    // Метод для проверки, пуста ли очередь
    boolean isEmpty();

    // Метод для очистки очереди
    void clear();
}
