package day3_ObjectConstructorMemory;

public class Box {

    int length, width, height;

    Box() {
        this(10, 10, 10);
        System.out.println("Box created with default size");
    }

    Box(int length, int width){
        this(length, width, 5);
        System.out.println("Box Created with L and W");
    }

    Box(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("Box Created With L, W, H");
    }

    void volume(){
        System.out.println("Volume = " + (length * width * height));
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        b1.volume();
    }
}
