package day32_Collection_Set_Interface;

import java.util.TreeSet;

public class TreeSetStringExample {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();

        names.add("Zara");
        names.add("Amit");
        names.add("Munna");
        names.add("Riya");
        names.add("Amit"); // duplicate, won't be added

        System.out.println("Sorted & Unique Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

/*
Amit
Munna
Riya
Zara

 */