package revision_4;

public class SubstringExample4 {
    public static void main(String[] args) {
        String fullName = "Munna Mondal";
        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ") + 1);
        System.out.println("First: " + firstName); // First: Munna
        System.out.println("Last: " + lastName);   // Last: Reddy
    }
}

/*
Index starts from 0.
End index is exclusive.
If beginIndex < 0, endIndex > length or beginIndex > endIndex → throws StringIndexOutOfBoundsException.

 */