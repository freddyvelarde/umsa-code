import java.util.*;

class ContandoBits1881 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    for (int i = 0; i < t; i++) {
      long l = scanner.nextLong(), r = scanner.nextLong();
      solution(l, r);
    }
  }

  static void solution(long l, long r) {
    int numDigits = Long.toBinaryString(r).length();

    long x = (long)Math.pow(2, numDigits) - 1;

    while (x > r) {
      x = (long)Math.pow(2, numDigits) - 1;
      numDigits--;
    }

    if (x >= l) {
      System.out.println(x);
      return;
    }

    // this is the fucking  worst case.
    int max = -1;
    x = -1;
    for (long i = l; i <= r; i++) {
      int bits = Long.bitCount(i);

      if (bits > max) {
        max = bits;
        x = i;
      }
    }
    System.out.println(x);
  }
}
