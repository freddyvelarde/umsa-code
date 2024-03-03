import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FactorPrimoMasLargo1282 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int limit = 100000;
    List<Integer> primes = sieveOfEratosthenes(2, (long)limit);

    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      int i = 0;
      int primeFactor = primes.get(i);

      List<Integer> primeFactors = new ArrayList<>();
      while (primeFactor <= n) {
        if (n % primeFactor == 0) {
          primeFactors.add(primeFactor);
        }
        i++;
        primeFactor = primes.get(i);
      }
      System.out.println(primeFactors.get(primeFactors.size() - 1));
    }
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
