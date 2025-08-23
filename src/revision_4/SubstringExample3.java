package revision_4;


// Common Use Cases
//Extract domain from an email:


public class SubstringExample3 {
    public static void main(String[] args) {
        String email = "munna123@gmail.com";
        String domain = email.substring(email.indexOf("@") + 1);
        System.out.println(domain); // Output: gmail.com
    }
}
