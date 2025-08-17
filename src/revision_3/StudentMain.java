package revision_3;

/*
Object Class Methods

Every class in Java implicitly extends the Object class.
Important methods:

toString() → Gives string representation of object.
equals(Object obj) → Compares objects logically (instead of memory reference).
hashCode() → Returns integer hash for object (used in HashMap, HashSet, etc.).
 */


class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return id == s.id && name.equals(s.name);
    }

    public int hashCode() {
        return id * 31 + name.hashCode();
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Munna");
        Student s2 = new Student(101, "Munna");

        System.out.println(s1.toString());    // 101 - Munna
        System.out.println(s1.equals(s2));    // true
        System.out.println(s1.hashCode());    // both s1 and s2 same
    }

}
