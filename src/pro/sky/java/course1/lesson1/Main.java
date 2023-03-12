package pro.sky.java.course1.lesson1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Имя автора:");
        String name = n.nextLine();
        Scanner s = new Scanner(System.in);
        System.out.println("Фамилия автора:");
        String surname = s.nextLine();
        Author author = Author.createAuthor(name, surname);
        Scanner b = new Scanner(System.in);
        System.out.println("Название книги:");
        String book = b.nextLine();
        Scanner y = new Scanner(System.in);
        System.out.println("Год публикации:");
        int year = y.nextInt();
        Book bookName = Book.createBook(book, year);
        System.out.println(author.getAuthorName() + " " + author.getAuthorSurname());
        System.out.println(bookName.getBookName());
        System.out.println(bookName.getYearPublishing());
    }
}
