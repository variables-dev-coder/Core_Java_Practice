package day13_Arrays_Strings_DSA_Part2;

public class ReverseEachWord_3 {
    public static void main(String[] args) {
        String sentence = "Hello World";
        String[] words = sentence.split(" ");
        StringBuilder reverseSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            reverseSentence.append(sb.reverse().toString()).append(" ");
        }

        System.out.println("Original String: " + sentence);
        System.out.println("Reversed Worlds: " + reverseSentence.toString().trim());
    }
}
