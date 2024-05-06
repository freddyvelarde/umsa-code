import java.util.*;

class Chichico1681 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();

      int y = 0;
      for (int j = 0; j < n; j++) {
        int d = sc.nextInt();
        y += d;
      }
      solution(n + 1, y);
    }
  }

  static void solution(int x, int y) {

    int c = 0;
    for (int i = 1; i <= 5; i++) {

      int t = (y + i) % x;
      if (t != 1) {
        c++;
      }
    }
    System.out.println(c);
  }
}
