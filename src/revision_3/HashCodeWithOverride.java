package revision_3;

/*
hashCode() With Override

When we override equals(), we should also override hashCode() so that:
Equal objects produce the same hash code.

 */

import java.util.Objects;

class Student6 {
    int id;
    String name;

    Student6(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student6)) return false;
        Student6 s = (Student6) obj;
        return this.id == s.id && this.name.equals(s.name);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(id, name); // generates hash based on fields
    }
}

public class HashCodeWithOverride {
    public static void main(String[] args) {
        Student6 s1 = new Student6(101, "Munna");
        Student6 s2 = new Student6(101, "Munna");

        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());
        System.out.println("s1 equals s2: " + s1.equals(s2));
    }
}

/*
s1 hashCode: 74709973
s2 hashCode: 74709973
s1 equals s2: true


Both hash codes are same.
equals() is true.
Now objects behave correctly in HashMap, HashSet, etc.


 */