package revisaion_Core_Oop;

// String Switch (Java 7+)

public class StringSwitch {
    public static void main(String[] args) {
        String fruit = "Apple";

        switch (fruit) {
            case "Apple":
                System.out.println("Red fruit");
                break;
            case "Banana":
                System.out.println("Yellow fruit");
                break;
            default:
                System.out.println("Unknown fruit");
        }
    }
}
