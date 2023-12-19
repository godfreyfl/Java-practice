package ru.mirea.lab14;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedQueue<E> content;

    public WaitList(){ // Конструктор класса без параметров, который инициализирует пустую очередь.
        content = new ConcurrentLinkedQueue<>();
    }
    public WaitList(ConcurrentLinkedQueue<E> c){ // Конструктор, принимаюзий на вход очередь
        content = new ConcurrentLinkedQueue<>(c); // Создание новой очереди,копираванной из переданной
    }
    @Override
    public String toString(){
        return "WaitList content= "+content;
    }
    @Override
    public void add(E element) { // Метод добавления элемента в очередь.
        content.add(element);
    }
    @Override
    public E remove(){ // Метода удаления элемента из очереди
        if (isEmpty()) System.out.println("Queue null");
        return content.remove();
    }

    @Override
    public boolean contains(E element) { // Метода проверки наличия элемента в очереди.
        for (E item : content) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean containsAll(Collection<E> collection) { // Метода проверки наличия всех элементов из переданной коллекции в очереди
        for (E element : collection) {
            if (!content.contains(element)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isEmpty() { // Метода проверки пустоты очереди метода проверки пустоты очереди
        return content.isEmpty();
    }
}
