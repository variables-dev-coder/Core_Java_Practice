package revision_4;

public class StringReplaceExample {
    public static void main(String[] args) {
        String s = "Java is fun, Java is powerful!";

        // 1. Replace characters
        String r1 = s.replace('a', '@');
        System.out.println("replace(char,char): " + r1);

        // 2. Replace substring
        String r2 = s.replace("Java", "Python");
        System.out.println("replace(CharSequence,CharSequence): " + r2);

        // 3. Replace using regex
        String r3 = s.replaceAll("\\s+", "-");
        System.out.println("replaceAll(regex): " + r3);

        // 4. Replace first regex match
        String r4 = s.replaceFirst("Java", "C++");
        System.out.println("replaceFirst(regex): " + r4);
    }
}

/*
replace(char,char): J@v@ is fun, J@v@ is powerful!
replace(CharSequence,CharSequence): Python is fun, Python is powerful!
replaceAll(regex): Java-is-fun,-Java-is-powerful!
replaceFirst(regex): C++ is fun, Java is powerful!


Topic 7: Replace Methods
Explanation

Java gives multiple ways to replace text in a String:

1.replace(char oldChar, char newChar)
    Replaces all occurrences of a character.

2.replace(CharSequence target, CharSequence replacement)
    Replaces all occurrences of a substring (exact match, not regex).

3.replaceAll(String regex, String replacement)
    Replaces all matches of a regex with replacement.

4.replaceFirst(String regex, String replacement)
    Replaces first match of a regex.

Dry Run

replace('a','@') → "J@v@ is fun, J@v@ is powerful!"
replace("Java","Python") → "Python is fun, Python is powerful!"
replaceAll("\\s+","-") → "Java-is-fun,-Java-is-powerful!" (all spaces replaced by -)
replaceFirst("Java","C++") → "C++ is fun, Java is powerful!"



 */