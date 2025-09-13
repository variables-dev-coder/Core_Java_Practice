package revision_10;

public class Example8 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Null value found");
        }
    }
}

//Null value found