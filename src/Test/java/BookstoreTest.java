import Main.java.Book;
import Main.java.Bookstore;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BookstoreTest {

    @Test
    public void testAddBook() {
        // Arrange
        Bookstore bookstore = new Bookstore();
        Book book = new Book("Sample Title", "Sample Author", 200, 2022);

        // Act
        bookstore.addBook(book);

        // Assert
        assertEquals(1, bookstore.getBookAmount());
        assertEquals(book, bookstore.getBooks()[0]);
    }

    @Test
    public void testBooksByAuthor() {
        // Arrange
        Bookstore bookstore = new Bookstore();
        Book book1 = new Book("Title1", "Author1", 200, 2022);
        Book book2 = new Book("Title2", "Author2", 150, 2021);
        Book book3 = new Book("Title3", "Author1", 180, 2020);

        bookstore.addBook(book1);
        bookstore.addBook(book2);
        bookstore.addBook(book3);

        // Act
        Book[] booksByAuthor = bookstore.booksByAuthor("Author1");

        // Assert
        assertEquals(2, booksByAuthor.length);
        assertTrue(Arrays.asList(booksByAuthor).contains(book1));
        assertTrue(Arrays.asList(booksByAuthor).contains(book3));
    }

    @Test
    public void testShortBooks() {
        // Arrange
        Bookstore bookstore = new Bookstore();
        Book book1 = new Book("Title1", "Author1", 200, 2022);
        Book book2 = new Book("Title2", "Author2", 80, 2021);
        Book book3 = new Book("Title3", "Author3", 120, 2020);

        bookstore.addBook(book1);
        bookstore.addBook(book2);
        bookstore.addBook(book3);

        // Act
        Book[] shortBooks = bookstore.shortBooks();

        // Assert
        assertEquals(1, shortBooks.length);
        assertTrue(Arrays.asList(shortBooks).contains(book2));
    }
}
