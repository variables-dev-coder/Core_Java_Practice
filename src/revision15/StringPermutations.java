package revision15;

public class StringPermutations {
    public static void permute(String s, int left, int right) {
        if (left == right) {
            System.out.println(s);
            return;
        }

        for (int i = left; i <= right; i++) {
            s = swap(s, left, i);
            permute(s, left + 1, right);
            s = swap(s, left, i); // backtrack
        }
    }

    private static String swap(String s, int i, int j) {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "abc";
        permute(s, 0, s.length() - 1);
    }
}

//abc
//acb
//bac
//bca
//cba
//cab