package revision13;

//Reverse Words in a Sentence
//Input: "Java is fun"
//Output: "fun is Java"

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Java is fun";
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        System.out.println(reversed.toString().trim());
    }
}

// fun is Java

//Logic: Split string into words, reverse the order.
//Concept: String manipulation, split(), StringBuilder.