package day80_Reflection;

public class Employee {

    private int id = 101;
    private String name = "Munna";

    public Employee() {
        System.out.println("Employee Constructor Called");
    }

    public void work() {
        System.out.println("Employee is working");
    }

    private void secretTask() {
        System.out.println("Private task executed");
    }
}
