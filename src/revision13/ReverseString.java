package revision13;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Munna";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed String : " + reversed);  // Reversed String : annuM
    }
}

//Logic:
//Loop from end to start.
//Pick each character and add to a new string.
//Concept: String manipulation, charAt(), length() method.