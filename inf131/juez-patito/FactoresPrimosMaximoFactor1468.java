import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int limit = 100000;
    List<Integer> primes = sieveOfEratosthenes(2, (long)limit);

    int start = 2;
    Map<Integer, Integer> data = new HashMap<>();
    while (start <= limit) {
      int r = countPrimeFactors(start, primes);
      data.put(start, r);
      start++;
    }

    while (scanner.hasNext()) {

      int a = scanner.nextInt();
      int b = scanner.nextInt();

      int i = a;

      int max = 0;
      int num = 0;
      while (i >= a && i <= b) {
        int value = data.get(i);
        if (value >= max) {
          max = value;
          num = i;
        }
        i++;
      }
      System.out.println(num + " tiene " + max + " divisores");
    }
  }

  static int countPrimeFactors(int n, List<Integer> primes) {
    int i = 0;
    int c = 0;
    int primeFactor = primes.get(i);
    while (primeFactor <= n) {
      if (n % primeFactor == 0) {
        c++;
        while (n % primeFactor == 0) {
          n /= primeFactor;
        }
      }
      i++;
      if (i < primes.size()) {
        primeFactor = primes.get(i);
      } else {
        break;
      }
    }
    return c;
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
