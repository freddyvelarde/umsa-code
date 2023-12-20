package Zona;
import java.util.Scanner;

public class ColaSimpleZonas extends ColaZonas {

  public ColaSimpleZonas() { super(); }
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
  public void adi(Zona elem) {
    if (esLlena())
      System.out.println("cola simple llena!!!");
    else {
      fi++;
      v[fi] = elem;
    }
  }
  public Zona eli() {
    Zona elem = new Zona("");
    if (esVacia())
      System.out.println("Cola simple vacia!!");
    else {
      fr++;
      elem = v[fr];
    }
    return elem;
  }
  public int nroElem() { return (fi - fr); }
  public void vaciar(ColaSimpleZonas z) {
    while (!z.esVacia()) {
      adi(z.eli());
    }
  }
  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);

    for (int i = 1; i <= n; i++) {
      System.out.println("Intr. nombre zona");
      String nom = lee.next();

      Zona x = new Zona(nom);
      adi(x);
    }
  }
  public void mostrar() {
    ColaSimpleZonas aux = new ColaSimpleZonas();
    Zona x;
    while (!esVacia()) {
      x = eli();
      System.out.println("Zona: " + x.getNombreZona());
      aux.adi(x);
    }
    vaciar(aux);
  }
}
