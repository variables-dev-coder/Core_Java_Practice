package day68_Functional_Enhancements_Beyond_Streams;

// replaceAll()

import java.util.ArrayList;
import java.util.List;

public class REplaceAll {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("munna", "aziz"));
        names.replaceAll(String::toUpperCase);
        System.out.println(names);  // [MUNNA, AZIZ]
    }
}
