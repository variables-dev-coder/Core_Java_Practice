package revision12;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28, sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }

        System.out.println(num + " is perfect: " + (sum == num));
    }
}

// 28 is perfect: true