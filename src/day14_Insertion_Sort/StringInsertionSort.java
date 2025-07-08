package day14_Insertion_Sort;

public class StringInsertionSort {
    public static void main(String[] args) {
        String[] names = {"Zara", "Abhi", "Nithin", "Manu"};

        for (int i = 1; i < names.length; i++) {
            String current = names[i];
            int j = i -1;

            while (j >= 0 && names[j].compareTo(current) > 0) {
                names[j + 1] = names[j];
                j--;
            }

            names[j + 1] = current;
        }

        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
