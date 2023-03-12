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
        return this.bookName;
    }

    public Author getCreateAuthor() {
        return this.createAuthor;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }
    public static Book createBook(String bookName, Author authorName, int yearPublishing) {
        Book book = new Book();
        book.bookName = bookName;
        book.createAuthor = authorName;
        book.yearPublishing = yearPublishing;
        return book;
    }
}
