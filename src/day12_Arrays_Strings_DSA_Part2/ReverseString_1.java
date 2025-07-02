package day12_Arrays_Strings_DSA_Part2;


// Reverse a String

public class ReverseString_1 {
    public static void main(String[] args) {
        String str = "Munna";
        String reverse = "";
        for (int i = str.length() -1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reversed: " + reverse);
    }
}

/*

String s = "Hello World";

s.length();        // → 11
s.charAt(0);       // → 'H'
s.toUpperCase();   // → "HELLO WORLD"
s.toLowerCase();   // → "hello world"
s.indexOf("o");    // → 4
s.substring(0, 5); // → "Hello"
s.equals("Hello"); // → true
s.equalsIgnoreCase("hello world"); // → true
s.replace("World", "Java"); // → "Hello Java"
s.trim();          // Removes leading/trailing spaces

 */