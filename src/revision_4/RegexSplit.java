package revision_4;

public class RegexSplit {
    public static void main(String[] args) {
        String data = "apple,orange;banana|grapes";
        String[] fruits = data.split("[,;|]");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

/*
apple
orange
banana
grapes

 */