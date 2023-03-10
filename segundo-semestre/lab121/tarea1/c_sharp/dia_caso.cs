class MainClass {
  public static void Main(string[] args) {
    System.Console.WriteLine("Introduce un numero del i al 7: ");
    int number = System.Convert.ToInt32(System.Console.ReadLine());

    if (number >= 1 && number <= 7) {
      switch (number) {
      case 1:
        System.Console.WriteLine("Lunes");
        break;
      case 2:
        System.Console.WriteLine("Martes");
        break;
      case 3:
        System.Console.WriteLine("Miercoles");
        break;
      case 4:
        System.Console.WriteLine("Jueves");
        break;
      case 5:
        System.Console.WriteLine("Viernes");
        break;
      case 6:
        System.Console.WriteLine("Sabado");
        break;
      case 7:
        System.Console.WriteLine("Domingo");
        break;
      }
    }
  }
}
