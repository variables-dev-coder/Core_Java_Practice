package day1_basics;


class Vehicle2 {
    void start() {
        System.out.println("Vehicle starting...");
    }
}

public class OOPExample2 {
    public static void main(String[] args) {
        Vehicle2 v = new Vehicle2(); // Parent object
        v.start(); // Only Vehicle methods accessible
    }
}


/*
when parent class object created

-You just need the generic properties or behavior defined in the parent.
-You are not interested in any extra features of the child.
-You want to reuse a class as-is without specialization.

 */