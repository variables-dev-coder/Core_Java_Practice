package day13_Arrays_Strings_DSA_Part2;

/*
2. Security Benefits of String Immutability
Question:
Why is String immutability important in scenarios like database credentials, file paths, or network connections?
Show a code example where mutable strings could cause a security vulnerability.

Key Points Tested:
Preventing data tampering
Safe use in security-sensitive APIs
Thread-safety in multi-threaded environments
 */


public class SecurityRiskDemo {
    public static void main(String[] args) {
        // Immutable String
        String password = "MySecret123";
        authenticate(password); // safe

        // Mutable char[] (can be changed after passing)
        char[] mutablePassword = {'M', 'y', 'S', 'e', 'c', 'r', 'e', 't'};
        authenticate(new String(mutablePassword));

        // Attacker modifies mutable array
        mutablePassword[0] = 'X'; // changes original password
        System.out.println("Modified password: " + new String(mutablePassword));
    }

    public static void authenticate(String password) {
        System.out.println("Authenticating: " + password);
    }
}


//Explanation:
//Immutable Strings: Once created, can’t be modified → safe for storing passwords, DB URLs, API keys.
//Mutable char[]: Can be altered after passing, which can be exploited.
//Many security-sensitive APIs (e.g., JDBC URL, File paths) use String to ensure safety.