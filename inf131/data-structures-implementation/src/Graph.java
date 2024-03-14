import java.util.*;

public class Graph<T> {
  private Map<T, LinkedList<T>> adjList;

  public Graph() { this.adjList = new HashMap<>(); }

  public void addVertex(T vertex) {
    if (!adjList.containsKey(vertex))
      this.adjList.put(vertex, new LinkedList<T>());
  }

  public void addEdge(T vertexA, T vertexB) {
    addEdge(vertexA, vertexB, false);
  }

  public void addEdge(T vertexA, T vertexB, boolean isConnected) {
    LinkedList<T> verticesForVertexA = this.adjList.get(vertexA);
    LinkedList<T> verticesForVertexB = this.adjList.get(vertexB);
    if (!isConnected) {
      if (verticesForVertexA != null && !verticesForVertexA.contains(vertexB))
        verticesForVertexA.add(vertexB);
    } else {
      if (verticesForVertexB != null && !verticesForVertexB.contains(vertexA)) {
        verticesForVertexA.add(vertexB);
        verticesForVertexB.add(vertexA);
      }
    }
  }

  public int size() { return this.adjList.size(); }

  public void dfs(T startVertex) {
    Set<T> visited = new HashSet<>();
    Stack<T> stack = new Stack<>();

    stack.push(startVertex);
    visited.add(startVertex);

    while (!stack.isEmpty()) {
      T currentVertex = stack.pop();
      System.out.println(currentVertex);

      LinkedList<T> adjacentVertices = adjList.get(currentVertex);
      if (adjacentVertices != null) {
        for (T adjacentVertex : adjacentVertices) {
          if (!visited.contains(adjacentVertex)) {
            stack.push(adjacentVertex);
            visited.add(adjacentVertex);
          }
        }
      }
    }
  }

  public void bfs(T startVertex) {
    Queue<T> queue = new LinkedList<>();
    Map<T, Boolean> visited = new HashMap<>();

    for (T vertex : this.adjList.keySet()) {
      visited.put(vertex, false);
    }

    queue.add(startVertex);
    visited.put(startVertex, true);

    while (!queue.isEmpty()) {
      T currentVertex = queue.poll();
      System.out.println(currentVertex);

      LinkedList<T> adjacentVertices = this.adjList.get(currentVertex);

      if (adjacentVertices != null) {
        for (T vertex : adjacentVertices) {
          if (!visited.get(vertex)) {
            queue.add(vertex);
            visited.put(vertex, true);
          }
        }
      }
    }
  }

  public void printGraph() {
    for (Map.Entry<T, LinkedList<T>> entry : adjList.entrySet()) {
      T vertex = entry.getKey();
      LinkedList<T> vertices = entry.getValue();

      System.out.print(vertex + " goes to: ");
      for (T v : vertices) {
        System.out.print(v + " ");
      }
      System.out.println();
    }
  }
}
