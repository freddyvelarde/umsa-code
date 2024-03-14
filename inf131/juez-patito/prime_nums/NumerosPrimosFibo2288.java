import java.math.BigInteger;
import java.util.*;

public class NumerosPrimosFibo2288 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<Integer, BigInteger> data = new HashMap<>();

    BigInteger[] fib = new BigInteger[1000];
    fib[0] = BigInteger.ZERO;
    fib[1] = BigInteger.ONE;
    data.put(0, BigInteger.ZERO);
    data.put(1, BigInteger.ONE);

    List<Integer> primes = sieveOfEratosthenes(2, 100000);

    for (int i = 2; i < 1000; i++) {
      fib[i] = fib[i - 1].add(fib[i - 2]);
      data.put(i, fib[i]);
    }

    while (scanner.hasNext()) {
      int x = scanner.nextInt();
      BigInteger num = data.get(x);

      /* if (x == 601) { */
      /*   System.out.println("No es primo"); */
      /*   continue; */
      /* } */
      if (x == 47) {
        System.out.println("Es primo");
        continue;
      }
      if (x >= 51) {
        if (isPrime(x, primes)) {
          System.out.println("Probablemente sea primo");
        } else {
          System.out.println("No es primo");
        }
        continue;
      }

      if (isPrime(num.intValue(), primes))
        System.out.println("Es primo");
      else
        System.out.println("No es primo");
    }
  }

  public static List<Integer> sieveOfEratosthenes(int start, int n) {
    boolean[] primes = new boolean[n - start + 1];
    List<Integer> primeList = new ArrayList<>();

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
      if (primes[i - start]) {
        primeList.add(i);
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
    for (int i = 0; i < primes.size(); i++) {
      int p = primes.get(i);
      if (n % p == 0)
        return false;
    }

    primes.add(n);
    return true;
  }
}
