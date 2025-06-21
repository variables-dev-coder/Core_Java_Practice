package day6_Abstraction;


interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();   // Drawing Circle
    }
}
