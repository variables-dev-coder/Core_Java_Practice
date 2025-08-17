package revision_3;

// hashCode() Without Override
//Every object has a default hashCode() from Object class, usually based on memory location.

class Student5 {
    int id;
    String name;

    Student5(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class HashCodeWithoutOverride {
    public static void main(String[] args) {
        Student5 s1 = new Student5(101, "Munna");
        Student5 s2 = new Student5(101, "Munna");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));
    }

}

// 455659002
// 250421012
// false

// Even though both objects have same data → hashCode() is different.

// equals() also returns false (since we didn’t override).