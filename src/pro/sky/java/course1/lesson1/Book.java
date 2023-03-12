package pro.sky.java.course1.lesson1;

public class Book {
    String bookName;
    Author createAuthor;
    int yearPublishing;

    public static Book createBook(String bookName, Author authorName, int yearPublishing) {
        Book book = new Book();
        book.bookName = bookName;
        book.createAuthor = authorName;
        book.yearPublishing = yearPublishing;
        return book;
    }
}
