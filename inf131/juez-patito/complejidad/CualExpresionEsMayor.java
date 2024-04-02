import java.util.Scanner;

public class CualExpresionEsMayor {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int T = scanner.nextInt();

    for (int i = 0; i < T; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      if (a >= 5) {
        System.out.println("True");
        continue;
      }

      if (a == 4 && b < 81) {
        System.out.println("True");
        continue;
      }
      if (a == 3 && b < 11) {
        System.out.println("True");
        continue;
      }
      if (a == 2 && b < 3) {
        System.out.println("True");
        continue;
      }
      System.out.println("False");
    }
  }
}
