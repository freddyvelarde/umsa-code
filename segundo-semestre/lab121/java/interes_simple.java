import java.util.Scanner;

class Interes_simple {
  public static void main(String args[]) {
    Scanner reader = new Scanner(System.in);

    double interes;
    double capital;
    double tiempo;
    double pin;

    System.out.println("Ingrese interes: ");
    interes = reader.nextDouble();

    System.out.println("Ingrese capital: ");
    capital = reader.nextDouble();

    System.out.println("Ingrese tiempo en años: ");
    tiempo = reader.nextDouble();

    pin = ((interes * capital) / tiempo);
    System.out.println("Su interes simple es de: " + pin);
  }
}
