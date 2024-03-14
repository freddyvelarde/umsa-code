import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

class Graph {
  private Map<Integer, LinkedList<Integer>> adj = new HashMap<>();

  public Integer size() { return adj.size(); }

  public void addVertice(Integer vert) {
    adj.put(vert, new LinkedList<Integer>());
  }

  public void addEdge(Integer vertA, Integer vertB) {
    adj.get(vertA).add(vertB);
  }

  public void printGraph() {
    for (Map.Entry<Integer, LinkedList<Integer>> entry : adj.entrySet()) {
      Integer key = entry.getKey();
      LinkedList<Integer> values = entry.getValue();

      System.out.print(key + " goes to: ");
      for (Integer value : values) {
        System.out.print(value + " ");
      }
      System.out.println();
    }
  }

  public void DFS(int startVertex) {
    Set<Integer> visited = new HashSet<>();
    DFSUtil(startVertex, visited);
  }

  private void DFSUtil(int vertex, Set<Integer> visited) {
    visited.add(vertex);
    System.out.print(vertex + " ");

    LinkedList<Integer> neighbors = adj.get(vertex);
    for (int neighbor : neighbors) {
      if (!visited.contains(neighbor)) {
        DFSUtil(neighbor, visited);
      }
    }
  }

  public boolean BFS(int firstVert, int target) {
    Queue<Integer> visitedVert = new LinkedList<>();
    Map<Integer, Boolean> visited = new HashMap<>();
    for (int vert : adj.keySet()) {
      visited.put(vert, false);
    }

    visitedVert.add(firstVert);
    visited.put(firstVert, true);

    while (!visitedVert.isEmpty()) {
      int vertx = visitedVert.poll();
      if (vertx == target)
        return true;

      LinkedList<Integer> vertices = adj.get(vertx);
      if (vertices != null) {
        for (int v : vertices) {
          if (!visited.get(v)) {
            visitedVert.add(v);
            visited.put(v, true);
          }
        }
      }
    }
    return false;
  }
}

public class GrafoNoDirigido2459 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Graph g = new Graph();

    int m = scanner.nextInt();
    int n = scanner.nextInt();
    int c = scanner.nextInt();

    for (int i = 1; i <= m; i++) {
      g.addVertice(i);
    }

    for (int i = 0; i < n; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      g.addEdge(a, b);
    }

    for (int i = 0; i < c; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      if (g.BFS(a, b))
        System.out.println(1);
      else
        System.out.println(0);
    }

    /* g.printGraph(); */
  }
}
