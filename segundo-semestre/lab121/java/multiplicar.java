import java.util.Scanner;

class Multiplicar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a;
    int y;

    System.out.println("Dame un numero:");
    a = scanner.nextInt();
    a *= 3;

    System.out.println(a);
  }
}
