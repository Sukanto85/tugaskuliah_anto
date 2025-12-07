package Tugas_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BFSGraphSearch {
    static Map<String, List<String>> graph = new HashMap<>();
 static Map<String, Integer> values = new HashMap<>();

 public static void main(String[] args) {
     // nilai node yang di input 8 elemen 
     values.put("a1", 10);
     values.put("a2", 23);
     values.put("a3", 5);
     values.put("a4", 42); // contoh target pencarian 
     values.put("a5", 17);
     values.put("a6", 8);
     values.put("a7", 99);
     values.put("a8", 56);

     // adjacency node
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

     // Target pencarian node 
     int target = 23;
     if (args.length > 0) {
         try { target = Integer.parseInt(args[0]); }
         catch(Exception e) { System.out.println("Argumen invalid, gunakan angka. Menggunakan default n=42."); }
     }

     bfs("a1", target);   // Diawali dengan target a1
 }

 static void addEdge(String u, String v) {
     graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
     graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
 }

 static void bfs(String start, int target) {
     Queue<String> q = new LinkedList<>();
     Set<String> visited = new LinkedHashSet<>();
     Map<String, String> parent = new HashMap<>();

     q.add(start);
     visited.add(start);

     boolean found = false;
     while (!q.isEmpty()) {
         System.out.println("Queue state: " + q);
         String node = q.poll();
         System.out.println("Dequeue -> Visiting " + node + " (value=" + values.get(node) + ")");
         if (values.get(node) != null && values.get(node) == target) {
             found = true;
             List<String> path = new LinkedList<>();
             String cur = node;
             while (cur != null) { path.add(0, cur); cur = parent.get(cur); }
             System.out.println("Found target at " + node + ". Path: " + path);
             break;
         }
         for (String nei : graph.getOrDefault(node, Collections.emptyList())) {
             if (!visited.contains(nei)) {
                 visited.add(nei);
                 parent.put(nei, node);
                 q.add(nei);
                 System.out.println("  Enqueue " + nei + " (parent=" + node + ")");
             }
         }
     }
     if (!found) System.out.println("Value " + target + " not found.");
     System.out.println("Visited order: " + visited);
 }
}
