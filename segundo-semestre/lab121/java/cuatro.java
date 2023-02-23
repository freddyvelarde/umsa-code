import java.util.Scanner;

class Cuatro {
  public static void main(String args[]) {
    Scanner reader = new Scanner(System.in);
    int x;
    int y;

    System.out.println("Dame 2 numeros: ");
    x = reader.nextInt();
    y = reader.nextInt();

    if (x != y) {
      if (x > y) {
        System.out.println("x es mayor");
      } else {
        System.out.println("y es mayor");
      }
    }
    System.out.println("son iguales");
  }
}
