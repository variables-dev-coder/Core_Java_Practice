package day60_Java_Memory_Model;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryDemo {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        while (true) {
            list.add(new int[1_000_000]); // keeps filling heap
        }
    }
}
