package day62_Generics_Class_Method;


// Generic Print Method

class Printer {
    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class PrinterMain {
    public static void main(String[] args) {
        Printer.printArray(new Integer[]{1, 2, 3});
        Printer.printArray(new String[]{"X", "Y", "Z"});
    }
}

// 1 2 3
// X Y Z