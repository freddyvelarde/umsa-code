class MainClass {
  public static void Main(string[] args) {
    int x;
    int y;

    System.Console.WriteLine("Dame dos numeros: ");

    x = System.Convert.ToInt32(System.Console.ReadLine());
    y = System.Convert.ToInt32(System.Console.ReadLine());

    if (x != y) {
      if (x > y) {
        System.Console.WriteLine("x es mayor");
      } else {
        System.Console.WriteLine("y es mayor");
      }
    }

    System.Console.WriteLine("son iguales");
  }
}
