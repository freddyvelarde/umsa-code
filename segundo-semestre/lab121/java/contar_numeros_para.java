import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int contador;
    int positivos = 0;
    int numero;

    for (contador = 1; contador <= 10; contador++) {
      System.out.println("Dame un numero: ");
      numero = reader.nextInt();
      if (numero > 0) {
        positivos++;
      }
    }
    System.out.println("Has introducido: " + positivos +
                       " numeros mayores a cero");
  }
}
