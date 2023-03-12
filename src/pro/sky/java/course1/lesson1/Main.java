package pro.sky.java.course1.lesson1;


public class Main {

    public static Author createAuthor(String authorName, String authorSurname) {
        Author author = new Author();
        author.authorName = authorName;
        author.authorSurname = authorSurname;
        return author;
    }
}
