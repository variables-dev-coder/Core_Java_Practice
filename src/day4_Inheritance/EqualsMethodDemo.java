package day4_Inheritance;


class Student2 {
    int id;
    String name;

    Student2(int id, String name){
        this.id = id;
        this.name = name;
    }

    // Overriding equals() method to compare objects logically

    public boolean equals(Object obj){
        if (this == obj) return true; // same object
        if (obj == null || getClass() != obj.getClass()) return false;

        Student2 other = (Student2) obj;
        return this.id == other.id && this.name.equals(other.name);
    }
}
public class EqualsMethodDemo {
    public static void main(String[] args) {
        Student2 s1 = new Student2(101, "Munna");
        Student2 s2 = new Student2(101, "Munna");
        Student2 s3 = new Student2(102, "Aziz");

        System.out.println(s1.equals(s2)); //  true: same id & name
        System.out.println(s1.equals(s3)); //  false: different id & name
    }
}
