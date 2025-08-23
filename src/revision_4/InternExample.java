package revision_4;

public class InternExample {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = s1.intern();  // moves "java" to pool

        String s3 = "java";       // already in pool

        System.out.println(s1 == s2); // false (heap vs pool)
        System.out.println(s2 == s3); // true (both pool references)
    }
}
