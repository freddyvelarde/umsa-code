import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] primeNums = getAllPrimeNums(2, 100000);
    int q = scanner.nextInt();

    for (int i = 0; i < q; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      int res = 0;

      for (int j = 0; j < primeNums.length; j++) {
        int n = primeNums[j];
        if (n >= x && n <= y) {
          res += n;
        }
      }

      System.out.println(res);
    }
  }

  public static int[] getAllPrimeNums(int x, int y) {
    int[] primeNums = new int[9592];

    boolean[] primes = new boolean[y + 1];
    for (int i = 2; i <= y; i++) {
      primes[i] = true;
    }

    for (int p = 2; p * p <= y; p++) {
      if (primes[p]) {
        for (int i = Math.max(p * p, ((x + p - 1) / p) * p); i <= y; i += p) {
          primes[i] = false;
        }
      }
    }
    int c = 0;
    for (int i = Math.max(2, x); i <= y; i++) {
      if (primes[i]) {
        primeNums[c] = i;
        c++;
      }
    }

    return primeNums;
  }
}
