package day4_Inheritance;

class Student {
    String name;
    int roll;

    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    public String toString(){
        return "Student{name = '" + name + "', Roll = " + roll + "}";
    }
}
public class ToStringDemo {
    public static void main(String[] args) {
        Student s = new Student("Munna", 101);
        System.out.println(s);

    }
}
