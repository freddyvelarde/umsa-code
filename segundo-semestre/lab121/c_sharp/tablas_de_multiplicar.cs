class MainClass {
  public static void Main(string[] args) {
    int a;
    int b;
    int c;

    for (a = 1; a <= 10; a++) {
      System.Console.WriteLine("Tabla: " + a);

      for (b = 1; b <= 10; b++) {
        c = a * b;
        System.Console.WriteLine(a + " x " + b + " = " + c);
      }
    }
  }
}
