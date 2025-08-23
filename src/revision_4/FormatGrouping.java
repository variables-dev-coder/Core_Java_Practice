package revision_4;

import java.util.Locale;

public class FormatGrouping {
    public static void main(String[] args) {
        String g = String.format(Locale.US, "%,d", 12_500_000);
        String p = String.format("%(d", -500);
        System.out.println(g);
        System.out.println(p);
    }
}

/*

12,500,000
(500)

 */