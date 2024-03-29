import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class VenPrimo2401 {
  public static void main(String[] args) {
    List<Integer> primes_stored = sieveOfEratosthenes(1000);
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] primes = new int[size];

    int n = 0;
    int i = 0;
    while (scanner.hasNext()) {
      n = scanner.nextInt();
      if (i > size) {
        break;
      }

      if (isPrime(n, primes_stored) && !contains(primes, n)) {

        primes[i] = n;
        i++;
      }
    }

    if (isPrime(n, primes_stored) && !contains(primes, n)) {
      primes[i] = n;
    }
    insertionSort(primes);

    for (int prime : primes) {

      System.out.print(prime + " ");
    }
    System.out.println();
  }

  static List<Integer> sieveOfEratosthenes(int n) {
    boolean[] sieve = new boolean[n + 1];
    for (int i = 0; i < sieve.length; i++) {
      sieve[i] = true;
    }

    List<Integer> primes = new ArrayList<>();
    sieve[0] = sieve[1] = false;

    for (int p = 2; p * p <= n; p++) {
      if (sieve[p]) {
        for (int i = p * p; i <= n; i += p) {
          sieve[i] = false;
        }
      }
    }

    for (int i = 2; i < sieve.length; i++) {
      if (sieve[i]) {
        primes.add(i);
      }
    }

    return primes;
  }

  static boolean isPrime(int n, List<Integer> primes) {
    if (n <= 1)
      return false;

    for (int prime : primes) {
      if (prime * prime > n)
        break;

      if (n % prime == 0)
        return false;
    }
    primes.add(n);
    return true;
  }
  public static void insertionSort(int[] arr) {
    int n = arr.length;

    for (int i = 1; i < n; i++) {
      int key = arr[i];
      int j = i - 1;

      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }
  public static boolean contains(int[] arr, int target) {
    for (int num : arr) {
      if (num == target) {
        return true;
      }
    }
    return false;
  }
}
