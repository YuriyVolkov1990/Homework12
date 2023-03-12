package pro.sky.java.course1.lesson1;

public class Book {
    private String bookName;
    private Author authorName;
    private int yearPublishing;
    public Book(String bookName, Author authorName, int yearPublishing) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearPublishing = yearPublishing;

    }
    public String getBookName() {
        return bookName;
    }
    public int getYearPublishing() {
        return yearPublishing;
    }
    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}
