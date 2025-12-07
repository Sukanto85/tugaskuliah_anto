package Tugas_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

//algoritma Depth-First Search (DFS) 
public class DFSGraphSearch {
     static Map<String, List<String>> graph = new HashMap<>();
 static Map<String, Integer> values = new HashMap<>();
 static Set<String> visited = new LinkedHashSet<>();
 static Map<String, String> parent = new HashMap<>();
 static boolean found = false;
 static int targetN;

 public static void main(String[] args) {
     // nilai node ( 8 elemen yang di input )
     values.put("a1", 10);
     values.put("a2", 23);
     values.put("a3", 5);
     values.put("a4", 42); // contoh target defult (target N )
     values.put("a5", 17);
     values.put("a6", 8);
     values.put("a7", 99);
     values.put("a8", 56);

     // Adjacency List
     addEdge("a1", "a2");
     addEdge("a1", "a3");
     addEdge("a2", "a4");
     addEdge("a2", "a5");
     addEdge("a3", "a6");
     addEdge("a4", "a7");
     addEdge("a5", "a6");
     addEdge("a5", "a8");
     addEdge("a6", "a7");
     addEdge("a7", "a8");

     // target values 42 yang akan dicari
     targetN = 42;
     if (args.length > 0) {
         try { targetN = Integer.parseInt(args[0]); }
         catch(Exception e) { System.out.println("Argumen invalid, gunakan angka. Menggunakan values n=42."); }
     }

     String start = "a1";
     System.out.println("=== DFS (start=" + start + ", target=" + targetN + ") ===");
     dfs(start);

     System.out.println("\nVisited order: " + visited);

     if (found) {
         System.out.println("Found value " + targetN + " at node:");
         String foundNode = null;
         for (String v : visited) {
             if (values.get(v) != null && values.get(v) == targetN) { foundNode = v; break; }
         }
         System.out.println(" -> " + foundNode);
         // reconstruct path
         List<String> path = new LinkedList<>();
         String cur = foundNode;
         while (cur != null) { path.add(0, cur); cur = parent.get(cur); }
         System.out.println("Path: " + path);
     } else {
         System.out.println("Value " + targetN + " not found.");
     }
 }

 static void addEdge(String u, String v) {
     graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
     graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
 }

 static void dfs(String node) {
     if (found) return;
     visited.add(node);
     System.out.println("Visiting " + node + " (value=" + values.get(node) + ")");
     if (values.get(node) != null && values.get(node) == targetN) {
         found = true;
         return;
     }
     for (String nei : graph.getOrDefault(node, Collections.emptyList())) {
         if (!visited.contains(nei)) {
             parent.put(nei, node);
             System.out.println("  -> Going deeper to " + nei);
             dfs(nei);
             if (found) return;
             System.out.println("  <- Backtracking to " + node + " from " + nei);
         }
     }
 }
}
