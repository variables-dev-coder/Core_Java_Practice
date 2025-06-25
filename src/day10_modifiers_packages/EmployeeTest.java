package day10_modifiers_packages;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        //System.out.println("Employee Id: " + empId);  // private not accessible
        System.out.println("Employee Name: " + e1.empName);
        System.out.println("Employee Department: " + e1.department);
        System.out.println("Employee Company Name: " + e1.companyName);

        e1.displayDetails();
    }
}
