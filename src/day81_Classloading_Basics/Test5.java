package day81_Classloading_Basics;


class Demo5 {
    static {
        System.out.println("Demo5 initialize");
    }
}
public class Test5 {
    public static void main(String[] args) throws Exception{
        Class.forName("day81_Classloading_Basics.Demo5");

       // System.out.println(Demo5.class.getName());   // day81_Classloading_Basics.Demo5
    }
}
