package revision_4;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Munna");

        sb.append(" Learning");
        sb.append(" Strings");

        System.out.println("Result: " + sb);

        sb.reverse();
        System.out.println("Reversed: " + sb);
    }
}

//Result: Munna Learning Strings
//Reversed: sgnirtS gninraeL annuM

//When to use?
//Use StringBuffer when thread-safety is needed.
//Use StringBuilder when performance is more important and no multi-threading issue.