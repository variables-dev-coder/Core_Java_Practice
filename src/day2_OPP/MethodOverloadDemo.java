package day2_OPP;

// 2. Create a class MathUtils with overloaded multiply() method to handle:
//int x, int y
//
//double x, double y
//
//int x, int y, int z


class MathUtils{
    int multiply(int a, int b){
        return a * b;
    }

    double multiply(double a, double b){
        return a * b;
    }

    int multiply(int a, int b, int c){
        return a * b * c;
    }
}
public class MethodOverloadDemo {
    public static void main(String[] args) {
        MathUtils m = new MathUtils();
        System.out.println(m.multiply(3, 4));
        System.out.println(m.multiply(2.5, 5.9));
        System.out.println(m.multiply(2, 6, 9));

    }
}
