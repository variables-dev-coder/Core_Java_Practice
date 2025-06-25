package day9_ObjectInitializationGarbageCollection;


class Student {
    int id;                     // default: 0
    String name;                // default: null
    boolean isActive;           // default: false

    void showDisplay(){
        System.out.println("ID: " + id + ", Name: " + name + ", Is Active: " + isActive);
    }
}
public class DefaultValues {
    public static void main(String[] args) {
        Student s = new Student();  // object created in Heap
        s.showDisplay();            // access default values
    }
}
