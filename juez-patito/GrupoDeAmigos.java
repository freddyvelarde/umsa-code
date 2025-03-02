import java.util.Scanner;

class DSU {
  private int[] parent, rank;

  public DSU(int n) {
    parent = new int[n];
    rank = new int[n];
    for (int i = 0; i < n; i++) {
      parent[i] = i;
      rank[i] = 1;
    }
  }

  public int find(int x) {
    if (parent[x] != x)
      parent[x] = find(parent[x]);
    return parent[x];
  }

  public void unite(int a, int b) {
    int rootA = find(a);
    int rootB = find(b);
    if (rootA != rootB) {
      if (rank[rootA] > rank[rootB]) {
        parent[rootB] = rootA;
      } else if (rank[rootA] < rank[rootB]) {
        parent[rootA] = rootB;
      } else {
        parent[rootB] = rootA;
        rank[rootA]++;
      }
    }
  }
}

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    DSU dsu = new DSU(n);

    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      dsu.unite(a, b);
    }

    int groups = 0;
    for (int i = 0; i < n; i++) {
      if (dsu.find(i) == i)
        groups++;
    }

    System.out.println(groups);
    sc.close();
  }
}
