package day5_Polymorphism;



class AreaCalculator {

    // Area of Square
    int calculateArea(int side) {
        return side * side;
    }

    // Area of Rectangle
    int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    // Area of Circle
    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    // Area of triangle
    float calculateArea(float base, float height) {
        return 0.5f * base * height;
    }
}
public class Overloading_AreaCalculator {
    public static void main(String[] args) {

        AreaCalculator ac = new AreaCalculator();

        System.out.println("Area of Square: " + ac.calculateArea(5));
        System.out.println("Area of Rectangle: " + ac.calculateArea(4, 5));
        System.out.println("Area of Circle: " + ac.calculateArea(5.0));
        System.out.println("Area of Triangle: " + ac.calculateArea(6.0f, 4.3f));

    }
}
