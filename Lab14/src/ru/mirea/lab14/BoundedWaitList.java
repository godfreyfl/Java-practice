package ru.mirea.lab14;

import java.util.Collection;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;

    public BoundedWaitList(int capacity){ // Конструктор класса, принимающий на вход вместимость capacity
        if (capacity <= 0) System.out.println("Capacity must be more than 0!");
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }
    public BoundedWaitList(Collection<E> col){ // Конструктор класса, принимающий на вход коллекцию col
        this.capacity = col.size(); // Устанавливает вместимость очереди равной размеру переданной коллекции.
    }
    @Override
    public void add(E element) { // Добавляет элемент в очередь только если ее текущий размер не превышает установленную вместимость.
        if (content.size() == capacity) System.out.println("Queue full");
        content.add(element);
    }

    @Override
    public String toString(){
        return "BoundedWaitList capacity= "+capacity+", content= "+content;
    }
}
