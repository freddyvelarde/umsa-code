package pedidos;
import java.util.Scanner;

public class LS_NormalCbPed extends ListaSimpleCbPed {

  public LS_NormalCbPed() { super(); }

  public boolean esVacia() {
    if (P == null)
      return true;
    return false;
  }

  public void adiPrincipio(int nroCombo, int cantidad) {
    NodoCbPed nuevo = new NodoCbPed(nroCombo, cantidad);

    nuevo.setSig(P);
    P = nuevo;
  }

  public void adiFinal(int nroCombo, int cantidad) {
    NodoCbPed nuevo = new NodoCbPed(nroCombo, cantidad);

    if (esVacia())
      P = nuevo;
    else {
      NodoCbPed R = P;
      while (R.getSig() != null) {
        R = R.getSig();
      }
      R.setSig(nuevo);
    }
  }

  public void mostrar() {
    NodoCbPed R = P;
    while (R != null) {
      R.mostrar();
      R = R.getSig();
    }
  }

  public int nroNodos() {
    NodoCbPed R = P;
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

  public NodoCbPed eliPrincipio() {
    NodoCbPed x = new NodoCbPed();
    if (!esVacia()) {
      x = P;
      P = P.getSig();
      x.setSig(null);
    }
    return x;
  }

  public NodoCbPed eliFinal() {
    NodoCbPed x = new NodoCbPed();
    if (!esVacia()) {
      if (nroNodos() == 1) {
        x = P;
        P = null;
      } else {
        NodoCbPed R = P;
        NodoCbPed S = P;
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
      System.out.println("insert: nro combo, cantidad:");
      int nroCombo = scanner.nextInt();
      int cantidad = scanner.nextInt();

      adiPrincipio(nroCombo, cantidad);
    }
  }

  public void leer2(int n) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i <= n; i++) {
      System.out.println("\u001B[32m"
                         + "insert: nro combo, cantidad:"
                         + "\u001B[0m");
      int nroCombo = scanner.nextInt();
      int cantidad = scanner.nextInt();

      adiFinal(nroCombo, cantidad);
    }
  }
}
