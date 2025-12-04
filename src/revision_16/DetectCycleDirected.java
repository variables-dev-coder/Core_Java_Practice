package revision_16;

import java.util.*;

public class DetectCycleDirected {

    public static boolean hasCycle(Map<Integer, List<Integer>> graph) {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> recStack = new HashSet<>();

        for (int node : graph.keySet()) {
            if (dfs(node, graph, visited, recStack))
                return true;
        }
        return false;
    }

    private static boolean dfs(int node, Map<Integer, List<Integer>> graph,
                               Set<Integer> visited, Set<Integer> recStack) {

        if (recStack.contains(node))
            return true;
        if (visited.contains(node))
            return false;

        visited.add(node);
        recStack.add(node);

        for (int nbr : graph.getOrDefault(node, new ArrayList<>())) {
            if (dfs(nbr, graph, visited, recStack))
                return true;
        }

        recStack.remove(node);
        return false;
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1));
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(0)); // cycle

        System.out.println(hasCycle(graph)); // true
    }
}
