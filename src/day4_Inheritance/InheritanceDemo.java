package day4_Inheritance;

class Person{
    void sayHi(){
        System.out.println("Hi I'm Munna");
    }
}

class Child extends Person{
    void sayHello(){
        System.out.println("Hello I'm Aziz");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        Child c1 = new Child();
        c1.sayHi();       // Hi I'm Munna
        c1.sayHello();    // Hello I'm Aziz

        /*

        Person p1 = new Person();
        p1.sayHi();
        p1.sayHello();  // Cannot resolve method 'sayHello' in 'Person'

         */

    }
}
