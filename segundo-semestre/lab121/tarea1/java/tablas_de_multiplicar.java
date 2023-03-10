class Main {
  public static void main(String[] args) {
    int a;
    int b;
    int c;

    for (a = 1; a <= 10; a++) {
      System.out.println("Tabla: " + a);

      for (b = 1; b <= 10; b++) {
        c = a * b;
        System.out.println(a + " x " + b + " = " + c);
      }
    }
  }
}
