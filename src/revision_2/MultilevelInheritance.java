package revision_2;

/*
(b) Multilevel Inheritance

Grandparent → Parent → Child.
Example:

 */

class Animal2 {
    void eat() { System.out.println("Animal2 eats"); }
}

class Dog2 extends Animal2 {
    void bark() { System.out.println("Dog2 barks"); }
}

class Puppy2 extends Dog2 {
    void weep() { System.out.println("Puppy2 weeps"); }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy2 p = new Puppy2();
        p.eat();  // from Animal
        p.bark(); // from Dog
        p.weep(); // from Puppy
    }
}

/*
Animal eats
Dog barks
Puppy weeps

 */