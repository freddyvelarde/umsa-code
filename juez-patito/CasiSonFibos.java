import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(), M = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();

    sol(n, M, a, b);
  }

  public static void sol(int n, int M, int a, int b) {
    int x = 0;
    for (int i = 2; i < n; i++) {
      x = (a + b) % M;
      a = b;
      b = x;
    }

    System.out.println(x);
  }
}
