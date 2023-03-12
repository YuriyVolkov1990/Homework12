package pro.sky.java.course1.lesson1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Михаил", "Булгаков");
        Author author1 = new Author("Лев", "Толстой");
        Book book = new Book("Мастер и Маргарита", author, 1932);
        Book book1 = new Book("Война и Мир", author1, 1850);
        System.out.println("Автор: ");
    }
}
