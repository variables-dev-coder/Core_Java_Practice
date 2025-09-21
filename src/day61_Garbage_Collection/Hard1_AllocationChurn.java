package day61_Garbage_Collection;


public class Hard1_AllocationChurn {
    public static void main(String[] args) throws Exception {
        for (int iter=0; iter<1000; iter++) {
            for (int i=0;i<1000;i++){
                byte[] b = new byte[1024*100]; // 100 KB many objects
            }
            if (iter % 50 == 0) System.out.println("iter " + iter);
            Thread.sleep(5);
        }
    }
}


//iter 0
//iter 50
//iter 100
//iter 150
//iter 200
//iter 250
//iter 300
//iter 350
//iter 400
//iter 450
//iter 500
//iter 550
//iter 600
//iter 650
//iter 700
//iter 750
//iter 800
//iter 850
//iter 900
//iter 950


//How to run for GC analysis:
//java -Xms2g -Xmx2g -XX:+UseG1GC -Xlog:gc*:file=gc.log:time,uptime -jar Hard1.jar

//Explanation: High allocation rate will stress GC; analyze gc.log for pause
// times and promotions. Use this to tune -Xmn and G1 region sizing.