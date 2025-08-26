package day41_Collection_Vector_Legacy_Class;

import java.util.Arrays;
import java.util.Vector;

public class PalindromeVector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(Arrays.asList(1, 2, 3, 2, 1));

        boolean isPalindrome = true;
        for (int i = 0; i < v.size() / 2; i++) {
            if (!v.get(i).equals(v.get(v.size() - 1 - i))) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}

//Is Palindrome? true