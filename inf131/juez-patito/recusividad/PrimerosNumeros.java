import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    recursiveLoop(n, 0);
  }
  static void recursiveLoop(int n, int start) {
    if (start >= n) {
      System.out.println(start);
      return;
    }
    System.out.println(start);
    recursiveLoop(n, start + 1);
  }
}
