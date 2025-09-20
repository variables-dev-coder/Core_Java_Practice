package day60_Java_Memory_Model;


// StackOverflowError Example

public class StackOverflowDemo {
    static void recursive() {
        recursive(); // infinite recursion
    }

    public static void main(String[] args) {
        recursive(); // will throw StackOverflowError
    }
}
