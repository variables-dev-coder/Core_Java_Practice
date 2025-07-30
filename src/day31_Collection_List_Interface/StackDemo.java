package day31_Collection_List_Interface;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        // Push elements
        books.push("Java");
        books.push("DSA");
        books.push("Spring Boot");

        System.out.println("Stack: " + books);

        // Peek top
        System.out.println("Top: " + books.peek());

        // Pop element
        String removed = books.pop();
        System.out.println("Popped: " + removed);

        // Search
        System.out.println("Position of 'Java': " + books.search("Java"));

        // Check if empty
        System.out.println("Is empty? " + books.empty());

        // Final stack
        System.out.println("Final Stack: " + books);
    }
}

/*

Stack: [Java, DSA, Spring Boot]
Top: Spring Boot
Popped: Spring Boot
Position of 'Java': 2
Is empty? false
Final Stack: [Java, DSA]

 */