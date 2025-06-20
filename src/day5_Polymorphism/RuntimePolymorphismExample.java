package day5_Polymorphism;


class Animal {
    void sound() {
        System.out.println("some generic animal sound");
    }
}

class Dog extends Animal {
    void sound(){
        System.out.println("Dog barking");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class RuntimePolymorphismExample {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
