package day59_Packages_And_import;

import day59_Packages_And_import.math.Addition;

public class TestAddition {
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println("Sum = " + obj.add(10, 20));  // Sum = 30
    }
}
