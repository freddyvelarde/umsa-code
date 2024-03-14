import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Graph<String> g = new Graph<>();

    g.addVertex("a");
    g.addVertex("b");
    g.addVertex("c");
    g.addVertex("d");
    g.addVertex("e");
    g.addVertex("f");
    g.addVertex("g");
    g.addVertex("h");
    g.addVertex("i");

    /* g.addEdge("a", "b", true); */
    /* g.addEdge("b", "c", true); */

    g.addEdge("a", "b", true);
    g.addEdge("a", "c", true);
    g.addEdge("a", "d", true);
    g.addEdge("a", "e", true);
    g.addEdge("b", "f", true);
    g.addEdge("c", "f", true);
    g.addEdge("d", "g", true);
    g.addEdge("e", "h", true);
    g.addEdge("e", "f", true);
    g.addEdge("h", "i", true);
    g.addEdge("f", "i", true);

    /* g.addEdge("a", "b"); */
    /* g.addEdge("a", "c"); */
    /* g.addEdge("a", "d"); */
    /* g.addEdge("a", "e"); */
    /* g.addEdge("b", "f"); */
    /* g.addEdge("c", "f"); */
    /* g.addEdge("d", "g"); */
    /* g.addEdge("e", "h"); */
    /* g.addEdge("h", "i"); */
    /* g.addEdge("f", "i"); */

    System.out.println("BFS:");
    g.bfs("a");
    System.out.println("DFS:");
    g.dfs("a");
    /* g.printGraph(); */
  }
}
