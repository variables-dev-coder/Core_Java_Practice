package revision_1;

// this and super

class Animal {
    String type = "Animal";

    Animal() {
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {
    String type = "Dog";

    Dog() {
        super();    // Calls Animal's Constructor
        System.out.println("Dog Constructor");
        System.out.println("Parent type: " + super.type);      // Access parent variable
    }
}

public class Main3 {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
