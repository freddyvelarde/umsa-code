import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class GraphImproved<T> {
  private Map<T, LinkedList<T>> adjList;

  GraphImproved() { this.adjList = new HashMap<>(); }

  public void addVertex(T vertx) {
    if (!adjList.containsKey(vertx))
      this.adjList.put(vertx, new LinkedList<T>());
  }
  public void addEdge(T vertxA, T vertxB) { addEdge(vertxA, vertxB, false); }

  public void addEdge(T vertxA, T vertxB, boolean isConnected) {
    LinkedList<T> verticesForVertxA = this.adjList.get(vertxA);
    LinkedList<T> verticesForVertxB = this.adjList.get(vertxB);
    if (!isConnected) {
      if (verticesForVertxA != null && !verticesForVertxA.contains(vertxB))
        verticesForVertxA.add(vertxB);
    } else {
      if (verticesForVertxB != null && !verticesForVertxB.contains(vertxA)) {
        verticesForVertxA.add(vertxB);
        verticesForVertxB.add(vertxA);
      }
    }
  }

  public int size() { return this.adjList.size(); }

  public void DFS(T startVertx) {
    Set<T> visited = new HashSet<>();
    Stack<T> stack = new Stack<>();

    stack.push(startVertx);
    visited.add(startVertx);

    while (!stack.isEmpty()) {
      T currentVertex = stack.pop();
      System.out.println(currentVertex);

      for (T adjacentVertex : adjList.get(currentVertex)) {
        if (!visited.contains(adjacentVertex)) {
          stack.push(adjacentVertex);
          visited.add(adjacentVertex);
        }
      }
    }
  }

  public void BFS(T startVertx) {
    Queue<T> queue = new LinkedList<>();
    Map<T, Boolean> visited = new HashMap<>();

    for (T v : this.adjList.keySet()) {
      visited.put(v, false);
    }

    queue.add(startVertx);
    visited.put(startVertx, true);

    while (!queue.isEmpty()) {
      T currentVertx = queue.poll();
      System.out.println(currentVertx);

      LinkedList<T> verticesForCurrentVertx = this.adjList.get(currentVertx);

      if (verticesForCurrentVertx != null) {
        for (T v : verticesForCurrentVertx) {
          if (!visited.get(v)) {
            queue.add(v);
            visited.put(v, true);
          }
        }
      }
    }
  }

  public void printGraph() {
    for (Map.Entry<T, LinkedList<T>> entry : adjList.entrySet()) {

      T vertx = entry.getKey();
      LinkedList<T> vertices = entry.getValue();

      System.out.print(vertx + " goes to: ");
      for (T v : vertices) {
        System.out.print(v + " ");
      }
      System.out.println();
    }
  }
}
