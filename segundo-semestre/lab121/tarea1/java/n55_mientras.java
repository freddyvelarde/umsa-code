class Main {
  public static void main(String[] args) {
    int contador = 1;
    int suma = 0;

    while (contador <= 5) {
      suma = suma + contador;
      contador++;
    }
    System.out.println("La Suma es: " + suma);
  }
}
