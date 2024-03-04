import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NumerosPrimosFibo2288 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<Integer, Integer> data = new HashMap<>();

    int[] fib = new int[1000];
    fib[0] = 0;
    fib[1] = 1;
    data.put(0, 0);
    data.put(1, 1);

    List<Integer> primes = sieveOfEratosthenes(2, 1000);

    for (int i = 2; i < 1000; i++) {
      fib[i] = fib[i - 1] + fib[i - 2];
      if (fib[i] <= 1000) {
        data.put(i, fib[i]);
      } else {
        break;
      }
    }

    while (scanner.hasNext()) {
      int x = scanner.nextInt();

      if (x >= data.size()) {
        System.out.println("No es primo");
        continue;
      }
      int num = data.get(x);

      if (isPrime(num, primes))
        System.out.println("Es primo");
      else
        System.out.println("No es primo");
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
}
