package day65_Method_References;

// Constructor Reference (parameterized constructor)

import java.util.function.Function;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "'}";
    }
}

public class ConstructorParamRef {
    public static void main(String[] args) {
        // Constructor reference with parameter
        Function<String, Employee> employeeCreator = Employee::new;

        Employee e1 = employeeCreator.apply("Munna");
        Employee e2 = employeeCreator.apply("Aziz");

        System.out.println(e1); // Employee{name='Munna'}
        System.out.println(e2); // Employee{name='Aziz'}
    }
}
