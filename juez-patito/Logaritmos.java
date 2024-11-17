import java.util.Scanner;
class Logaritmos {
  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNext()) {

      int a = scanner.nextInt();
      int n = scanner.nextInt();
      System.out.println(log(n, a));
    }
  }

  public static int log(int base, int n) {
    return (int)(Math.log10(base) / Math.log10(n));
  }
}
