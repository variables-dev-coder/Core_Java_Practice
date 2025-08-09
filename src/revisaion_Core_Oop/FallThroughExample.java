package revisaion_Core_Oop;

public class FallThroughExample {
    public static void main(String[] args) {
        int num = 2;
        switch (num) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Default case");
        }
    }
}
// Two
// Three

/*

7. Interview Questions
Can we use long in switch?
No. Only byte, short, char, int, String, and enum are allowed.

What happens if we remove break?
Execution continues to the next case (fall-through).

Can we have duplicate case labels?
No. It will cause a compile-time error.

Is default mandatory?
No, but good practice.

Can we switch on multiple variables?
No, switch works on one expression only.

 */