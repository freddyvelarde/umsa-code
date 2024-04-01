import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int x = scanner.nextInt();
    int y = scanner.nextInt();
    if (x > y) {
      int temp = y;
      y = x;
      x = temp;
    }

    recursiveLoop(x, y);
  }

  static void recursiveLoop(int x, int y) {
    if (y <= x) {
      System.out.println(y);
      return;
    }
    System.out.println(y);
    recursiveLoop(x, y - 1);
  }
}
