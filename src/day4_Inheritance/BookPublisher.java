package day4_Inheritance;


class Publisher {
    String publisherName;

    Publisher(String publisherName) {
        this.publisherName = publisherName;
        System.out.println("Parent class called");
    }

    void display(){
        System.out.println("Publisher Name: " + publisherName);
    }
}

class Book extends Publisher {
    String bookName;
    int price;

    Book(String publisherName, String bookName, int price) {
        super(publisherName);
        this.bookName = bookName;
        this.price = price;
        System.out.println("Child class Called");
    }

    void display(){

        //System.out.println("Publisher Name: " + publisherName);  // Publisher Name: Person
        super.display();   // Publisher Name: Person
        System.out.println("Book Name: " + bookName);
        System.out.println("Price: " + price);
    }
}
public class BookPublisher {
    public static void main(String[] args) {
        Book b = new Book("Person", "Java", 599);
        b.display();
    }
}
