import java.util.Scanner;
class Main {
  public static int A(int m, int n) {
    if (0 == m) {
      return n + 1;
    } else if (m > 0 && n == 0) {
      return A(m - 1, 1);
    }
    return A(m - 1, A(m, n - 1));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {

      int m = sc.nextInt(), n = sc.nextInt();
      System.out.println(A(m, n));
    }
  }
}
