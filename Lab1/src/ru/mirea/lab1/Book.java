package ru.mirea.lab1;

public class Book {
    private String title;
    private int year;

    public Book(String t, int y) {
        title = t;
        year = y;
    }

    public Book(String t) {
        title = t;
        year = 0;
    }

    public Book() {
        title = "Unknown";
        year = 0;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle(String title) {
        return title;
    }

    public int getYear(int year) {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" + "title = '" + title + '\'' + ", year = " + year + '}';
    }
}
