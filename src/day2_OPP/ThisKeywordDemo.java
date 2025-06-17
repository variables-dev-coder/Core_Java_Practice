package day2_OPP;


class Student2{
    int id;
    String name;

    // Constructor with same parameter name
    Student2(int id, String name){
        this.id = id;              // 'this' refers to instance variable
        this.name = name;
    }
    void display(){
        System.out.println("ID: " + this.id + ", name: " + this.name);
    }
}
public class ThisKeywordDemo {
    public static void main(String[] args) {
        Student2 s11 = new Student2(101, "Munna");
        s11.display();

        Student2 s21 = new Student2(102, "Aziz");
        s21.display();

    }
}
