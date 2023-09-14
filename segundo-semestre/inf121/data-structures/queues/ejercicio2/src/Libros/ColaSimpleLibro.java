import java.util.Scanner;

public class ColaSimpleLibro extends ColaLibro {
  public ColaSimpleLibro() { super(); }
  public boolean esVacia() {
    if (fr == fi)
      return true;
    return false;
  }
  public boolean esLlena() {
    if (fi == MAX - 1)
      return true;
    return false;
  }
  public void adi(Libro elem) {
    if (esLlena())
      System.out.println("cola simple llena!!!");
    else {
      fi++;
      v[fi] = elem;
    }
  }
  public Libro eli() {
    Libro elem = new Libro("", 0, "", "");
    if (esVacia())
      System.out.println("Cola simple vacia!!");
    else {
      fr++;
      elem = v[fr];
    }
    return elem;
  }
  public int nroElem() { return (fi - fr); }
  public void vaciar(ColaSimpleLibro z) {
    while (!z.esVacia()) {
      adi(z.eli());
    }
  }

  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);

    for (int i = 1; i <= n; i++) {
      System.out.println("Introduce código de libro, precio, título y autor:");
      String codLib = lee.next();
      int precio = lee.nextInt();
      String titulo = lee.next();
      String autor = lee.next();

      Libro libro = new Libro(codLib, precio, titulo, autor);
      adi(libro);
    }
    /* lee.close(); */
  }

  public void mostrar() {
    ColaSimpleLibro aux = new ColaSimpleLibro();
    Libro x;
    while (!esVacia()) {
      x = eli();
      x.mostrar();
      aux.adi(x);
    }
    vaciar(aux);
  }
}
