package day3_ObjectConstructorMemory;

public class Book2 {
    String title;
    double price;
    Author author; // HAS-A relation

    Book2(String title, double price, Author author){
        this.title = title;
        this.price = price;
        this.author = author;
    }

    void displayBook2(){
        System.out.println("Title: " + title + ", Price: ₹" + price);
        author.displayAuthor();   // calling method of Author class
    }

    public static void main(String[] args) {
        Author a1 = new Author("Munna", "munna@gmail.com");
        Book2 b2 = new Book2("Java Mastery", 799, a1);

        b2.displayBook2();
    }
}
