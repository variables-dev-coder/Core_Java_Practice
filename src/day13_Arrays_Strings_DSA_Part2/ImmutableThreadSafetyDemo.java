package day13_Arrays_Strings_DSA_Part2;


//Immutable Person Class (Thread-Safe)
//Because the object’s state cannot change after creation, multiple threads
// can safely share the same object without synchronization.

// Immutable Person class

final class Person4 {
    private final String name;
    private final int age;

    public Person4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters only
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class ImmutableThreadSafetyDemo {
    public static void main(String[] args) {
        Person4 person = new Person4("Alice", 30);

        // Multiple threads reading the same immutable object
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() +
                    " -> Name: " + person.getName() +
                    ", Age: " + person.getAge());
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();
    }
}

//Thread 2 -> Name: Alice, Age: 30
//Thread 1 -> Name: Alice, Age: 30


/*
Why Thread-Safe?
No setters → state never changes.
All fields final → visible consistently to all threads after construction.
No need for locks.
 */