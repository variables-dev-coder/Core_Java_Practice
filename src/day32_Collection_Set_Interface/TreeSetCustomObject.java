package day32_Collection_Set_Interface;


import java.util.Comparator;
import java.util.TreeSet;

class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // For readable output
    public String toString() {
        return id + " - " + name + " - " + age;
    }
}

public class TreeSetCustomObject {

    public static void main(String[] args) {
        // Custom Comparator to sort by age
        Comparator<Student> ageComparator = (s1, s2) -> {
            return Integer.compare(s1.age, s2.age);
        };

        TreeSet<Student> studentSet = new TreeSet<>(ageComparator);

        studentSet.add(new Student(1, "Munna", 23));
        studentSet.add(new Student(2, "Amit", 20));
        studentSet.add(new Student(3, "Riya", 21));
        studentSet.add(new Student(4, "Amit", 20)); // Duplicate based on Comparator (age), won't be added

        for (Student s : studentSet) {
            System.out.println(s);
        }
    }
}

/*
2 - Amit - 20
3 - Riya - 21
1 - Munna - 23

 */