package revision13;

public class CountVowels {
    public static void main(String[] args) {
        String str = "Munna";
        str = str.toLowerCase();
        int vCount = 0;
        int cCount = 0;

        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1)
                vCount++;
            else if (c >= 'a' && c <= 'z')
                cCount++;
        }
        System.out.println("Vowels: " + vCount + ", Consonants: " + cCount);
    }
}

//Vowels: 2, Consonants: 3

// Concept: String traversal, character comparison.