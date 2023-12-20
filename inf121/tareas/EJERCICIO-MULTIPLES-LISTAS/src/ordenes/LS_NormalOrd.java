package ordenes;
import java.util.Scanner;
import pedidos.LS_NormalCbPed;

public class LS_NormalOrd extends ListaSimpleOrd {

  public LS_NormalOrd() { super(); }

  public boolean esVacia() {
    if (P == null)
      return true;
    return false;
  }

  public void adiPrincipio(String nomComensal, LS_NormalCbPed lped) {
    NodoOrd nuevo = new NodoOrd(nomComensal, lped);

    nuevo.setSig(P);
    P = nuevo;
  }

  public void adiFinal(String nomComensal, LS_NormalCbPed lped) {
    NodoOrd nuevo = new NodoOrd(nomComensal, lped);

    if (esVacia())
      P = nuevo;
    else {
      NodoOrd R = P;
      while (R.getSig() != null) {
        R = R.getSig();
      }
      R.setSig(nuevo);
    }
  }

  public void mostrar() {
    NodoOrd R = P;
    while (R != null) {
      R.mostrar();

      R = R.getSig();
    }
  }

  public int nroNodos() {
    NodoOrd R = P;
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

  public NodoOrd eliPrincipio() {
    NodoOrd x = new NodoOrd();
    if (!esVacia()) {
      x = P;
      P = P.getSig();
      x.setSig(null);
    }
    return x;
  }

  public NodoOrd eliFinal() {
    NodoOrd x = new NodoOrd();
    if (!esVacia()) {
      if (nroNodos() == 1) {
        x = P;
        P = null;
      } else {
        NodoOrd R = P;
        NodoOrd S = P;
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
      System.out.println("\u001B[31m"
                         + "insert: nro combos:"
                         + "\u001B[0m");
      int nroCbPed = scanner.nextInt();
      LS_NormalCbPed lPed = new LS_NormalCbPed();

      lPed.leer2(nroCbPed);

      System.out.println("\u001B[34m"
                         + "insert: nom Comensal"
                         + "\u001B[0m");

      String nomComensal = scanner.next();

      adiFinal(nomComensal, lPed);
    }
  }
  public void leer1(int n) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i <= n; i++) {
      System.out.println("insert: nro combos:");
      int nroCbPed = scanner.nextInt();
      LS_NormalCbPed lPed = new LS_NormalCbPed();

      lPed.leer1(nroCbPed);

      System.out.println("insert: nom Comensal");

      String nomComensal = scanner.next();

      adiPrincipio(nomComensal, lPed);
    }
  }
}
