import java.util.Scanner;

public class XorEnNumeros {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      long a = sc.nextLong();
      long b = sc.nextLong();
      long k = sc.nextLong();
      System.out.println(findKthNumber(a, b, k));
    }

    sc.close();
  }

  public static long findKthNumber(long a, long b, long k) {
    long lcm = (a / gcd(a, b)) * b;
    long left = 1, right = (long)1e18, ans = -1;

    while (left <= right) {
      long mid = left + (right - left) / 2;
      if (count(mid, a, b, lcm) >= k) {
        ans = mid;
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return ans;
  }

  public static long count(long x, long a, long b, long lcm) {
    return (x / a) + (x / b) - 2 * (x / lcm);
  }

  public static long gcd(long a, long b) {
    while (b != 0) {
      long temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}
