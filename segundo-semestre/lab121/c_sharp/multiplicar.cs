using System;

class MainClass {
  public static void Main(string[] args) {
    int a;
    int y;

    Console.WriteLine("Dame un numero:");
    a = Convert.ToInt32(Console.ReadLine());
    a *= 3;

    Console.WriteLine(a);
  }
}
