package day48_Collection_Map_Interface;



import java.util.*;

// Book class
class Book {
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // new books are available
    }

    @Override
    public String toString() {
        return bookId + " → " + title + " by " + author + " | " +
                (isAvailable ? "Available" : "Borrowed");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Map<Integer, Book> library = new HashMap<>();

        // Add books
        library.put(101, new Book(101, "Java Programming", "James Gosling"));
        library.put(102, new Book(102, "Effective Java", "Joshua Bloch"));
        library.put(103, new Book(103, "Clean Code", "Robert C. Martin"));

        // Display all books
        System.out.println("Library Collection:");
        for (Book b : library.values()) {
            System.out.println(b);
        }

        // Borrow a book
        Book book = library.get(102);
        if (book.isAvailable) {
            book.isAvailable = false;
            System.out.println("\nBorrowed: " + book.title);
        } else {
            System.out.println("Book already borrowed!");
        }

        // Return book
        book.isAvailable = true;
        System.out.println("\nReturned: " + book.title);

        // Remove a book
        library.remove(103);
        System.out.println("\nAfter removing Clean Code:");
        for (Book b : library.values()) {
            System.out.println(b);
        }
    }
}


/*
Library Collection:
101 → Java Programming by James Gosling | Available
102 → Effective Java by Joshua Bloch | Available
103 → Clean Code by Robert C. Martin | Available

Borrowed: Effective Java

Returned: Effective Java

After removing Clean Code:
101 → Java Programming by James Gosling | Available
102 → Effective Java by Joshua Bloch | Available



Logic:
Create a Book class with bookId, title, author, isAvailable.
Use HashMap<Integer, Book> → Key = Book ID, Value = Book object.
Operations:
Add new book
Borrow book (mark unavailable)
Return book (mark available)
Display all books
Remove a book

 */