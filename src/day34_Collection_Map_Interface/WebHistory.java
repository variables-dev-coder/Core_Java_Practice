package day34_Collection_Map_Interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class WebHistory {
    public static void main(String[] args) {
        Map<String, String> recentPages = new LinkedHashMap<>();

        recentPages.put("google.com", "Search Engine");
        recentPages.put("youtube.com", "Video Platform");
        recentPages.put("github.com", "Code Hosting");
        recentPages.put("stackoverflow.com", "Q&A Forum");

        System.out.println("🔗 Recently Visited Pages (in order):");
        for (Map.Entry<String, String> entry : recentPages.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Access specific info
        System.out.println("\nDescription for github.com: " + recentPages.get("github.com"));

        // Check if a site is visited
        System.out.println("Visited twitter.com? " + recentPages.containsKey("twitter.com"));
    }
}
