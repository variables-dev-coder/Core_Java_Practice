package day3_ObjectConstructorMemory;


class Dog{
    String name;

    Dog(String name){
        this.name = name;
    }

    void bark(){
        System.out.println(name + " is barking!");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy");         // 'd' is reference in stack object in heap
        d.bark();
    }
}
