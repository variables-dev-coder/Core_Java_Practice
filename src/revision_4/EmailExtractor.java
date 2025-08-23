package revision_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {
    public static void main(String[] args) {
        String text = "Contact: john.doe@gmail.com or support@company.org";
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println("Email found: " + m.group());
        }
    }
}

/*
o/p
Email found: john.doe@gmail.com
Email found: support@company.org



Advanced Regex Use-Cases
Regular Expressions (Regex) allow powerful text processing.

(a) Extracting Emails from Text
 */