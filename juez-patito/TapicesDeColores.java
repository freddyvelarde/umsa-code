import java.util.Scanner;

public class TapicesDeColores {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < n; i++) {
      String s = sc.nextLine();
      System.out.println(minCambios(s));
    }
  }

  public static int minCambios(String s) {
    int cambios = 0;

    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) {
        cambios++;
        i++;
      }
    }

    return cambios;
  }
}
