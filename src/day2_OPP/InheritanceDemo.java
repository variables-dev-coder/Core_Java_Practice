package day2_OPP;

class Employee2{
    int empId = 101;
    String company = "Infosys";

    void showDetails(){
        System.out.println("Employee Id: " + empId);
        System.out.println("Company: " + company);
    }
}

// Child class inherits from Employee2
class Developer extends Employee2{
    String skill = "Java";

    void showSkill(){
        System.out.println("primary Skill: " + skill);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.showDetails();   // From parent class
        dev.showSkill();     // From child class

    }
}
