package revision_1;


// Abstract Class and Interface


abstract class Shape {
    abstract void draw();  // abstract method

    void color() {
        System.out.println("Default color: Black");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document...");
    }
}

public class Main6 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.color();

        Document d = new Document();
        d.print();
    }
}

