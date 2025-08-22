package day39_Collection_List_Interface;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeArrayList {
    public static void main(String[] args) {
        ArrayList<Character> list1 = new ArrayList<>(Arrays.asList('r','a','d','a','r'));
        ArrayList<Character> list2 = new ArrayList<>(Arrays.asList('j','a','v','a'));

        System.out.println("Is Palindrome (radar)? " + isPalindrome(list1));
        System.out.println("Is Palindrome (java)? " + isPalindrome(list2));
    }

    public static boolean isPalindrome(ArrayList<Character> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

/*
Is Palindrome (radar)? true
Is Palindrome (java)? false

 */