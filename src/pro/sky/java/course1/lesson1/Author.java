package pro.sky.java.course1.lesson1;

public class Author {
    private String authorName;
    private String authorSurname;
    public Author() {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }


    public static Author createAuthor(String authorName, String authorSurname) {
        Author author = new Author();
        author.authorName = authorName;
        author.authorSurname = authorSurname;
        return author;
    }

}
