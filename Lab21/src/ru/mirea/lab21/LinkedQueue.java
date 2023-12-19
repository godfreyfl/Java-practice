package ru.mirea.lab21;

// Объявление класса LinkedQueue, расширяющего AbstractQueue
public class LinkedQueue extends AbstractQueue {
    // Приватные поля класса - голова и хвост связанной очереди
    private Node head;
    private Node tail;

    // Конструктор класса, инициализирующий голову и хвост как null
    public LinkedQueue() {
        head = null;
        tail = null;
    }

    // Реализация метода enqueue для добавления элемента в конец очереди
    @Override
    public void enqueue(Object element) {
        // Создание нового узла
        Node newNode = new Node(element);
        // Проверка, пуста ли очередь
        if (isEmpty()) {
            // Если пуста, устанавливаем голову и хвост равными новому узлу
            head = newNode;
            tail = newNode;
        } else {
            // Иначе добавляем новый узел в конец очереди и обновляем хвост
            tail.next = newNode;
            tail = newNode;
        }
        // Увеличение размера очереди
        size++;
    }

    // Реализация метода dequeue для удаления и возврата элемента из начала очереди
    @Override
    public Object dequeue() {
        // Проверка, пуста ли очередь
        if (isEmpty()) {
            // Если пуста, выбрасываем исключение
            throw new IllegalStateException("Queue is empty");
        }
        // Сохранение значения элемента в начале очереди
        Object element = head.value;
        // Сдвиг головы на следующий элемент
        head = head.next;
        // Уменьшение размера очереди
        size--;
        // Если очередь стала пустой, обновляем хвост
        if (isEmpty()) {
            tail = null;
        }
        // Возвращение удаленного элемента
        return element;
    }

    // Реализация метода element для возврата элемента из начала очереди без удаления
    @Override
    public Object element() {
        // Проверка, пуста ли очередь
        if (isEmpty()) {
            // Если пуста, выбрасываем исключение
            throw new IllegalStateException("Queue is empty");
        }
        // Возвращение значения элемента в начале очереди
        return head.value;
    }

    // Реализация метода size для возврата размера очереди
    @Override
    public int size() {
        return size;
    }

    // Реализация метода isEmpty для проверки, пуста ли очередь
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Реализация метода clear для очистки очереди
    @Override
    public void clear() {
        // Обнуление головы, хвоста и размера
        head = null;
        tail = null;
        size = 0;
    }
}
