package day81_Classloading_Basics;


class Parent {
    static {
        System.out.println("Parent static");
    }
}

class Child extends Parent {
    static {
        System.out.println("Child static");
    }
}

public class Test4 {
    public static void main(String[] args) {

        new Child();   // Parent static, Child static -> when call child came both

      //  new Parent();   // Parent Static, -> when call parent only parent came
    }
}


//Parent static
//Child static