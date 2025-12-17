package day81_Classloading_Basics;


class Demo3 {
    static int x = 10;

    static {
        System.out.println("Static block executed");
    }
}

public class Test3 {
    public static void main(String[] args) {
        System.out.println(Demo3.x);

    }
}

//Static block executed
//10