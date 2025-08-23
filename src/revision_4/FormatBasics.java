package revision_4;

public class FormatBasics {
    public static void main(String[] args) {
        String a = String.format("Name: %s | Score: %d | Avg: %.2f", "Munna", 87, 87.345);
        String b = "Hi %s, you solved %d problems.".formatted("Munna", 42);
        System.out.println(a);
        System.out.println(b);
    }
}

/*
Name: Munna | Score: 87 | Avg: 87.35
Hi Munna, you solved 42 problems.


Quick Theory

String.format(Locale, format, args...) → static, returns a formatted string (same engine as printf).
"template".formatted(args...) → instance method (Java 15+), cleaner syntax.

Common specifiers:
    %s string, %d integer, %f floating, %.2f 2 decimals, %n newline,
    %tF ISO date yyyy-MM-dd, %tT time HH:mm:ss.
    Useful flags: - left-align, 0 zero-pad, , grouping, ( negatives in parentheses.


 */