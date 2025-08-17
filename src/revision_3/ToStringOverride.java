package revision_3;

// Overriding toString() Method

class Student2 {
    int id;
    String name;

    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student2 [ID " + id + ", Name = " + name + "]";
    }
}

public class ToStringOverride {
    public static void main(String[] args) {
        Student2 s1 = new Student2(101, "Munna");
        Student2 s2 = new Student2(102, "Tara");

        System.out.println(s1);
        System.out.println(s2);
    }

}


// Student2 [ID 101, Name = Munna]
// Student2 [ID 102, Name = Tara]

// Here, we overrode toString() to print meaningful info instead of hashcode.