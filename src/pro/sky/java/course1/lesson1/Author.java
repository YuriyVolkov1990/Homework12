package pro.sky.java.course1.lesson1;

public class Author {
    private String authorName;
    private String authorSurname;
    public Author(String authorName,String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }
    public static Author createAuthor(String authorName, String authorSurname) {
        Author author = new Author(authorName, authorSurname);
        author.authorName = authorName;
        author.authorSurname = authorSurname;
        return author;
    }

}
