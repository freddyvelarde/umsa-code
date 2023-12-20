package ventas;
import java.util.Scanner;
import ordenes.LS_NormalOrd;

public class LS_NormalVenta extends ListaSimpleVenta {

  public LS_NormalVenta() { super(); }

  public boolean esVacia() {
    if (P == null)
      return true;
    return false;
  }

  public void adiPrincipio(String fecha, LS_NormalOrd lord) {
    NodoVenta nuevo = new NodoVenta(fecha, lord);

    nuevo.setSig(P);
    P = nuevo;
  }

  public void adiFinal(String fecha, LS_NormalOrd lord) {
    NodoVenta nuevo = new NodoVenta(fecha, lord);

    if (esVacia())
      P = nuevo;
    else {
      NodoVenta R = P;
      while (R.getSig() != null) {
        R = R.getSig();
      }
      R.setSig(nuevo);
    }
  }

  public void mostrar() {
    NodoVenta R = P;
    while (R != null) {
      R.mostrar();

      R = R.getSig();
    }
  }

  public int nroNodos() {
    NodoVenta R = P;
    int c = 0;
    if (this.esVacia())
      return 0;
    else {
      while (R != null) {
        c++;
        R = R.getSig();
      }
    }
    return c;
  }

  public NodoVenta eliPrincipio() {
    NodoVenta x = new NodoVenta();
    if (!esVacia()) {
      x = P;
      P = P.getSig();
      x.setSig(null);
    }
    return x;
  }

  public NodoVenta eliFinal() {
    NodoVenta x = new NodoVenta();
    if (!esVacia()) {
      if (nroNodos() == 1) {
        x = P;
        P = null;
      } else {
        NodoVenta R = P;
        NodoVenta S = P;
        while (R.getSig() != null) {
          S = R;
          R = R.getSig();
        }
        x = R;
        S.setSig(null);
      }
    }
    return x;
  }

  public void leer2(int n) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i <= n; i++) {
      System.out.println("\u001B[33m"
                         + "insert: nro de ordenes:"
                         + "\u001B[0m");
      int nroOrdenes = scanner.nextInt();

      LS_NormalOrd lord = new LS_NormalOrd();

      lord.leer2(nroOrdenes);

      System.out.println("\u001B[36m"
                         + "insert: fecha"
                         + "\u001B[0m");

      String fecha = scanner.next();

      adiFinal(fecha, lord);
    }
  }
  public void leer1(int n) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i <= n; i++) {
      System.out.println("insert: nro de ordenes:");
      int nroOrdenes = scanner.nextInt();
      LS_NormalOrd lord = new LS_NormalOrd();

      lord.leer1(nroOrdenes);

      System.out.println("insert: fecha");

      String fecha = scanner.next();

      adiPrincipio(fecha, lord);
    }
  }
}
