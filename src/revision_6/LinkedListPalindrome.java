package revision_6;

//Given a LinkedList<String>, check if it forms a palindrome sequence.

import java.util.LinkedList;

public class LinkedListPalindrome {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("madam");
        list.add("in");
        list.add("eden");
        list.add("in");
        list.add("madam");

        System.out.println("List: " + list);
        System.out.println("Is Palindrome? " + isPalindrome(list));
    }

    public static boolean isPalindrome(LinkedList<String> list) {
        int left = 0, right = list.size() - 1;

        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/*
Explanation

Compare elements from start and end.
If all pairs match → palindrome.
Else → not palindrome.

Dry Run

List = [madam, in, eden, in, madam]

Step 1: left=0 (madam), right=4 (madam) → match
Step 2: left=1 (in), right=3 (in) → match
Step 3: left=2 (eden), right=2 → middle reached

All matched → Palindrome = true

 */