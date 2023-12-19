package ru.mirea.lab1;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Pollianna", 2003);
        Book book2 = new Book("Waffle heart", 2005);
        Book book3 = new Book();

        book3.setTitle("Runing after the wind");
        book3.setYear(2003);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
