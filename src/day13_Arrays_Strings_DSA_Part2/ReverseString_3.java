package day13_Arrays_Strings_DSA_Part2;


// Reverse a String

public class ReverseString_3 {
    public static void main(String[] args) {
        String str = "Pooja";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reversed: " + reverse);
    }
}
