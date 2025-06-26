package day11_Exception_Handling;

public class ThrowVsThrowsExample {

    static void validateAge(int age) throws Exception {
        if(age < 18) {
            throw new Exception("You are not eligible to vote. ");
        } else {
            System.out.println("You can vote. ");
        }
    }
    public static void main(String[] args) {
        try{
            validateAge(16);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
