import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    double nota1;
    double nota2;
    double nota3;
    double promedio;

    System.out.println("Ingrese nota1: ");
    nota1 = scanner.nextDouble();

    System.out.println("Ingrese nota2: ");
    nota2 = scanner.nextDouble();

    System.out.println("Ingrese nota3: ");
    nota3 = scanner.nextDouble();

    promedio = (nota1 + nota2 + nota3) / 3;

    System.out.println(promedio);
  }
}
