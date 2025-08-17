package revision_3;


// Overriding equals() to Compare Content
//If we want to compare values (content) instead of memory location, we must override equals().

class Student4 {
    int id;
    String name;

    Student4(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student4 s = (Student4) obj;
        return id == s.id && name.equals(s.name);
    }
}

public class EqualsWithOverride {
    public static void main(String[] args) {
        Student4 s1 = new Student4(101, "Munna");
        Student4 s2 = new Student4(101, "Munna");

        System.out.println(s1.equals(s2));   // true
    }
}


// Now it compares id & name values → both are equal.