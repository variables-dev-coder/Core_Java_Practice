package revision15;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String s = "Hello Munna, Keep Growing!";

        countVowelsConsonants(s);
    }

    public static void countVowelsConsonants(String s) {
        s = s.toLowerCase();
        int vowels = 0, consonants = 0;

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') { // alphabet check
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

//Vowels: 8
//Consonants: 13