package day4_Inheritance;


class Shape {
    String color;

    Shape(String color){
        this.color = color;
        System.out.println("Parent class called");
    }

    void display(){
        System.out.println("Color: " + color);
    }
}

class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
        System.out.println("Child class Called");
    }

    void display(){
        super.display();
        System.out.println("Length: " + length + ", Width: " + width);
    }

}
public class ShapeConstructor {
    public static void main(String[] args) {
        Rectangle re = new Rectangle("Blue", 7, 8);
        re.display();
    }
}
