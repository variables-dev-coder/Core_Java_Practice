package day13_Arrays_Strings_DSA_Part2;


// Write a Java program to reverse each word in a string while keeping their position in the sentence.

public class ReverseEachWord_2 {
    public static void main(String[] args) {
        String sentence = "Janu Love You";
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            reversedSentence.append(sb.reverse()).append(" ");
        }

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Worlds: " + reversedSentence.toString().trim());
    }
}
