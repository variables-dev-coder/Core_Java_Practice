package revision_2;

/*
Inheritance

Inheritance is when one class (child/derived) acquires properties and behaviors of another class (parent/base).
It allows code reusability and method overriding.

Syntax:
class Parent {
   // fields & methods
}

class Child extends Parent {
   // extra fields & methods
}


 */
class Animal1 {
    void eat() {
        System.out.println("Animal1 eats food");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.eat();  // from parent
        d.bark(); // from child
    }
}

/*
Animal eats food
Dog barks

 */