package day3_ObjectConstructorMemory;

public class Book {
    String title;

    Book(String title){
        this.title = title; // Resolve conflict between parameter and field
    }

    void show(){
        System.out.println("Title: " + title);
    }
    public static void main(String[] args) {
        Book b = new Book("java");
        b.show();

    }
}
