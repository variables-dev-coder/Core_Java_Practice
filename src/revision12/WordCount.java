package revision12;

public class WordCount {
    public static void main(String[] args) {
        String str = "Hello World Java Programming";
        String[] words = str.split("\\s+");
        System.out.println("Word count: " + words.length);
    }
}

//Word count: 4