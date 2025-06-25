package day10_modifiers_packages;



/*

Key Takeaways:
private: Not accessible outside the class.

Default (no modifier): Accessible only within the same package.

protected: Accessible within the same package + child classes (even in other packages).

public: Accessible from anywhere.

 */
public class Employee {

    private int empId = 101;                   // Not accessible outside the class.
    String empName = "Pooja Paul";             // Default (no modifier): Accessible only within the same package.
    protected String department = "IT";        // Accessible within the same package + child classes (even in other packages).
    public String companyName = "TCS";         // Accessible from anywhere.


    public void displayDetails() {
        System.out.println("Inside Student class:");
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Department: " + department);
        System.out.println("Company Name: " + companyName);
    }
}
