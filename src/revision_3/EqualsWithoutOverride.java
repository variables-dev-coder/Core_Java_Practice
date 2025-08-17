package revision_3;


// equals() Without Override
//By default, equals() in Object compares reference (memory address), not content.

class Student3 {
    int id;
    String name;

    Student3(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class EqualsWithoutOverride {
    public static void main(String[] args) {
        Student3 s1 = new Student3(101, "Munna");
        Student3 s2 = new Student3(101, "Munna");

        System.out.println(s1.equals(s2)); // false
    }
}

// Even though both objects look same, equals() returned false because it checks memory location by default.