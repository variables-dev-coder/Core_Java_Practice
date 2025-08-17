package revision_3;

public class WrapperCompare {
    public static void main(String[] args) {
        Integer a = 100;   // Autoboxing
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println(a == b);     // true (cached values -128 to 127)
        System.out.println(c == d);     // false (outside cache)
        System.out.println(c.equals(d)); // true (compares values)
    }
}

// Shows the Integer cache range and difference between == (reference compare) and equals() (value compare).