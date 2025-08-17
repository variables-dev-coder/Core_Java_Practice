package revision_3;


class Student1 {
    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ToStringDefault {
    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Zoya");
        System.out.println(s1);   // Internally calls toString()
    }

}

/*
Student1@1b28cdfa

By default, toString() prints ClassName@hashcode.
If you don’t override it, you see this random hash-like value.
 */