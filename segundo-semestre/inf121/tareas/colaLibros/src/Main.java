class Main {
  public static void main(String args[]) {
    Libro l1 = new Libro("IA", "perez", 50);
    Libro l2 = new Libro("Php", "rojas", 200);
    Libro l3 = new Libro("java", "flores", 100);
    Libro l4 = new Libro("html", "rojo", 200);

    ColaSimpleLibros l = new ColaSimpleLibros();
    l.adi(l1);
    l.adi(l2);
    l.adi(l3);
    l.adi(l4);

    showExpensiceBook(l);

    System.out.println("Nombre: Velarde Silva Freddy Erick");
    System.out.println("CI: 13827575 LP");
  }

  static void showExpensiceBook(ColaSimpleLibros libros) {
    ColaSimpleLibros librosSwap = new ColaSimpleLibros();

    int max = 0;
    while (!libros.esVacia()) {

      Libro x = libros.eli();

      if (max < x.getPrecio()) {
        max = x.getPrecio();
      }
      librosSwap.adi(x);
    }
    libros.vaciar(librosSwap);

    ColaSimpleLibros librosSwap2 = new ColaSimpleLibros();
    while (!libros.esVacia()) {
      Libro x = libros.eli();
      if (max == x.getPrecio()) {
        x.mostrar();
      }
      librosSwap2.adi(x);
    }
    libros.vaciar(librosSwap2);
  }
}
