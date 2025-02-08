import java.util.Scanner;

class Rumores {
  static class UnionFind {
    private int[] par, rank;

    public UnionFind(int n) {
      par = new int[n + 1];
      rank = new int[n + 1];
      for (int i = 1; i <= n; i++) {
        par[i] = i;
        rank[i] = 1;
      }
    }

    public int find(int x) {
      if (par[x] != x) {
        par[x] = find(par[x]);
      }
      return par[x];
    }

    public void union(int x, int y) {
      int rootX = find(x);
      int rootY = find(y);

      if (rootX != rootY) {
        if (rank[rootX] > rank[rootY]) {
          par[rootY] = rootX;
        } else if (rank[rootX] < rank[rootY]) {
          par[rootX] = rootY;
        } else {
          par[rootY] = rootX;
          rank[rootX]++;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    while (t-- > 0) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      UnionFind uf = new UnionFind(n);

      for (int i = 0; i < m; i++) {
        int u = scanner.nextInt();
        int v = scanner.nextInt();
        uf.union(u, v);
      }

      int x = scanner.nextInt();
      int y = scanner.nextInt();

      if (uf.find(x) == uf.find(y)) {
        System.out.println("SI");
      } else {
        System.out.println("NO");
      }
    }

    scanner.close();
  }
}
