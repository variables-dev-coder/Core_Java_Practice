package day81_Classloading_Basics;


class Demo9 {
    static {
        System.out.println("Loaded once");
    }
}

public class Test9 {
    public static void main(String[] args) {
        new Demo9();
        new Demo9();
        new Demo9();
    }
}

// Loaded once