import java.util.Scanner;

public class ColaSimpleProy extends ColaProy {

  public ColaSimpleProy() { super(); }
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
  public void adi(Proyecto elem) {
    if (esLlena())
      System.out.println("cola simple llena!!!");
    else {
      fi++;
      v[fi] = elem;
    }
  }
  public Proyecto eli() {
    Proyecto elem = new Proyecto("", "", "");
    if (esVacia())
      System.out.println("Cola simple vacia!!");
    else {
      fr++;
      elem = v[fr];
    }
    return elem;
  }
  public int nroElem() { return (fi - fr); }
  public void vaciar(ColaSimpleProy z) {
    while (!z.esVacia()) {
      adi(z.eli());
    }
  }
  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);

    for (int i = 1; i <= n; i++) {
      System.out.println("Intr. titulo, carrera, expositor");
      String tit = lee.next();
      String car = lee.next();
      String exp = lee.next();

      Proyecto x = new Proyecto(tit, car, exp);
      adi(x);
    }
  }
  public void mostrar() {
    ColaSimpleProy aux = new ColaSimpleProy();
    Proyecto x;
    while (!esVacia()) {
      x = eli();

      System.out.println("Datos Proyecto:");
      System.out.println("\t titulo: " + x.getTitulo());
      System.out.println("\t carrera: " + x.getCarrera());
      System.out.println("\t expositor: " + x.getExpositor());

      aux.adi(x);
    }
    vaciar(aux);
  }
}
