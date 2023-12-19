package ru.mirea.lab14;

import java.util.Iterator;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList(){
        super(); // Вызов конструктора родителского класса
    }
    public void remove(E element) { // Метод, который удаляет указанный элемент из очереди
        Iterator<E> iterator = content.iterator();
        while (iterator.hasNext()) {
            E current = iterator.next();
            if (current.equals(element)) {
                iterator.remove();
                return;
            }
        }
    }
    public void moveToBack(E element) { // Метод, который перемещает указанный элемент в конец очереди
        if (content.contains(element)) {
            content.remove(element);
            content.add(element);
        }
    }
}
