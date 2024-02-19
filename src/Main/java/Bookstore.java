package Main.java;

import java.util.Arrays;

public class Bookstore {
    private  Book[] books;
    private int numberOfBooks;

    // Constructor
    public Bookstore() {
        this.books = new Book[10];
        this.numberOfBooks = 0;
    }

    // Getter methods
    public Book[] getBooks() {
        return this.books;
    }

    public int getBookAmount() {
        return this.numberOfBooks;
    }

    public void addBook(Book newBook) {
        if (numberOfBooks == books.length) {
            int newCapacity = books.length * 2;
            books = Arrays.copyOf(books, newCapacity);
        }

        books[numberOfBooks] = newBook;
        numberOfBooks++;
    }

    public Book[] booksByAuthor(String author) {
        int count = 0;
        for (Book book : books) {
            if (book != null && book.getAuthor().equals(author)) {
                count++;
            }
        }

        Book[] booksByAuthor = new Book[count];
        int i = 0;
        for (Book book : books) {
            if (book != null && book.getAuthor().equals(author)) {
                booksByAuthor[i] = book;
                i++;
            }
        }
        return booksByAuthor;
    }

    public Book[] shortBooks() {
        int pages = 100;
        int count = 0;
        for (Book book : books) {
            if (book != null && book.getPages() < pages) {
                count++;
            }
        }

        Book[] shortBooks = new Book[count];
        int i = 0;
        for (Book book : books) {
            if (book != null && book.getPages() < 100) {
                shortBooks[i] = book;
                i++;
            }
        }
        return shortBooks;
    }

}
