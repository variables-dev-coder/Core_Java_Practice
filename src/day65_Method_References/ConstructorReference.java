package day65_Method_References;

// Constructor Reference (no-args constructor)

import java.util.function.Supplier;

class Person {
    String name;

    Person() {
        this.name = "Default Person";
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        // Constructor reference
        Supplier<Person> personSupplier = Person::new;

        Person p = personSupplier.get();
        System.out.println(p); // Person{name='Default Person'}
    }
}

// Person{name='Default Person'}