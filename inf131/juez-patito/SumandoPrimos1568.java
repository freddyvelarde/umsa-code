import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] primeNums = getAllPrimeNums(2, 100000);

    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      int beginIndex = 0;

      int counter = 0;
      while (beginIndex < primeNums.length && primeNums[beginIndex] <= n) {

        int res = 0;
        if (primeNums[beginIndex] > n) {
          break;
        }

        for (int i = beginIndex; i < primeNums.length; i++) {
          if (res >= n) {
            break;
          }
          int p = primeNums[i];
          res += p;
        }
        if (res == n) {
          counter++;
        }
        beginIndex++;
      }
      System.out.println(counter);
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
