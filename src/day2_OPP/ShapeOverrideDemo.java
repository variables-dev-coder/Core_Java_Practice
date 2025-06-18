package day2_OPP;


// Create a class Shape with method area() and override it in Circle and Rectangle.

class Shape{
    void area(){
        System.out.println("Area of Shape");
    }
}

class Circle extends Shape {
    void area(){
        System.out.println("Area of Circle = πr²");
    }
}

class Rectangle extends Shape{
    void area(){
        System.out.println("Area of Rectangle = length * breadth");
    }
}
public class ShapeOverrideDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.area();
        s2.area();
    }
}
