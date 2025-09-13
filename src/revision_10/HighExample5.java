package revision_10;

// Multi-Catch Block (Java 7+)

public class HighExample5 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.charAt(2)); // NullPointerException
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
            System.out.println("Handled multiple exceptions: " + e);
        }
    }
}

//Handled multiple exceptions: java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "s" is null