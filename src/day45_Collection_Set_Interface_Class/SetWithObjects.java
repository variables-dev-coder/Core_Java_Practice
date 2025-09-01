package day45_Collection_Set_Interface_Class;

import java.util.*;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() { return "Student{" + "id=" + id + ", name='" + name + '\'' + '}'; }

    // THE WRONG WAY: Comment these two methods out and run the code below.
    // Duplicates will be allowed because the default hashCode() and equals()
    // use memory address, so each new object is considered unique.

    // THE RIGHT WAY: Uncomment these correctly overridden methods.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name); // Generates a hash code based on id and name
    }
}

public class SetWithObjects {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");
        Student s3 = new Student(1, "Alice"); // Duplicate of s1

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3); // Should be ignored if hashCode/equals are implemented.

        System.out.println("Students in set:");
        for (Student s : studentSet) {
            System.out.println("  " + s);
        }
        System.out.println("Size: " + studentSet.size()); // Should be 2 if implemented correctly, 3 if not.
    }
}

/*
Students in set:
  Student{id=2, name='Bob'}
  Student{id=1, name='Alice'}
Size: 2
 */