class MainClass {
  public static void Main(string[] args) {
    string[] a = new string[10];
    int b;
    b = 0;
    while (b < 10) {
      System.Console.WriteLine("Nombre:");
      string name = System.Console.ReadLine();
      a[b] = name;
      b++;
    }
    for (b = 0; b < 9; b++) {
      System.Console.WriteLine(a[b]);
    }
  }
}
