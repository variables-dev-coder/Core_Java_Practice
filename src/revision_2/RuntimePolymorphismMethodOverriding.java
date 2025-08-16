package revision_2;

/*
2. Runtime Polymorphism (Method Overriding)
Achieved by method overriding (same method name + parameters, but in different classes).
Resolved at runtime.
Example:

 */

class Animal5 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog5 extends Animal5 {
    @Override
    void sound() {
        System.out.println("Dog5 barks");
    }
}

class Cat5 extends Animal5 {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
public class RuntimePolymorphismMethodOverriding {
    public static void main(String[] args) {
        Animal5 a; // reference of parent

        a = new Dog5();
        a.sound();  // Dog's version

        a = new Cat5();
        a.sound();  // Cat's version
    }
}

/*
Dog barks
Cat meows


 */