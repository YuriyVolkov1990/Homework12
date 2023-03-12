package pro.sky.java.course1.lesson1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Михаил", "Булгаков");
        Author author1 = new Author("Лев", "Толстой");
        Book book = new Book("Мастер и Маргарита", author, 1932);
        Book book1 = new Book("Война и Мир", author1, 1850);
        System.out.println("Автор: " + author.getAuthorName() + " " + author.getAuthorSurname());
        System.out.println("Книга: " + book.getBookName());
        System.out.println("Год публикации: " + book.getYearPublishing());
        System.out.println("Автор: " + author1.getAuthorName() + " " + author1.getAuthorSurname());
        System.out.println("Книга: " + book1.getBookName());
        System.out.println("Год публикации: " + book1.getYearPublishing());
        book.setYearPublishing(2023);
        System.out.println("Новый год публикации: " + book.getYearPublishing());
    }
}
