package day13_Arrays_Strings_DSA_Part2;


// Write a program to count the number of, Count Vowels, Consonants, Digits, and Special Characters in a String

/*

Logic Explanation:
Convert the string to lowercase to handle both upper/lower case letters.

Use Character.isLetter(), Character.isDigit(), etc.

For each character:

If vowel → increase vowel count.

Else if consonant → increase consonant count.

Else if digit → increase digit count.

Else → increase special character count.

 */
public class CharacterTypeCounter_1 {
    public static void main(String[] args) {
        String str = "Munna123@gmail.com!";
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialChars = 0;

        str = str.toLowerCase();   // Case-insensitive

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;

            } else if (!Character.isWhitespace(ch)) {
                specialChars++;

            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonant: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);

    }
}
