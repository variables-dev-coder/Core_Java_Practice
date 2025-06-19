package day4_Inheritance;


class Product {
    int id;
    String name;

    Product(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("Product Constructor called");
    }
    void show(){
        System.out.println("Id: " + id + ", Name: " + name);
    }
}

class Electronics extends Product {
    int warrantyYears;

    Electronics(int id, String name,int warrantyYears){
        super(id, name);
        this.warrantyYears = warrantyYears;
        System.out.println("Electronics Constructor called");
    }

    void show(){
        super.show();
        System.out.println("Warranty: " + warrantyYears + " year(s)");
    }
}

public class ConstructorPractice {
    public static void main(String[] args) {
        Electronics e = new Electronics(19875, "Keybord", 2);
        e.show();

    }
}
