package revision;



// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    // Method Overloading (same name, different parameters)
    void sound(String mood) {
        if (mood.equalsIgnoreCase("happy")) {
            System.out.println("Dog barks happily");
        } else {
            System.out.println("Dog growls");
        }
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {

        // Runtime Polymorphism (method overriding)
        Animal myAnimal = new Dog(); // reference type: Animal, object type: Dog
        myAnimal.sound(); // Will call Dog's overridden sound()

        // Compile-time Polymorphism (method overloading)
        Dog myDog = new Dog();
        myDog.sound("happy");
        myDog.sound("angry");
    }
}

/*
Dog barks
Dog barks happily
Dog growls
 */