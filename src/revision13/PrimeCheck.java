package revision13;

public class PrimeCheck {
    public static void main(String[] args) {
        int n = 17;
        boolean isPrime = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(n + (isPrime ? " is Prime" : " is Not Prime"));  // 17 is Prime
    }
}

//Logic:
//If divisible by any number other than 1 and itself → not prime.
//Concept: Loop, conditional logic, modulo operator.