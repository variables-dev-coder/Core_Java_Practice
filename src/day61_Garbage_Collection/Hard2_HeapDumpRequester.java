package day61_Garbage_Collection;


import java.lang.management.ManagementFactory;
import java.io.*;

public class Hard2_HeapDumpRequester {
    public static void main(String[] args) throws Exception {
        String pid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        String dumpFile = "heapdump-" + pid + ".hprof";
        Process p = new ProcessBuilder("jcmd", pid, "GC.heap_dump", dumpFile).inheritIO().start();
        p.waitFor();
        System.out.println("Requested heap dump: " + dumpFile);
    }
}

//7572:
//Dumping heap to heapdump-7572.hprof ...
//Heap dump file created [3421695 bytes in 0.015 secs]
//Requested heap dump: heapdump-7572.hprof


//Explanation: Shows how to request heap dump programmatically; analyze with MAT to find retention paths causing leaks.