package day13_Arrays_Strings_DSA_Part2;

public final class Employee {
    private final String name;
    private final int id;

    public Employee (String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // No setters, values can't change after object create
}
 class Main {
     public static void main(String[] args) {
         Employee emp = new Employee("Munna", 101);
         System.out.println("Employee Name: " + emp.getName() + " and, Id No: " + emp.getId());  // Employee Name: Munna and, Id No: 101


         Employee emp2 = new Employee("Aziz", 102);
         System.out.println("Employee Name: " + emp2.getName() + " and, Id No: " + emp.getId());  // Employee Name: Aziz and, Id No: 101

        // emp.name = "Zoya";    // compiler error
     }

 }