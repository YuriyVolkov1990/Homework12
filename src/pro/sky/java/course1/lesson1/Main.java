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
        Author book = Author.createAuthor(name, surname);
    }
}
