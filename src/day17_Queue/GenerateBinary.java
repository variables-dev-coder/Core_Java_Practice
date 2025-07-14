package day17_Queue;


// Generate Binary Numbers from 1 to N using Queue

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinary {

    public static void generallyBinaryNumbers(int n) {
        Queue<String> q = new LinkedList<>();
        q.offer("1");

        for (int i = 1; i <= n; i++) {
            String curr = q.poll();
            System.out.println(curr + " ");
            q.offer(curr + "0");
            q.offer(curr + "1");
        }
    }

    public static void main(String[] args) {
        generallyBinaryNumbers(100);
    }
}
