import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    conutDivisors(n);
  }

  public static void conutDivisors(int n) {
    int c = 0;
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        c++;
        if (i != n / i) {
          c++;
        }
      }
    }
    System.out.println(c);
  }
}
