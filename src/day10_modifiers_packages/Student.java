package day10_modifiers_packages;

public class Student {

    private int id = 208;                       // Only within Student class
    String name = "Sweeta";                     // Default - within same package
    protected String college = "Ellenki";       // Protected - same package or subclass
    public String course = "AI/ML";             // public - everywhere


    public void showDetails(){
        System.out.println("Inside Student class");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Collage: " + college);
        System.out.println("Course: " + course);

    }
}
