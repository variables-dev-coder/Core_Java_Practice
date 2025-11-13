package revision13;

//Swap Two Numbers (Without Third Variable)

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swap: a=" + a + " b=" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap: " + a + " b=" + b);
    }
}

//Before swap: a=5 b=10
//After swap: 10 b=5


//Logic:
//Use arithmetic to avoid temp variable.
//Concept: Variable manipulation, arithmetic operators.