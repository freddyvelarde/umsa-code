import java.util.Scanner;

public class UnBit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();
      sol(n);
    }
  }
  public static void sol(int n) {
    String binary = "1";
    for (int i = 0; i < n - 1; i++) {
      binary += "0";
    }
    System.out.println(Long.parseLong(binary, 2));
  }
}
