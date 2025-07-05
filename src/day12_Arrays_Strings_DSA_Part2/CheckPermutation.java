package day12_Arrays_Strings_DSA_Part2;

import java.util.Arrays;

public class CheckPermutation {

    static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println("Are they permutations? " + isPermutation(s1, s2));
    }
}
