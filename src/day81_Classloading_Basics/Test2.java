package day81_Classloading_Basics;

class Demo2 {
    static {
        System.out.println("Demo class loaded");
    }
}

public class Test2 {
    public static void main(String[] args) {
        new Demo2();   // class loaded
    }
}

// Demo class loaded