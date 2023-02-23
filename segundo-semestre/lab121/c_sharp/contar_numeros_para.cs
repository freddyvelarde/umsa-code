class MainClass {
  public static void Main(string[] args) {
    int contador;
    int positivos = 0;
    int numero;

    for (contador = 1; contador <= 10; contador++) {
      System.Console.WriteLine("Dame un numero: ");
      numero = System.Convert.ToInt32(System.Console.ReadLine());
      if (numero > 0) {
        positivos++;
      }
    }
    System.Console.WriteLine("Has introducido: " + positivos +
                             " numeros mayores a cero");
  }
}
