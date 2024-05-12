import java.util.*;

class XorEnNumeros {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      long divisor = sc.nextLong(), position = sc.nextLong();
      bs(position, divisor);
    }
  }

  static void bs(long n, long k) {
    long l = 0, r = (long)1e18;

    while (l + 1 < r) {
      long mid = (l + r) / 2;
      long x = mid - (mid / k);

      if (n <= x)
        r = mid;
      else
        l = mid;
    }
    System.out.println(r);
  }
}
