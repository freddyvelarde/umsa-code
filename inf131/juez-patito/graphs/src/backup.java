import java.util.*;

class GraphCustom<T> {
  private Map<T, LinkedList<T>> adjList;

  public GraphCustom() { this.adjList = new HashMap<>(); }

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

  public int findIslands() {
    Set<T> visited = new HashSet<>();
    int islands = 0;

    for (T node : this.adjList.keySet()) {
      if (!visited.contains(node)) {
        islands++;
        dfsNonRecursive(node, visited);
      }
    }

    return islands;
  }

  private void dfsNonRecursive(T startNode, Set<T> visited) {
    Stack<T> stack = new Stack<>();
    stack.push(startNode);

    while (!stack.isEmpty()) {
      T node = stack.pop();
      visited.add(node);

      List<T> neighbors = this.adjList.get(node);
      if (neighbors != null) {
        for (T neighbor : neighbors) {
          if (!visited.contains(neighbor)) {
            stack.push(neighbor);
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

/* class CuantosGrafos1061 { */
class Maindd {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Map<Integer, Boolean> primes = sieveOfEratosthenes(2, 2000);

    GraphCustom<Integer> g = new GraphCustom<>();
    int c = 2;
    while (scanner.hasNext()) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      if (a == 0 && b == 0)
        break;

      for (int i = a; i <= b; i++) {
        g.addVertex(i);
      }

      for (int i = a; i <= b; i++) {
        if (a % 2 == 0) {
          for (int j = a + 1; j <= b; j += 2) {
            if (isPrime(i + j, primes)) {
              /* System.out.println(i + " " + j); */
              g.addEdge(i, j, true);
            }
          }
        } else {
          for (int j = a; j <= b; j += 2) {
            if (isPrime(i + j, primes)) {
              /* System.out.println(i + " " + j); */
              g.addEdge(i, j, true);
            }
          }
        }
      }
      System.out.println(g.findIslands());
      g = new GraphCustom<Integer>();
    }
  }
  public static Map<Integer, Boolean> sieveOfEratosthenes(int start, int n) {
    boolean[] primes = new boolean[n - start + 1];
    Map<Integer, Boolean> primeList = new HashMap<>();

    for (int i = 0; i < primes.length; i++) {
      primes[i] = true;
    }

    int sqrtN = (int)Math.sqrt(n);
    for (int p = 2; p <= sqrtN; p++) {
      int i = Math.max(2, (start + p - 1) / p);
      for (int j = i * p; j <= n; j += p) {
        if (j >= start) {
          primes[j - start] = false;
        }
      }
    }

    for (int i = start; i <= n; i++) {
      if (primes[i - start])
        primeList.put(i, true);
      else
        primeList.put(i, false);
    }
    return primeList;
  }

  public static boolean isPrime(int n, Map<Integer, Boolean> primes) {
    if (n <= 1) {
      return false;
    }
    if (primes.containsKey(n)) {
      return primes.get(n);
    }
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        primes.put(n, false);
        return false;
      }
    }
    primes.put(n, true);
    return true;
  }
}
