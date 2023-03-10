using System;

class MainClass {
  public static void Main(string[] args) {
    double nota1;
    double nota2;
    double nota3;
    double promedio;

    Console.WriteLine("Ingresar nota1: ");
    string nota1_string = Console.ReadLine();
    nota1 = float.Parse(nota1_string);

    Console.WriteLine("Ingresar nota2: ");
    string nota2_string = Console.ReadLine();
    nota2 = float.Parse(nota2_string);

    Console.WriteLine("Ingresar nota3: ");
    string nota3_string = Console.ReadLine();
    nota3 = float.Parse(nota3_string);

    promedio = (nota1 + nota2 + nota3) / 3;

    Console.WriteLine(promedio);
  }
}
