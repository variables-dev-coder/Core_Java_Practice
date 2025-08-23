package revision_4;

import java.util.Locale;

public class StringCaseExample {
    public static void main(String[] args) {
        String s = "java programming";

        // 1. Default toUpperCase
        System.out.println("Uppercase: " + s.toUpperCase());

        // 2. Default toLowerCase
        System.out.println("Lowercase: " + s.toLowerCase());

        // 3. Locale-specific example (Turkish)
        String turkish = "i";
        System.out.println("Default upper (i): " + turkish.toUpperCase());
        System.out.println("Turkish upper (i): " + turkish.toUpperCase(new Locale("tr", "TR")));
        System.out.println("Root upper (i): " + turkish.toUpperCase(Locale.ROOT));
    }
}

/*

Uppercase: JAVA PROGRAMMING
Lowercase: java programming
Default upper (i): I
Turkish upper (i): İ
Root upper (i): I


Topic 9: Case Conversion & Locale
Explanation

Java provides methods to change the case of strings. But locale matters because
some languages treat letters differently (e.g., Turkish “i”).

1.toUpperCase() / toLowerCase()
    Uses default system locale (may cause issues).

2.toUpperCase(Locale) / toLowerCase(Locale)
    Locale-aware conversion.
    For consistent results, use Locale.ROOT.

Dry Run

1. "java programming".toUpperCase() → "JAVA PROGRAMMING".
2. "java programming".toLowerCase() → "java programming".
3. "i".toUpperCase() (default, English) → "I".
4. "i".toUpperCase(Locale("tr","TR")) → becomes "İ" (Turkish dotted I).
5. "i".toUpperCase(Locale.ROOT) → stable, "I".



 */