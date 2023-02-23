class MainClass {
  public static void Main(string[] args) {
    int contador = 1;
    int suma = 0;

    while (contador <= 5) {
      suma = suma + contador;
      contador++;
    }
    System.Console.WriteLine("La Suma es: " + suma);
  }
}
