import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    for (int i = 0; i < t; i++) {
      int n = scanner.nextInt();
      int r = 0;
      for (int j = 0; j < n; j++) {
        int a = scanner.nextInt();
        r += a;
      }
      if (r % n == 0) {
        System.out.println(0);

      } else {
        System.out.println(1);
      }
    }
  }
}
