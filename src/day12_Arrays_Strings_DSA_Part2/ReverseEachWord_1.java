package day12_Arrays_Strings_DSA_Part2;

// Write a Java program to reverse each word in a string while keeping their position in the sentence.

public class ReverseEachWord_1 {
    public static void main(String[] args) {
        String sentence = "Java is awesome";
        String[] word = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String world : word) {
            StringBuilder sb = new  StringBuilder(world);
            reversedSentence.append(sb.reverse().toString()).append(" ");
        }

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Words: " + reversedSentence.toString().trim());
    }
}
