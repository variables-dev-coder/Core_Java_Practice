package revision_4;

import java.util.StringJoiner;

public class MergeJoinerExample {
    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner(", ", "{", "}");
        sj1.add("Red").add("Green");

        StringJoiner sj2 = new StringJoiner(", ");
        sj2.add("Blue").add("Yellow");

        sj1.merge(sj2);
        System.out.println(sj1);
    }
}

// {Red, Green, Blue, Yellow}

/*
Joining names, emails, log messages.

Formatting CSV-like output.

Reducing manual string concatenation in loops.
 */