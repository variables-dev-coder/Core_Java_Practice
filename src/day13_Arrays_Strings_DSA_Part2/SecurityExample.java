package day13_Arrays_Strings_DSA_Part2;


/*
Security Reasons for Immutability
Concept:
-Strings are used in sensitive areas like file paths, network connections, class loading, and database URLs.
-If Strings were mutable, malicious code could alter them after validation.
 */

public class SecurityExample {

    public static void main(String[] args) {
        String filePath = "/user/data";
        openFile(filePath);

        // Imagine if another thread could modify filePath to "/etc/passwd" before openFile executes
    }

    private static void openFile(String path) {
        // In reality, Java safely uses the same value due to immutability
        System.out.println("Opening: " + path);  // Opening: /user/data
    }
}

// Key Point: Immutability prevents mid-execution tampering.