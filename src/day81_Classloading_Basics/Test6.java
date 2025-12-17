package day81_Classloading_Basics;

class Demo6 {
    static {
        System.out.println("Demo6 initialized");
    }
}

public class Test6 {

    public static void main(String[] args) throws Exception {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        cl.loadClass("day81_Classloading_Basics.Demo6");
    }
}

// (no output)

//forName() → loads + initializes
//loadClass() → loads only