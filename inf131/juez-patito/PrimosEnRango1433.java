import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PrimosEnRango1433 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    List<Integer> primes = generatePrimes(b);

    int c = 0;
    for (int p : primes) {
      if (p > b)
        break;
      if (p >= a && p <= b)
        c++;
    }
    System.out.println(c);
  }
  public static List<Integer> generatePrimes(int limit) {
    int numBits = (limit + 1) / 2;
    boolean[] primeBits = new boolean[numBits];
    List<Integer> primes = new ArrayList<>();

    for (int i = 3; i * i <= limit; i += 2) {
      if (!primeBits[i / 2]) {
        for (int j = i * i; j <= limit; j += 2 * i) {
          primeBits[j / 2] = true;
        }
      }
    }

    primes.add(2);
    for (int i = 1; i < numBits; i++) {
      if (!primeBits[i]) {
        primes.add(2 * i + 1);
      }
    }

    return primes;
  }
}
