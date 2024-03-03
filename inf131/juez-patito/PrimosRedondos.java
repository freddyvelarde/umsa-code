import java.util.ArrayList;
import java.util.List;

public class PrimosRedondos {

  public static void main(String[] args) {
    long limit = 10000000000L; // Utiliza el sufijo 'L' para indicar que el
                               // número es del tipo long
    List<Integer> primes = generatePrimes(limit);

    System.out.println("Number of primes up to " + limit + ": " +
                       primes.size());
  }

  /* public static List<Integer> generatePrimes(long limit) { */
  /*   int numBits = (int)((limit + 1) / 2); */
  /*   boolean[] primeBits = new boolean[numBits]; */
  /*   List<Integer> primes = new ArrayList<>(); */
  /*  */
  /*   for (int i = 3; i * i <= limit; i += 2) { */
  /*     if (!primeBits[i / 2]) { */
  /*       for (long j = (long)i * i; j <= limit; j += 2 * i) { */
  /*         primeBits[(int)(j / 2)] = true; */
  /*       } */
  /*     } */
  /*   } */
  /*  */
  /*   primes.add(2); // 2 is prime */
  /*   for (int i = 1; i < numBits; i++) { */
  /*     if (!primeBits[i]) { */
  /*       primes.add(2 * i + 1); // Convert back to odd numbers */
  /*     } */
  /*   } */
  /*  */
  /*   return primes; */
  /* } */
  public static List<Integer> generatePrimes(long limit) {
    int size = (int)(limit / 2) + 1; // Tamaño del arreglo primeBits
    boolean[] primeBits = new boolean[size];
    List<Integer> primes = new ArrayList<>();

    for (int i = 3; i * i <= limit; i += 2) {
      if (!primeBits[i / 2]) {
        for (long j = (long)i * i; j <= limit; j += 2 * i) {
          if (j % 2 != 0) {
            primeBits[(int)(j / 2)] = true;
          }
        }
      }
    }

    primes.add(2); // 2 es primo
    for (int i = 1; i < size; i++) {
      if (!primeBits[i]) {
        primes.add(2 * i + 1); // Convertir de nuevo a números impares
      }
    }

    return primes;
  }
}
