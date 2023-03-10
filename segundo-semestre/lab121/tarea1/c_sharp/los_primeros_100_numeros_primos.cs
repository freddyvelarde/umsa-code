class MainClass {
  public static void Main(string[] args) {
    int a;
    int b;
    int c;
    for (a = 1; a < 101; a++) {
      c = 0;
      for (b = 1; b <= a; b++) {
        if (a % b == 0) {
          c++;
        }
      }
      if (c == 2) {
        System.Console.WriteLine(a);
      }
    }
  }
}
