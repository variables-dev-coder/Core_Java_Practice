package day2_OPP;


class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal a = new Animal();   // Parent reference to parent object
        a.sound();                 // Animal makes a sound

        Animal b = new Dog();   // Parent reference to child object
        b.sound();                 // Dog barks (overridden method)
    }
}
