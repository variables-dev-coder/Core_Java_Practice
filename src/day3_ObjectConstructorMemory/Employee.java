package day3_ObjectConstructorMemory;

public class Employee {

    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void show(){
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Aziz", 5000);
        e.show();
    }
}
