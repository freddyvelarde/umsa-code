import java.util.*;

public class EsUnNumeroCuadrado2319 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      int x = sc.nextInt();
      int[] factors = new int[x];
      for (int j = 0; j < x; j++) {
        int a = sc.nextInt();
        factors[j] = a;
      }
      solution(factors);
    }
  }
  static void solution(int[] nums) {

    long r = 1;
    Set<Integer> factors = new HashSet<>();
    for (int n : nums) {

      for (int f : findPrimeFactorsOf(n)) {
        if (factors.size() > 3) {
          System.out.println("El producto no es numero cuadrado");
          return;
        }

        if (!factors.contains(f)) {
          factors.add(f);
        }
      }
    }
    System.out.println("EL producto es numero cuadrado");
  }
  static List<Integer> findPrimeFactorsOf(long n) {
    int counter = 0;
    List<Integer> factors = new ArrayList<>();
    int i = 2;
    while (i * i <= n) {
      while (n % i == 0) {
        factors.add(i);
        counter++;
        while (n % i == 0) {
          n /= i;
        }
      }
      i++;
    }
    if (n > 1) {
      factors.add((int)n);
      counter++;
    }
    return factors;
  }
}
