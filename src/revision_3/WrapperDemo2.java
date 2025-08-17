package revision_3;

public class WrapperDemo2 {
    public static void main(String[] args) {
        // Autoboxing: primitive -> Wrapper
        Double price = 99.99;     // double -> Double
        Character grade = 'A';    // char -> Character

        // Unboxing: Wrapper -> primitive
        double newPrice = price + 10;   // Double -> double
        char newGrade = grade;          // Character -> char

        System.out.println("Price (Wrapper): " + price);
        System.out.println("New Price (primitive): " + newPrice);
        System.out.println("Grade (Wrapper): " + grade);
        System.out.println("New Grade (primitive): " + newGrade);
    }
}

/*
Price (Wrapper): 99.99
New Price (primitive): 109.99
Grade (Wrapper): A
New Grade (primitive): A


Logic:

Autoboxing converts double → Double and char → Character.
Unboxing converts them back when used in arithmetic or assignment.
 */