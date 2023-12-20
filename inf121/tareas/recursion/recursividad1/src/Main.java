class Main {
  public static void main(String[] args) {
    System.out.println("sumatoria:");
    System.out.println(sumatoria(10));
    System.out.println("potencia:");
    System.out.println(potencia(2, 10));
    System.out.println("suma par:");
    System.out.println(sumaPar(10));
    System.out.println("fibonacci:");
    System.out.println(fibonacci(5));
    System.out.println("Suma digitos:");
    System.out.println(sumaDig(1384));
    System.out.println("contar digitos:");
    System.out.println(contarDig(1384));
    System.out.println("mostrar:");
    mostrar(10);
  }

  static int contarDig(int n) {
    if (n == 0)
      return 0;
    else {
      return contarDig(n / 10) + 1;
    }
  }

  static int sumaDig(int n) {
    if (n == 0)
      return 0;
    else
      return sumaDig(n / 10) + (n % 10);
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

    else {
      if (n == 2)
        return 1;
      else {
        return fibonacci(n - 1) + fibonacci(n - 2);
      }
    }
  }

  static int sumaPar(int n) {
    if (n < 1)
      return 0;
    return (n * 2) + sumaPar(n - 1);
  }

  static int potencia(int a, int b) {
    if (b == 0)
      return 1;

    return a * potencia(a, b - 1);
  }

  static int sumatoria(int n) {
    if (n < 1)
      return 0;
    return n + sumatoria(n - 1);
  }
}
