package pro.sky.java.course1.lesson1;

public class Author {
    private String authorName;
    private String authorSurname;
    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    public String getAuthorName() {
        return authorName;
    }
    public String getAuthorSurname() {
        return authorSurname;
    }
}
