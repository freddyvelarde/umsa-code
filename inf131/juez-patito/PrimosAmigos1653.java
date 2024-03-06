import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNext()) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      int gcd = getGCD(a, b);

      if (gcd == 1)
        System.out.println("PRIMOS AMIGOS");
      else
        System.out.println("PRIMOS ENEMIGOS");
    }
  }

  static int getGCD(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }

    return a;
  }
}
