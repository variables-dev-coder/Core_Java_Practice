package day13_Arrays_Strings_DSA_Part2;

//Even if a class is immutable, it can be modified using reflection.
// Write code to demonstrate modifying a final field using reflection, then explain how to prevent it.


import java.lang.reflect.Field;

final class ImmutableUser {
    private final String name;

    public ImmutableUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ReflectionBreakExample {
    public static void main(String[] args) throws Exception {
        ImmutableUser user = new ImmutableUser("Munna");

        System.out.println("Before reflection: " + user.getName());

        // Access the private final field using reflection
        Field field = ImmutableUser.class.getDeclaredField("name");
        field.setAccessible(true); // bypass private

        // Remove the 'final' modifier (Java 12+ needs extra handling for 'final' fields)
        field.set(user, "Hacked");

        System.out.println("After reflection: " + user.getName());
    }
}


//Before reflection: Munna
//After reflection: Hacked


/*

Why This Works
-Reflection allows direct memory-level access to fields, bypassing encapsulation.
-final only means “cannot be reassigned in normal Java code,” but reflection can bypass this.
-JVM does not guarantee immutability against reflection.

Step 3: How to Prevent This
1. Security Manager (Deprecated in Java 17+, replaced by sandboxing/security policies in frameworks).
2. Don’t allow reflection from untrusted code (run in a restricted module/classloader).
3. Seal the class and run in trusted environment.
4. Use SecurityManager-like checks (for older Java) or frameworks like GraalVM native image,
   which block reflective field modification.

Key Point:
Immutability is a contract at the language level, not a hard system-level guarantee — reflection
can still break it unless you run in a secure, restricted environment.

 */