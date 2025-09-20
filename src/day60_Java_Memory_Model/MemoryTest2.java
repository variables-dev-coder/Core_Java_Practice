package day60_Java_Memory_Model;



class Person {
    String name;
}

public class MemoryTest2 {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Munna";

        Person p2 = p1; // both point to same heap object
        p2.name = "Aziz";

        System.out.println(p1.name); // ?    , Aziz
        System.out.println(p2.name); // ?     , Aziz


    }

}


// Shows reference pointing to same heap object.