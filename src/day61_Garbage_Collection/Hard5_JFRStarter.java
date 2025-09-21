package day61_Garbage_Collection;

// Hard5_JFRStarter.java
// Note: requires JVM with JFR enabled; run with: --add-modules jdk.jfr
import jdk.jfr.*;
import jdk.jfr.consumer.*;

public class Hard5_JFRStarter {
    public static void main(String[] args) throws Exception {
        Recording r = new Recording();
        r.enable("jdk.GCPhasePause");
        r.start();
        // simulate work
        for (int i=0;i<500;i++){
            byte[] b = new byte[1024*200];
        }
        r.stop();
        r.dump(java.nio.file.Path.of("jfr-recording.jfr"));
        System.out.println("JFR recording saved");
    }
}

//JFR recording saved

//Explanation: Use Java Flight Recorder to capture GC/pause events for in-depth
// analysis. Requires appropriate JVM flags and permissions.

