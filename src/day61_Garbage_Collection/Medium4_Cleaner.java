package day61_Garbage_Collection;


import java.lang.ref.Cleaner;

public class Medium4_Cleaner {
    private static final Cleaner cleaner = Cleaner.create();
    static class State implements Runnable {
        @Override public void run(){ System.out.println("Cleaning up resource"); }
    }
    static class Resource {
        private final Cleaner.Cleanable cleanable;
        Resource() {
            this.cleanable = cleaner.register(this, new State());
        }
    }
    public static void main(String[] args) throws Exception {
        new Resource();
        System.gc(); Thread.sleep(200);
        System.out.println("Done");
    }
}

//Explanation: Cleaner is safer and recommended over finalize().


//Cleaning up resource
//Done
