public class Main {
  public static void main(String[] args) {
    System.out.println("Nombre: Freddy Erick Velarde Silva");
    System.out.println("CI: 13827575");
    System.out.println("Sumatoria:");
    System.out.println(sumatoria(10));
    System.out.println("potencia:");
    System.out.println(potencia(2, 10));
    System.out.println("Suma par:");
    System.out.println(sumaPar(10));
    System.out.println("Fibonacci:");
    System.out.println(fibonacci(6));
    System.out.println("Suma de digitos:");
    System.out.println(sumaDig(1384));
    System.out.println("Contar digitos:");
    System.out.println(contarDig(1384));
    System.out.println("Conteo regresivo:");
    mostrar(10);

    System.out.println("Suma Rusa:");
    System.out.println(mr(11, 4));
    System.out.println("Es palidrome oruro?");
    if (esPal("oruro"))
      System.out.println("Si es palidrome");
    else
      System.out.println("No es palindrome");
  }
  static boolean esPal(String s) {
    if (s.length() <= 1)
      return true;
    return s.charAt(0) == s.charAt(s.length() - 1) &&
        esPal(s.substring(1, s.length() - 1));
  }

  static int mr(int a, int b) {
    if (a == 0)
      return 0;
    if (a % 2 == 0)
      return mr(a / 2, b + b);

    return mr(a / 2, b + b) + b;
  }

  static int contarDig(int n) {
    if (n == 0)
      return 0;
    return contarDig(n / 10) + 1;
  }

  static int sumaDig(int n) {
    if (n == 0)
      return 0;
    return (sumaDig(n / 10) + (n % 10));
  }

  static void mostrar(int n) {
    if (n != 0) {
      mostrar(n - 1);
      System.out.println(n);
    }
  }

  static int fibonacci(int n) {
    if (n == 1)
      return 0;

    if (n == 2)
      return 1;

    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  static int sumatoria(int n) {
    if (n > 0)
      return (n + sumatoria(n - 1));
    else
      return 0;
  }

  static int potencia(int a, int b) {
    if (b == 0)
      return 1;
    else
      return a * potencia(a, b - 1);
  }

  static int sumaPar(int n) {
    if (n == 0)
      return 0;
    return n * 2 + sumaPar(n - 1);
  }
}
