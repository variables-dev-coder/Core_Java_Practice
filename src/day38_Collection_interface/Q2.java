package day38_Collection_interface;

// Question: Use Collection to hold values, then use Collections.max() and Collections.min().


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Q2 {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Munna");
        names.add("Ravi");
        names.add("Ankit");

        System.out.println("Max: " + Collections.max((Collection) names));
        System.out.println("Min: " + Collections.min((Collection) names));
    }

}

//Max: Ravi
//Min: Ankit