import java.util.Scanner;

class TriPrimos1822 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      long x = scanner.nextLong();
      countingDividers(x);
    }
  }

  static void countingDividers(long n) {

    int limit = (int)Math.sqrt(n);

    int c = 0;
    for (int i = 1; i <= limit; i++) {
      if (n % i == 0) {
        if (n / i == i)
          c++;
        else {
          c += 2;
        }
      }
    }
    if (c == 3)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}
