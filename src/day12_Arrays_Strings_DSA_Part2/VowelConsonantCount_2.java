package day12_Arrays_Strings_DSA_Part2;



/*
Count vowels and consonants in a String
Write a Java program to count the number of vowels and consonants in a string.
 */

public class VowelConsonantCount_2 {
    public static void main(String[] args) {
        String str = "Munna Aziz";
        int vowelCount = 0;
        int consonantCount = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {  // only check alphabets
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowels = " + vowelCount);
        System.out.println("Consonants = " + consonantCount);
    }
}

/*

Convert the string to lowercase for easy comparison.

Loop through each character:

If it’s a letter:

If it is a vowel (a, e, i, o, u), increment vowelCount

Else, increment consonantCount

 */