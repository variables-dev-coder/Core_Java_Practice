package revisaion_Core_Oop;



/*

1. Concept
The switch statement is a multi-way branch statement in Java used to execute one block of code
among many options based on the value of a variable or expression.
It’s more readable and efficient than writing multiple if-else-if statements when checking the
same variable against multiple constant values.

2. Syntax
switch (expression) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    ...
    default:
        // code block
}


 */
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
// Wednesday

/*

3. Rules in Java
expression can be byte, short, int, char, String, or enum (from Java 7 onwards).
case labels must be constant values (compile-time constants).
break prevents fall-through (execution moving to next case automatically).
default is optional but recommended.
The order of cases doesn’t matter.

 */