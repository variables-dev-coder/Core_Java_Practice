package day3_ObjectConstructorMemory;

public class SharedReference {
    public static void main(String[] args) {

        Student s1 = new Student("Aziz", 29);
        Student s2 = s1;  // s2 points to same object

        s2.name= "Munna";

        System.out.println("S1 name: " + s1.name);
        System.out.println("s2.name: " + s2.name);
    }
}

class Student3{
    String name;
    int age;

    Student3 (String name, int age){
        this.name = name;
        this.age = age;
    }
}
