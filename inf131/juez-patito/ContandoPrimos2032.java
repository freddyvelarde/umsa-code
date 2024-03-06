import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    List<Integer> primes = sieveOfEratosthenes(2, 100000);
    Scanner scanner = new Scanner(System.in);
    /* System.out.println(countAdjacentPrimes( */
    /*     "55340720509901003942189550090730167570911344", primes)); */

    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      String num = scanner.next();

      System.out.println(countAdjacentPrimes(num, primes));
    }
  }

  static int countAdjacentPrimes(String numStr, List<Integer> primes) {
    int primesCounter = 0;
    int length = numStr.length();
    HashSet<Integer> primesFound = new HashSet<>();

    for (int i = 0; i < length; i++) {
      for (int j = i + 1; j <= Math.min(i + 5, length); j++) {
        String subString = numStr.substring(i, j);
        int subNum = Integer.parseInt(subString);
        if (isPrime(subNum, primes) && !primesFound.contains(subNum)) {
          primesFound.add(subNum);
          primesCounter++;
        }
      }
    }
    return primesCounter;
  }

  static boolean isPrime(int n, List<Integer> primes) {
    if (n <= 1)
      return false;

    for (int p : primes) {
      if (n == p)
        return true;
      else if (n % p == 0) {
        return false;
      }
    }
    for (int i = 0; i <= Math.sqrt(n); i++) {
      int p = primes.get(i);
      if (n % p == 0)
        return false;
    }

    primes.add(n);
    return true;
  }

  public static List<Integer> sieveOfEratosthenes(int start, long n) {
    boolean[] primes = new boolean[(int)(n - start + 1)];
    List<Integer> primeList = new ArrayList<>();

    for (int i = 0; i < primes.length; i++) {
      primes[i] = true;
    }

    int sqrtN = (int)Math.sqrt(n);
    for (int p = 2; p <= sqrtN; p++) {
      int i = Math.max(2, (start + p - 1) / p);
      for (int j = i * p; j <= n; j += p) {
        if (j >= start) {
          primes[(int)(j - start)] = false;
        }
      }
    }

    for (int i = 0; i < primes.length; i++) {
      if (primes[i]) {
        primeList.add(i + start);
      }
    }
    return primeList;
  }
}
