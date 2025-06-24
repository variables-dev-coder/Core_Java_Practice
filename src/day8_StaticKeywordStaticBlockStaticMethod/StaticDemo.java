package day8_StaticKeywordStaticBlockStaticMethod;


class Student {
    int rollNo;
    String name;
    static String collage = "JNTU";

    Student(int rollNo, String name) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display(){
        System.out.println("Roll No: " + rollNo + " Name: " + name + " Collage Name: " + collage);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Munna");
        Student s2 = new Student(102, "Aziz");

        s1.display();
        s2.display();
    }
}
