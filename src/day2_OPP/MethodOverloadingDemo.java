package day2_OPP;


class Calculator{

    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }
}
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add 2 int: " + calc.add(5, 10));
        System.out.println("Add 2 double: " + calc.add(3.5, 5.9));
        System.out.println("Add 3 int: " + calc.add(56, 23, 12));
    }
}

/*

Key Rules:
Methods must have same name

Must have different parameters

Return type can be different, but that’s not enough alone

 */