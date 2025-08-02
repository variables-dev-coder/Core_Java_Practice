package revision_1;


// Constructor, Constructor Overloading, Chaining

//A constructor initializes objects.
//Same name as class, no return type.
//Overloading: multiple constructors with different parameters.
//Chaining: one constructor calling another using this().

class Book {
    String title;
    int price;

    Book() {
        this("Java", 499);   // Chaining to parameterized constructor
    }

    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println(title + ": ₹" + price);
    }
}

public class Main2 {
    public static void main(String[] args) {

        Book b1 = new Book();   // Default Constructor
        Book b2 = new Book("DSA", 799);   // Parameterized
        b1.display();
        b2.display();

    }
}
