package ru.mirea.lab23;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;

    public Order() {
        this.items = new ArrayList<>(); // Конструктор класса Order, инициализирующий список items новым объектом ArrayList
    }
    // Метод для добавления товара в заказ
    public boolean addItem(Item item) {
        items.add(item);
        return true;
    }

    // Метод для удаления товара из заказа
    public void removeItem(Item item) {
        items.remove(item);
    }

    // Метод для получения списка товаров в заказе
    public List<Item> getItems() {
        return items;
    }
}
