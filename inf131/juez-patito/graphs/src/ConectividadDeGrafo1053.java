import java.util.Scanner;

class ConectividadDeGrafo1053 {
  static int getCharNum(char l) { return (int)l - 65; }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    scanner.nextLine(); // Consume the newline character after reading n
    for (int i = 0; i < n; i++) {
      String line = scanner.nextLine();
      int size = 0;
      if (!line.isEmpty())
        size = getCharNum(line.charAt(0));

      UnionFind uf = new UnionFind(size + 1);

      // Process input until an empty line or end of input
      while (scanner.hasNextLine()) {
        String vertices = scanner.nextLine().trim();

        if (vertices.isEmpty()) {
          break; // Break the loop if an empty line is encountered
        }

        int a = getCharNum(vertices.charAt(0));
        int b = getCharNum(vertices.charAt(1));
        uf.union(a, b);
      }

      System.out.println(uf.countSets());
      System.out.println(); // Print empty line after each test case
    }
  }

  /* public static void main(String[] args) { */
  /*   Scanner scanner = new Scanner(System.in); */
  /*  */
  /*   int n = scanner.nextInt(); */
  /*  */
  /*   scanner.nextLine(); */
  /*   for (int i = 0; i < n; i++) { */
  /*  */
  /*     String line = scanner.nextLine(); */
  /*     int size = 0; */
  /*     if (line.length() != 0) */
  /*       size = getCharNum(line.charAt(0)); */
  /*  */
  /*     UnionFind uf = new UnionFind(size + 1); */
  /*  */
  /*     while (scanner.hasNext()) { */
  /*       String vertices = scanner.nextLine(); */
  /*  */
  /*       if (vertices.isEmpty()) { */
  /*         break; */
  /*       } */
  /*  */
  /*       int a = getCharNum(vertices.charAt(0)); */
  /*       int b = getCharNum(vertices.charAt(1)); */
  /*       uf.union(a, b); */
  /*     } */
  /*  */
  /*     System.out.println(uf.countSets()); */
  /*     System.out.println(); */
  /*   } */
  /* } */

  static class UnionFind {
    private int[] parent;
    private int[] rank;

    public UnionFind(int size) {
      parent = new int[size];
      rank = new int[size];
      for (int i = 0; i < size; i++) {
        parent[i] = i;
      }
    }

    public int find(int x) {
      if (parent[x] != x) {
        parent[x] = find(parent[x]);
      }
      return parent[x];
    }

    public void union(int x, int y) {
      int rootX = find(x);
      int rootY = find(y);
      if (rootX != rootY) {
        if (rank[rootX] < rank[rootY]) {
          parent[rootX] = rootY;
        } else if (rank[rootX] > rank[rootY]) {
          parent[rootY] = rootX;
        } else {
          parent[rootY] = rootX;
          rank[rootX]++;
        }
      }
    }
    public void printSet() {

      for (int i = 0; i < parent.length; i++) {
        System.out.println(parent[i]);
      }
    }

    public int countSets() {
      int count = 0;
      for (int i = 0; i < parent.length; i++) {
        if (parent[i] == i) {
          count++;
        }
      }
      return count;
    }
  }
}
