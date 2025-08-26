package day41_Collection_Vector_Legacy_Class;


//Sort a Vector of Custom Objects
//Concept: Use Comparable or Comparator.


import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.name.compareTo(s.name); // sort by name
    }

    public String toString() {
        return id + " - " + name;
    }
}


public class VectorSortCustom {
    public static void main(String[] args) {
        Vector<Student> vector = new Vector<>();
        vector.add(new Student(2, "John"));
        vector.add(new Student(1, "Alice"));
        vector.add(new Student(3, "Bob"));

        Collections.sort(vector);

        System.out.println("Sorted Vector: " + vector);
    }
}

//Sorted Vector: [1 - Alice, 3 - Bob, 2 - John]