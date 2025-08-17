package revision_3;



import java.util.HashSet;
import java.util.Objects;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee e = (Employee) obj;
        return id == e.id && Objects.equals(name, e.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}


public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Employee> set = new HashSet<>();

        Employee e1 = new Employee(1, "Alice");
        Employee e2 = new Employee(1, "Alice");

        set.add(e1);
        set.add(e2);

        System.out.println("HashSet size: " + set.size()); // Output: 1
    }
}

/*
Explanation:

HashSet uses hashCode() to bucket elements and equals() to check equality.
Since e1 and e2 are logically equal (id and name same), only one object is stored.

 */