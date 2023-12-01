import java.util.Scanner;

public class LS_Normal extends ListaSimple {
  private Scanner scanner = new Scanner(System.in);

  public LS_Normal() { super(); }

  public boolean esVacia() {
    if (P == null)
      return true;
    return false;
  }

  public void adiPrincipio(int z) {
    Nodo nuevo = new Nodo();
    nuevo.setQ(z);
    nuevo.setSig(P); // el siguiente del nodo nuevo apunta a nodo raiz
    P = nuevo;       // P apunta a nuevo
  }

  public void adiFinal(int z) {
    Nodo nuevo = new Nodo();
    nuevo.setQ(z);

    if (esVacia())
      P = nuevo; // p apunta a nuevo
    else {
      Nodo R = P;
      while (R.getSig() != null) {
        R = R.getSig();
      }
      R.setSig(nuevo);
    }
  }

  public void mostrar() {
    Nodo R = P; // R apunta  a la raiz P
    while (R != null) {
      System.out.println("#####");
      System.out.println(R.getQ());
      R = R.getSig();
    }
  }

  public int nroNodos() {
    Nodo R = P;
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

  public Nodo eliPrincipio() {
    Nodo x = new Nodo();
    if (!esVacia()) {
      x = P; // x apunta a la raiz P
      P = P.getSig();
      x.setSig(null);
    }
    return x;
  }

  public Nodo eliFinal() {
    Nodo x = new Nodo();
    if (!esVacia()) {
      if (nroNodos() == 1) {
        x = P; // x apunta a la raiz P
        P = null;
      } else {
        Nodo R = P;
        Nodo S = P;
        while (R.getSig() != null) {
          S = R;          // S apunta a R
          R = R.getSig(); // R apunta al siguiente de R
        }
        x = R;
        S.setSig(null);
      }
    }
    return x;
  }

  public void leer1(int n) {
    for (int i = 1; i <= n; i++) {
      int z = this.scanner.nextInt();
      adiPrincipio(z);
    }
  }

  public void leer2(int n) {
    for (int i = 1; i <= n; i++) {
      int z = this.scanner.nextInt();
      adiFinal(z);
    }
  }
}
