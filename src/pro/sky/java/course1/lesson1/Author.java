package pro.sky.java.course1.lesson1;

public class Author {
    private String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }
    public Author getAuthorName() {
        return Author.createAuthor(this.authorName);
    }
    public static Author createAuthor(String authorName) {
        Author author = new Author(authorName);
        author.authorName = authorName;
        return author;
    }
}
