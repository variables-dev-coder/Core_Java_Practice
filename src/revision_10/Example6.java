package revision_10;

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class Example6 {
    static void validate(int age) throws MyException {
        if (age < 18) throw new MyException("Not eligible to vote");
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try {
            validate(16);
        } catch (MyException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}


// Caught: Not eligible to vote
