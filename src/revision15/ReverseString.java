package revision15;

public class ReverseString {
    public static String reverse(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println("Original: " + s);
        System.out.println("Reversed: " + reverse(s));
    }
}


//Original: hello
//Reversed: olleh