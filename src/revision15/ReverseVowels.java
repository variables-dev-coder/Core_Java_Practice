package revision15;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "hello";

        String result = reverseVowels(s);
        System.out.println(result);
    }

    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (!isVowel(arr[i])) {
                i++;
            } else if (!isVowel(arr[j])) {
                j--;
            } else {
                // both vowels → swap
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
        return new String(arr);
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

// holle