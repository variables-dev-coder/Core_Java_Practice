package revision_4;

public class FormatWidthAlign {
    public static void main(String[] args) {
        String line = String.format("|%-10s|%10d|%06.2f|", "Java", 1234, 7.5);
        System.out.println(line);
    }
}

//    |Java      |      1234|007.50|