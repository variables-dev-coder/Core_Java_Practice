package day59_Packages_And_import;

import day59_Packages_And_import.library.*;

public class LibraryApp {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("Java Mastery", "Munna"));
        lib.addBook(new Book("Spring Boot Guide", "Aziz"));
        lib.showBooks();
    }
}

//Library Books:
//Java Mastery by Munna
//Spring Boot Guide by Aziz