package day61_Garbage_Collection;


public class Medium2_MemoryMonitor {
    public static void main(String[] args) throws Exception {
        printMem("start");
        for (int i=0;i<100000;i++){
            byte[] b = new byte[1024];
            if (i % 10000 == 0) {
                System.gc();
                printMem("i=" + i);
            }
        }
    }
    static void printMem(String tag){
        Runtime r = Runtime.getRuntime();
        System.out.println(tag + " free=" + r.freeMemory()/1024 + "KB total=" + r.totalMemory()/1024 + "KB");
    }
}

//start free=124928KB total=126976KB
//i=0 free=7204KB total=8192KB
//i=10000 free=7271KB total=8192KB
//i=20000 free=7271KB total=8192KB
//i=30000 free=7270KB total=8192KB
//i=40000 free=7270KB total=8192KB
//i=50000 free=7270KB total=8192KB
//i=60000 free=7270KB total=8192KB
//i=70000 free=7271KB total=8192KB
//i=80000 free=7271KB total=8192KB
//i=90000 free=7271KB total=8192KB



//xplanation: Simple monitoring to observe how GC frees memory over iterations.