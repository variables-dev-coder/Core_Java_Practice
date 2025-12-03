package revision15;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL",
                "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(romans[i]);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3));      // III
        System.out.println(intToRoman(58));     // LVIII
        System.out.println(intToRoman(1994));   // MCMXCIV
    }
}
