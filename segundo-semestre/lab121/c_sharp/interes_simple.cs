class MainClass {
  public static void Main(string[] args) {
    double interes;
    double capital;
    double tiempo;
    double pin;

    System.Console.WriteLine("Ingrese interes: ");
    string interes_string = System.Console.ReadLine();
    interes = float.Parse(interes_string);

    System.Console.WriteLine("Ingrese capital: ");
    string capital_string = System.Console.ReadLine();
    capital = float.Parse(capital_string);

    System.Console.WriteLine("Ingrese tiempo en años: ");
    string tiempo_string = System.Console.ReadLine();
    tiempo = float.Parse(tiempo_string);

    pin = (interes * capital) / tiempo;

    System.Console.WriteLine("El interes simple es de: " + pin);
  }
}
