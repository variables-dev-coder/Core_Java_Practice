package revision13;

public class ArmstrongCheck {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        System.out.println(temp == sum ? "Armstrong" : "Not Armstrong");
    }
}

// Armstrong

//Concept: Loops, modulo %, cube calculation, conditional check.