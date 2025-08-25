package Day40_Collection_Linked_List;

import java.util.Arrays;
import java.util.LinkedList;

public class PalindromeCheck {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>(Arrays.asList('r','a','d','a','r'));
        System.out.println("Is Palindrome? " + isPalindrome(list));
    }

    public static boolean isPalindrome(LinkedList<Character> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

//Is Palindrome? true