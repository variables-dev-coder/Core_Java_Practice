package day61_Garbage_Collection;



public class Easy5_Resurrect {
    static Easy5_Resurrect survivor;
    @Override protected void finalize() {
        survivor = this; // resurrect
        System.out.println("finalize called - resurrecting");
    }
    public static void main(String[] args) throws Exception {
        Easy5_Resurrect obj = new Easy5_Resurrect();
        obj = null;
        System.gc(); Thread.sleep(200);
        System.out.println("After first GC, survivor is " + (survivor != null));
        survivor = null;
        System.gc(); Thread.sleep(200);
        System.out.println("After second GC, survivor is " + (survivor != null));
    }
}

//finalize called - resurrecting
//After first GC, survivor is true
//After second GC, survivor is false


//Explanation: Shows resurrection via finalize() (deprecated); finalizer runs at most once.