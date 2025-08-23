package revision_4;


// 1. substring(int beginIndex)
//Returns substring from beginIndex to end of string.


public class SubstringExample1 {

    public static void main(String[] args) {
        String str = "HelloWorld";
        String sub = str.substring(5);
        System.out.println(sub); // Output: World
    }
}
