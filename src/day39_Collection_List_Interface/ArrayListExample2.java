package day39_Collection_List_Interface;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Go");

        // Access elements by index
        System.out.println("First Language: " + languages.get(0));
        System.out.println("Third Language: " + languages.get(2));

        // Change element at specific index
        languages.set(1, "JavaScript");  // replace Python with JavaScript

        System.out.println("Update List: " + languages);
    }
}

/*
First Language: Java
Third Language: C++
Update List: [Java, JavaScript, C++, Go]

get(index) → read element by index
set(index, value) → update element at index


 */