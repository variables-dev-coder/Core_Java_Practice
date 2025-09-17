package day59_Packages_And_import.library;

import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) { books.add(book); }
    public void showBooks() {
        System.out.println("Library Books:");
        for (Book b : books) System.out.println(b);
    }
}
