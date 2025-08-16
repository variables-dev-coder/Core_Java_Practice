package revision_2;


/*
(c) Hierarchical Inheritance

One parent → multiple children.
Example:


 */

class Animal3 {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Dog3 barks");
    }
}

class Cat3 extends Animal3 {
    void meow() {
        System.out.println("Cat3 meows");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        Cat3 c = new Cat3();
        d.eat(); d.bark();
        c.eat(); c.meow();
    }
}

/*
Animal eats
Dog barks
Animal eats
Cat meows

 */