package day2_OPP;


class Demo{
    private int a = 10;
    int b = 20;
    protected int c = 30;
    public int d = 40;

    // inside class

    void show(){
        System.out.println("Private: " + a);
        System.out.println("Default: " + b);
        System.out.println("Protected: " + c);
        System.out.println("Public: " + d);
    }
}
public class AccessModifierDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();

        // Outside class
        // Inside package
        
        //System.out.println(obj.a); // private
        System.out.println("Default: " + obj.b);
        System.out.println("Protected: " + obj.c);
        System.out.println("Public: " + obj.d);

    }
}
