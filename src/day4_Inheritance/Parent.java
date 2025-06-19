package day4_Inheritance;



class Parent1 {
    void sayHello(){
        System.out.println("Hello from Parent");
    }

    }

class Child1 extends Parent1{
    void sayHi(){
        System.out.println("Hi from Child");
    }
}

public class Parent {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.sayHi();
        c1.sayHello();

        // o/p both

       // Parent1 p1 = new Parent1();
      //  p1.sayHello();


    }
}
