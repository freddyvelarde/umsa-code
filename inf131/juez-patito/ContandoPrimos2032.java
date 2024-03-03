import java.util.ArrayList;
import java.util.List;

public class ContandoPrimos2032 {
  public static void main(String[] args) { countingPrimes("1272317"); }

  static void countingPrimes(String num) {

    List<Integer> primes = generatePrimes(limit);

    for (int i = 0; i < num.length(); i++) {
      char c = num.charAt(i);
      System.out.println(c);
    }
  }

  public static List<Integer> generatePrimes(int limit) {
    int numBits = (limit + 1) / 2; // We only need to store odd numbers
    boolean[] primeBits = new boolean[numBits];
    List<Integer> primes = new ArrayList<>();

    for (int i = 3; i * i <= limit; i += 2) {
      if (!primeBits[i / 2]) {
        for (int j = i * i; j <= limit; j += 2 * i) {
          primeBits[j / 2] = true;
        }
      }
    }

    primes.add(2); // 2 is prime
    for (int i = 1; i < numBits; i++) {
      if (!primeBits[i]) {
        primes.add(2 * i + 1); // Convert back to odd numbers
      }
    }

    return primes;
  }
}

public class SieveOfEratosthenesImproved {

  public static void main(String[] args) {
    int limit = 10000000000;
    System.out.println("Number of primes up to " + limit + ": " +
                       primes.size());
  }
}
