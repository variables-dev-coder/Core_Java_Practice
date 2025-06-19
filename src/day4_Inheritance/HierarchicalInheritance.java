package day4_Inheritance;


class Animal{
    void makeSound(){
        System.out.println("Animal is making Sound");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog Barking");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        a.makeSound();
        d.makeSound();
        c.makeSound();
    }
}
