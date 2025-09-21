package day61_Garbage_Collection;


import java.util.*;

public class Medium1_StaticLeak {
    static List<byte[]> leak = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        for (int i=0;i<1000;i++){
            leak.add(new byte[1024*50]); // 50KB blocks
            if (i % 100 == 0) System.out.println("Allocated " + i);
            Thread.sleep(10);
        }
        System.out.println("Finished allocations. List size: " + leak.size());
    }
}

//Allocated 0
//Allocated 100
//Allocated 200
//Allocated 300
//Allocated 400
//Allocated 500
//Allocated 600
//Allocated 700
//Allocated 800
//Allocated 900
//Finished allocations. List size: 1000


// Explanation: Static list retains references → memory leak. Demonstrates how holding references causes OOM.