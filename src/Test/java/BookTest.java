import Main.java.Book;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testBookConstructorAndGetterMethods() {
        // Arrange
        String title = "Sample Title";
        String author = "Sample Author";
        int pages = 200;
        int publicationYear = 2022;

        // Act
        Book book = new Book(title, author, pages, publicationYear);

        // Assert
        assertEquals(title, book.getTitle());
        assertEquals(author, book.getAuthor());
        assertEquals(pages, book.getPages());
        assertEquals(publicationYear, book.getPublicationYear());
    }

    @Test
    public void testSetterMethods() {
        // Arrange
        Book book = new Book("Initial Title", "Initial Author", 100, 2000);

        // Act
        book.setTitle("New Title");
        book.setAuthor("New Author");
        book.setPages(150);
        book.setPublicationYear(2021);

        // Assert
        assertEquals("New Title", book.getTitle());
        assertEquals("New Author", book.getAuthor());
        assertEquals(150, book.getPages());
        assertEquals(2021, book.getPublicationYear());
    }

    @Test
    public void testToStringMethod() {
        // Arrange
        Book book = new Book("Sample Title", "Sample Author", 200, 2022);

        // Act
        String result = book.toString();

        // Assert
        assertTrue(result.contains("Sample Title"));
        assertTrue(result.contains("Sample Author"));
        assertTrue(result.contains("200"));
        assertTrue(result.contains("2022"));
    }
}
