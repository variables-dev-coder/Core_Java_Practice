package day7_Encapsulation;

public class StudentMain {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Munna");
        s.setAge(30);

        System.out.println("Name: " +s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
