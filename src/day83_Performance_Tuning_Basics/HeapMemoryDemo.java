package day83_Performance_Tuning_Basics;

import java.util.ArrayList;
import java.util.List;

public class HeapMemoryDemo {

    public static void main(String[] args) {

        List<byte[]> memoryList = new ArrayList<>();

        try {
            while (true) {
                // Allocate 1 MB memory blocks
                byte[] block = new byte[1024 * 1024];
                memoryList.add(block);

                System.out.println("Allocated: " + memoryList.size() + " MB");
                Thread.sleep(300);
            }
        } catch (OutOfMemoryError e) {
            System.out.println(" OutOfMemoryError occurred!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
