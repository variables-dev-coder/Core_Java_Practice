package revision15;

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int n = num1.length();
        int m = num2.length();
        int[] result = new int[n + m];

        // Reverse multiply from rightmost digits
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                int pos1 = i + j;
                int pos2 = i + j + 1;

                int sum = mul + result[pos2];

                result[pos1] += sum / 10; // carry
                result[pos2] = sum % 10;  // digit
            }
        }

        // Build final result
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "45";
        System.out.println(multiply(num1, num2)); // Output: 5535
    }
}
