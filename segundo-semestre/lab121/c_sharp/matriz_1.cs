class MainClass {
  public static void Main(string[] args) {
    string[,] a = new string[10, 4];
    int i;
    int n;

    n = System.Convert.ToInt32(System.Console.ReadLine());
    i = 1;

    for (i = 1; i <= n; i++) {
      a[1, i] = System.Console.ReadLine();
      a[2, i] = System.Console.ReadLine();
      a[3, i] = System.Console.ReadLine();
    }
    for (i = 1; i <= n; i++) {
      System.Console.WriteLine(a[1, i]);
      System.Console.WriteLine(a[2, i]);
      System.Console.WriteLine(a[3, i]);
    }
  }
}
