package ru.mirea.lab23;

public class InternetOrder {

    // Приватный внутренний класс ListNode, представляющий узел списка товаров
    private class ListNode {
        private Item item;          // Товар, хранящийся в узле
        private ListNode next;      // Ссылка на следующий узел
        private ListNode previous;  // Ссылка на предыдущий узел

        public ListNode(Item item) {
            this.item = item;
            this.next = null;
            this.previous = null;
        }
    }

    private ListNode head;  // Голова списка, указывающая на первый элемент
    private int size;

    public InternetOrder() {
        this.head = new ListNode(null); // Пустой список
        this.head.next = this.head;
        this.head.previous = this.head;
        this.size = 0;
    }

    public InternetOrder(Item[] items) {
        this();  // Вызов конструктора по умолчанию для инициализации пустого списка
        for (Item item : items)
            addPosition(item);
    }

    // Метод для добавления товара в конец списка
    // Принимает объект типа Item в качестве параметра
    // Создает новый узел и добавляет его в конец списка
    public boolean addPosition(Item item) {
        ListNode newNode = new ListNode(item);
        newNode.next = head;
        newNode.previous = head.previous;
        head.previous.next = newNode;
        head.previous = newNode;
        size++;
        return true;
    }

    // Метод для удаления товара по имени из списка
    // Принимает имя товара в качестве параметра
    // Перебирает список, находит первый узел с соответствующим именем и удаляет его
    public boolean removePositionByName(String name) {
        ListNode node = head.previous;
        while (node != head) {
            if (node.item.getName().equals(name)) {
                node.previous.next = node.next;
                node.next.previous = node.previous;
                size--;
                return true;
            }
            node = node.previous;
        }
        return false;
    }

    // Метод для удаления всех товаров с заданным именем из списка
    // Принимает имя товара в качестве параметра
    // Перебирает список, удаляет все узлы с соответствующим именем и возвращает их количество
    public int removeAllPositionsByName(String name) {
        int count = 0;
        ListNode node = head.previous;
        while (node != head) {
            if (node.item.getName().equals(name)) {
                node.previous.next = node.next;
                node.next.previous = node.previous;
                count++;
                size--;
            }
            node = node.previous;
        }
        return count;
    }

    // Метод для получения массива всех товаров в списке
    // Создает массив нужного размера, заполняет его товарами из списка и возвращает его
    public Item[] getPositions() {
        Item[] positions = new Item[size];
        ListNode node = head.next;
        int index = 0;
        while (node != head) {
            positions[index++] = node.item;
            node = node.next;
        }
        return positions;
    }
}
