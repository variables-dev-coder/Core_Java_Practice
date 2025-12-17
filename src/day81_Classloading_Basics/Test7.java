package day81_Classloading_Basics;


class Demo7 {
    static int x = 10;

    static {
        System.out.println("x = " + x);
    }
}

public class Test7 {
    public static void main(String[] args) {
        System.out.println("Main");

    }
}


//Static block not executed because class not used.