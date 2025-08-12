package day13_Arrays_Strings_DSA_Part2;

import java.util.Date;

public final class Person {
    private final String name;
    private final Date dob;       // mutable object

    Person(String name, Date dob) {
        this.name = name;
        this.dob = new Date(dob.getTime());  // defensive copy
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return new Date(dob.getTime());     // return copy, not original
    }
}

class TestImmutable {
    public static void main(String[] args) {
        Date date = new Date();

        Person p = new Person("Munna", date);

        date.setTime(0);  // modifying original date won't affect Person object
        System.out.println(p.getDob());
    }
}