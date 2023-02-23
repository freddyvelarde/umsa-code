class MainClass {
  public static void Main(string[] args) {
    int x;
    for (x = 1; x <= 10; x++) {
      if (x % 2 == 0) {
        System.Console.WriteLine("el numero: " + x + " es par");
      } else {
        System.Console.WriteLine("el numero: " + x + " es impar");
      }
    }
  }
}
