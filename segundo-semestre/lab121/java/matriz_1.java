import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    String[][] a = new String[10][4];
    int i;
    int n;

    n = reader.nextInt();
    i = 1;

    for (i = 1; i <= n; i++) {
      a[1][i] = reader.nextLine();
      a[2][i] = reader.nextLine();
      a[3][i] = reader.nextLine();
    }
    for (i = 1; i <= n; i++) {
      System.out.println(a[1][i]);
      System.out.println(a[2][i]);
      System.out.println(a[3][i]);
    }
  }
}
