package day13_Arrays_Strings_DSA_Part2;

public class VowelConsonantCounter_1 {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiou".indexOf(ch) != -1) vowels++;
            else if (Character.isLetter(ch)) consonants++;
        }

        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}
