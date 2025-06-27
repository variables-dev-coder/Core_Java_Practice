package day11_Exception_Handling;

public class LowBalanceException extends RuntimeException {
    public LowBalanceException(String message) {
        super(message);
    }
}
