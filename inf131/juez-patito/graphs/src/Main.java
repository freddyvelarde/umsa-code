import java.util.*;

class Main {
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

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Map<Integer, Boolean> primes = sieveOfEratosthenes(2, 2000);

    while (scanner.hasNext()) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      if (a == 0 && b == 0)
        break;

      UnionFind uf = new UnionFind(b - a + 1);

      for (int i = a; i <= b; i++) {
        for (int j = a; j <= b; j++) {
          if (isPrime(i + j, primes)) {
            uf.union(i - a, j - a);
          }
        }
      }

      System.out.println(uf.countSets());
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
