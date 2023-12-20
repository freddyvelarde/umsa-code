package combo;
import java.util.Scanner;

public class LS_NormalCb extends ListaSimpleCb {

  public LS_NormalCb() { super(); }

  public boolean esVacia() {
    if (P == null)
      return true;
    return false;
  }

  public void adiPrincipio(int nroCombo, String nombre, int precio) {
    NodoCb nuevo = new NodoCb(nroCombo, nombre, precio);

    nuevo.setSig(P);
    P = nuevo;
  }

  public void adiFinal(int nroCombo, String nombre, int precio) {
    NodoCb nuevo = new NodoCb(nroCombo, nombre, precio);

    if (esVacia())
      P = nuevo;
    else {
      NodoCb R = P;
      while (R.getSig() != null) {
        R = R.getSig();
      }
      R.setSig(nuevo);
    }
  }

  public void mostrar() {
    NodoCb R = P;
    while (R != null) {
      R.mostrar();
      R = R.getSig();
    }
  }

  public int nroNodos() {
    NodoCb R = P;
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

  public NodoCb eliPrincipio() {
    NodoCb x = new NodoCb();
    if (!esVacia()) {
      x = P;
      P = P.getSig();
      x.setSig(null);
    }
    return x;
  }

  public NodoCb eliFinal() {
    NodoCb x = new NodoCb();
    if (!esVacia()) {
      if (nroNodos() == 1) {
        x = P;
        P = null;
      } else {
        NodoCb R = P;
        NodoCb S = P;
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

  public void leer1(int n) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i <= n; i++) {
      System.out.println("insert: nro combo, nombre, precio");
      int nroCombo = scanner.nextInt();
      String nombre = scanner.next();
      int precio = scanner.nextInt();

      adiPrincipio(nroCombo, nombre, precio);
    }
  }

  public void leer2(int n) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i <= n; i++) {
      System.out.println("insert: nro combo, nombre, precio");
      int nroCombo = scanner.nextInt();
      String nombre = scanner.next();
      int precio = scanner.nextInt();

      adiFinal(nroCombo, nombre, precio);
    }
  }
}
