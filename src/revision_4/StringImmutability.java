package revision_4;

public class StringImmutability {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println("Original s1: " + s1);

        String s2 = s1.concat(" World");
        System.out.println("After concat, s1: " + s1);
        System.out.println("New String s2: " + s2);
    }
}

/*
Original s1: Hello
After concat, s1: Hello
New String s2: Hello World
 */


/*
Explanation
Once a String object is created, it cannot be changed.
Any operation that looks like it “modifies” a String (e.g., concatenation, replace)
actually creates a new String object.
That’s why String is immutable.


Dry Run
s1 = "Hello" → stored in String pool.
s1.concat(" World") → creates new object "Hello World".
s1 remains "Hello".
s2 points to "Hello World".

 */