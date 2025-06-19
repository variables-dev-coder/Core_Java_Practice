package day4_Inheritance;


class Employee2 {
    int empId;
    String name;
    String department;

    Employee2(int empId, String name, String department){
        this.empId = empId;
        this.name = name;
        this.department = department;
    }

    public String toString(){
        return "Employee2 { Employee Id = '" + empId + "', Employee name = " + name + "', Employee Department = " + department + " } ";
    }

}
public class ToStringDemo2 {
    public static void main(String[] args) {

        Employee2 ee2 = new Employee2(101, "Munna Aziz", "Development");
        System.out.println(ee2);
    }
}
