package revision13;

// Check if a String Has All Unique Characters

import java.util.HashSet;
import java.util.Set;

public class UniqueChars {
    public static void main(String[] args) {
        String str = "Munna";
        str = str.toLowerCase();
        Set<Character> set = new HashSet<>();

        boolean unique = true;
        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                unique = false;
                break;
            }
            set.add(c);
        }

        System.out.println(unique ? "All unique" : "Duplicates found");
    }
}

//Logic:
//Store seen characters in HashSet.
//Concept: HashSet, uniqueness check.