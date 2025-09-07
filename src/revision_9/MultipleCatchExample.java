package revision_9;

//Multiple catch blocks

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception occurred");
        } catch (Exception e) {
            System.out.println("Generic Exception: " + e);
        }
    }
}

//Null Pointer Exception occurred