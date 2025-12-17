package day81_Classloading_Basics;


class Demo {
    static {
        System.out.println("Demo class loaded");
    }
}

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Main started");
        Demo d;           // class NOT loaded
        System.out.println("After reference");
    }
}

//Main started
//After reference

//Reason: Only reference created, no usage.