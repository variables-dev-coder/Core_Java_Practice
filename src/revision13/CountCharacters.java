package revision13;

// Count Characters in String

public class CountCharacters {
    public static void main(String[] args) {
        String str = "hello";
        int count = 0;

        for (char c : str.toCharArray()) {
            count++;
        }
        System.out.println("Character count: " + count);
    }
}

// Character count: 5

//Logic:
//Convert string to char array and count.
//Concept: Enhanced for-loop, toCharArray().

