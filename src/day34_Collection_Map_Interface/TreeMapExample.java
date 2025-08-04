package day34_Collection_Map_Interface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> studentRanks = new TreeMap<>();

        studentRanks.put(3, "Ayesha");
        studentRanks.put(1, "Munna");
        studentRanks.put(2, "Rahul");
        studentRanks.put(5, "Zoya");
        studentRanks.put(4, "Sameer");

        System.out.println("🎓 Students by Rank (sorted):");
        for (Map.Entry<Integer, String> entry : studentRanks.entrySet()) {
            System.out.println("Rank " + entry.getKey() + " → " + entry.getValue());
        }

        // Accessing sorted map methods
        System.out.println("\nFirst Rank: " + studentRanks.firstKey());
        System.out.println("Last Rank: " + studentRanks.lastKey());
        System.out.println("Student at or above rank 3: " + studentRanks.ceilingEntry(3));
        System.out.println("Student below rank 4: " + studentRanks.lowerEntry(4));
    }
}
