package day61_Garbage_Collection;


public class Medium3_LargeObject {
    public static void main(String[] args) throws Exception {
        // Allocate a big object (size depends on -XX:PretenureSizeThreshold)
        byte[] big = new byte[20 * 1024 * 1024]; // ~20MB
        System.out.println("Allocated big object: " + big.length);
        Thread.sleep(200);
    }
}

//Allocated big object: 20971520

//Note: On some collectors/flags, very large objects skip Eden and go
// directly to Old Gen. You can tune -XX:PretenureSizeThreshold.