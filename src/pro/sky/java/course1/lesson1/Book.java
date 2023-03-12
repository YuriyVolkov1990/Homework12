package pro.sky.java.course1.lesson1;

public class Book {
    private String bookName;
    private int yearPublishing;
    public Book(String bookName, int yearPublishing) {
        this.bookName = bookName;
        this.yearPublishing = yearPublishing;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
    public static Book createBook(String bookName, int yearPublishing) {
        Book book = new Book(bookName, yearPublishing);
        book.bookName = bookName;
        book.yearPublishing = yearPublishing;
        return book;
    }
}
