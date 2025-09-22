package day62_Generics_Class_Method;

//Generic Method Returning Max of Two

class Util2 {
    public static <T extends Comparable<T>> T max(T a, T b) {
        return (a.compareTo(b) > 0) ? a : b;
    }
}

public class utilMain2 {
    public static void main(String[] args) {
        System.out.println(Util2.max(10, 20));   // 20
        System.out.println(Util2.max("A", "B")); // B
    }

}

// 20
// B