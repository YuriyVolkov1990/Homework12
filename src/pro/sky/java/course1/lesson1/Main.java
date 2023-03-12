package pro.sky.java.course1.lesson1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите имя и фамилию автора");
        String name = n.nextLine();
        Author author = Author.createAuthor(name);
        Scanner b = new Scanner(System.in);
        System.out.println("Название книги:");
        String book = b.nextLine();
        Scanner y = new Scanner(System.in);
        System.out.println("Год публикации:");
        int year = y.nextInt();
        Book bookName = Book.createBook(book, author, year);
        System.out.println(author.getAuthorName());
        System.out.println(bookName.getBookName());
        System.out.println(bookName.getYearPublishing());
        System.out.println("Хотите изменить год публикации книги? Нажмите Y если да, N если нет");

    }
}
