package ru.mirea.lab3;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Иванов Иван", "ivan@example.com", 'M');

        System.out.println("Информация об авторе:");
        System.out.println(author);

        System.out.println("Имя автора: " + author.getName());
        System.out.println("Email автора: " + author.getEmail());
        System.out.println("Пол автора: " + author.getGender());

        author.setEmail("newemail@example.com");
        System.out.println("Новый email автора: " + author.getEmail());
    }
}
