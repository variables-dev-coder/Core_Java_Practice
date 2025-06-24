package day8_StaticKeywordStaticBlockStaticMethod;


class Collage {
    static String collegeName;
    static String city;

    // Static block for initialization
    static {
        System.out.println("Static Block executed...");
        collegeName = "ELLENKI COLLEGE OF ENGG AND TECH";
        city = "HYDERABAD";
    }

    static void printDetails() {
        System.out.println("Collage Name: " + collegeName);
        System.out.println("City Name: " + city);
    }
}
public class StaticCollegeDemo {
    public static void main(String[] args) {
        Collage.printDetails();
    }
}
