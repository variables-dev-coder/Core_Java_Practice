package revision_4;

public class StringFinalRecap {
    public static void main(String[] args) {
        // Input text
        String text = "Hello, contact us at support@company.com or sales@company.com for queries.";

        // 1. Regex to extract emails
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(text);

        // 2. Use StringBuilder to collect emails
        StringBuilder sb = new StringBuilder("Extracted Emails:\n");

        while (matcher.find()) {
            String email = matcher.group();

            // Demonstrate intern() for duplicate string optimization
            String pooled = email.intern();

            sb.append(pooled).append("\n");
        }

        // 3. String immutability demo
        String s1 = "Java";
        String s2 = s1.concat(" Rocks"); // new object created
        System.out.println("Immutable String Example: " + s1 + " vs " + s2);

        // 4. Print results
        System.out.println(sb.toString());
    }
}

/*
# String Basics
String s = "Hello";   # Immutable, stored in String Pool
String s2 = new String("Hello"); # Stored in Heap

# Immutability
s.concat("World");    # Creates NEW object, old one unchanged

# String Pool + intern()
String a = "Java";
String b = new String("Java").intern();
a == b  # true (both point to pool)

# StringBuilder (mutable, not thread-safe)
StringBuilder sb = new StringBuilder("Hi");
sb.append(" Munna");  # modifies in-place

# StringBuffer (mutable, thread-safe)
StringBuffer sbf = new StringBuffer("Hi");
sbf.append(" Thread-Safe");

# Regex
Pattern p = Pattern.compile("[a-z]+@[a-z]+\\.com");
Matcher m = p.matcher(text);
while(m.find()) System.out.println(m.group());

# Performance
String → simple, read-only small data
StringBuilder → heavy modifications, single-thread
StringBuffer → heavy modifications, multi-thread

 */