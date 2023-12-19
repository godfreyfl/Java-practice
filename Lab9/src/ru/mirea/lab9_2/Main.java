package ru.mirea.lab9_2;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Телефон", 599.99);
        Service service = new Service("Ремонт компьютера", 50.0);

        // Вывод цен для продукта и услуги
        System.out.println(product);
        System.out.println(service);
    }
}
