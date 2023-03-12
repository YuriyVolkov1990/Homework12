package pro.sky.java.course1.lesson1;

public class Book {
    private String bookName;
    private Author createAuthor;
    private int yearPublishing;
    public Book(String bookName, Author createAuthor, int yearPublishing) {
        this.bookName = bookName;
        this.createAuthor = createAuthor;
        this.yearPublishing = yearPublishing;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getCreateAuthor() {
        return createAuthor;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setCreateAuthor(Author createAuthor) {
        this.createAuthor = createAuthor;
    }
    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
    public static Book createBook(String bookName, Author createAuthor, int yearPublishing) {
        Book book = new Book(bookName, createAuthor, yearPublishing);
        book.bookName = bookName;
        book.createAuthor = createAuthor;
        book.yearPublishing = yearPublishing;
        return book;
    }
}
