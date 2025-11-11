package revision12;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello Munna";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed: " + reversed);
    }
}

// Reversed: annuM olleH