package day59_Packages_And_import.main;

import day59_Packages_And_import.model.Employee;
import day59_Packages_And_import.service.EmployeeService;

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Munna");
        EmployeeService service = new EmployeeService();
        service.printEmployee(emp);
    }
}

//Employee: Munna