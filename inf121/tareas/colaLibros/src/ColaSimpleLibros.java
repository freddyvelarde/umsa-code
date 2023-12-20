import java.util.Scanner;

public class ColaSimpleLibros extends ColaLibros {

  public ColaSimpleLibros() { super(); }
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
    Libro elem = new Libro("", "", 0);
    if (esVacia())
      System.out.println("Cola simple vacia!!");
    else {
      fr++;
      elem = v[fr];
    }
    return elem;
  }
  public int nroElem() { return (fi - fr); }
  public void vaciar(ColaSimpleLibros z) {
    while (!z.esVacia()) {
      adi(z.eli());
    }
  }
  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);

    for (int i = 1; i <= n; i++) {
      System.out.println("Intr. titulo, autor, precio");
      String titulo = lee.next();
      String autor = lee.next();
      int nota = lee.nextInt();

      Libro x = new Libro(titulo, autor, nota);
      adi(x);
    }
  }
  public void mostrar() {
    ColaSimpleLibros aux = new ColaSimpleLibros();
    Libro x;
    while (!esVacia()) {
      x = eli();
      x.mostrar();
      aux.adi(x);
    }
    vaciar(aux);
  }
}
