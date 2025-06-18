package day2_OPP;


class Animal2{
    final void sound(){
        System.out.println("Animal make Sound");
    }
}

// Uncommenting below will give compile-time error
// class Dog2 extends Animal {
 //   void sound() {
 //        System.out.println("Dog barks"); // X Can't override final method
 //    }
// }

public class FinalMethodDemo {
    public static void main(String[] args) {
       Animal a1 = new Animal();
       a1.sound();  // Animal make Sound

    }
}
