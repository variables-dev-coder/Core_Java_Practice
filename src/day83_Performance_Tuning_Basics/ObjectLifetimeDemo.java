package day83_Performance_Tuning_Basics;

import java.util.ArrayList;
import java.util.List;

public class ObjectLifetimeDemo {

    static List<byte[]> longLivedObjects = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        while (true) {

            // Short-lived objects
            for (int i = 0; i < 1000; i++) {
                byte[] temp = new byte[1024];
            }

            // Long-lived objects
            longLivedObjects.add(new byte[1024 * 1024]);

            System.out.println("Long lived objects count: " + longLivedObjects.size());
            Thread.sleep(500);
        }
    }
}
