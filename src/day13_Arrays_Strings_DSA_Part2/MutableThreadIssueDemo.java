package day13_Arrays_Strings_DSA_Part2;


// Mutable Person Class (Not Thread-Safe)
//If the class is mutable, two threads can interfere with each other’s reads/writes.

// Mutable Person class
class MutablePerson {
    private String name;
    private int age;

    public MutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter allows modification
    public void setAge(int age) {
        this.age = age;
    }
}

public class MutableThreadIssueDemo {

    public static void main(String[] args) {
        MutablePerson person = new MutablePerson("Bob", 25);

        Runnable writer = () -> {
            for (int i = 0; i < 5; i++) {
                person.setAge(person.getAge() + 1);
                System.out.println(Thread.currentThread().getName() +
                        " updated age to " + person.getAge());
            }
        };

        Runnable reader = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() +
                        " reads age " + person.getAge());
            }
        };

        Thread t1 = new Thread(writer, "Writer Thread");
        Thread t2 = new Thread(reader, "Reader Thread");

        t1.start();
        t2.start();
    }
}





/*

Writer Thread updated age to 26
Writer Thread updated age to 27
Reader Thread reads age 26
Writer Thread updated age to 28
Writer Thread updated age to 29
Writer Thread updated age to 30
Reader Thread reads age 30
Reader Thread reads age 30
Reader Thread reads age 30
Reader Thread reads age 30

 */


/*
Possible Issues:
-Race conditions: multiple threads updating the same variable at the same time.
-Inconsistent reads: one thread may see partial or stale values.
-Requires synchronized or other concurrency controls to be safe.
 */

