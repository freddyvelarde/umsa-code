import java.util.*;

public class Futbol2 {
  static class Point {
    int x, y;
    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  static class Node implements Comparable<Node> {
    int id;
    double dist;
    Node(int id, double dist) {
      this.id = id;
      this.dist = dist;
    }

    public int compareTo(Node other) {
      return Double.compare(this.dist, other.dist);
    }
  }

  static double[][] distanceMatrix;
  static int n;

  // Método para calcular la distancia euclidiana
  static double calculateDistance(Point a, Point b) {
    return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
  }

  // Algoritmo de Dijkstra para encontrar la distancia mínima entre A y B
  static double dijkstra(int start, int end) {
    PriorityQueue<Node> pq = new PriorityQueue<>();
    boolean[] visited = new boolean[n];
    double[] minDist = new double[n];
    Arrays.fill(minDist, Double.MAX_VALUE);

    pq.add(new Node(start, 0));
    minDist[start] = 0;

    while (!pq.isEmpty()) {
      Node current = pq.poll();
      int u = current.id;
      if (visited[u])
        continue;
      visited[u] = true;

      for (int v = 0; v < n; v++) {
        if (!visited[v]) {
          double newDist = minDist[u] + distanceMatrix[u][v];
          if (newDist < minDist[v]) {
            minDist[v] = newDist;
            pq.add(new Node(v, newDist));
          }
        }
      }
    }
    return minDist[end];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    Point[] players = new Point[n];

    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      players[i] = new Point(x, y);
    }

    // Crear la matriz de distancias
    distanceMatrix = new double[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i != j) {
          distanceMatrix[i][j] = calculateDistance(players[i], players[j]);
        } else {
          distanceMatrix[i][j] = 0;
        }
      }
    }

    int q = sc.nextInt();
    for (int i = 0; i < q; i++) {
      int a = sc.nextInt() - 1; // Convertir a índice 0
      int b = sc.nextInt() - 1; // Convertir a índice 0
      double result = dijkstra(a, b);
      System.out.printf("%.2f\n", result);
    }

    sc.close();
  }
}
