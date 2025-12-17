package day81_Classloading_Basics;


class Demo10 {
    static {
        int x = 10 / 0;
    }
}

public class Test10 {
    public static void main(String[] args) {
        new Demo10();
    }
}
