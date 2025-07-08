package day14_Insertion_Sort;

public class FloatInsertionSort {
    public static void main(String[] args) {
        float[] marks = {89.5f, 65.4f, 78.0f, 99.9f, 45.3f};

        for (int i = 1; i < marks.length; i++) {
            float current = marks[i];
            int j = i - 1;

            while (j >= 0 && marks[j] > current) {
                marks[j + 1] = marks[j];
                j--;
            }

            marks[j + 1] = current;
        }

        for (float mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
