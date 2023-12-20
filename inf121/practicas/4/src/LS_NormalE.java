import java.util.Scanner;

public class LS_NormalE extends ListaSimpleE {

  public LS_NormalE() { super(); }

  public boolean esVacia() {
    if (P == null)
      return true;
    return false;
  }

  public void adiPrincipio(String nom, int nota) {
    NodoE nuevo = new NodoE(nom, nota);
    P = nuevo; // P apunta a nuevo
  }

  public void adiFinal(String nom, int nota) {
    NodoE nuevo = new NodoE(nom, nota);

    if (esVacia())
      P = nuevo; // p apunta a nuevo
    else {
      NodoE R = P;
      while (R.getSig() != null) {
        R = R.getSig();
      }
      R.setSig(nuevo);
    }
  }

  public void mostrar() {
    NodoE R = P; // R apunta  a la raiz P
    while (R != null) {
      System.out.println("----------------------");
      System.out.println("Nombre: " + R.getNom());
      System.out.println("Nota: " + R.getNota());
      R = R.getSig();
    }
  }

  public int nroNodos() {
    NodoE R = P;
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

  public NodoE eliPrincipio() {
    NodoE x = new NodoE();
    if (!esVacia()) {
      x = P; // x apunta a la raiz P
      P = P.getSig();
      x.setSig(null);
    }
    return x;
  }

  public NodoE eliFinal() {
    NodoE x = new NodoE();
    if (!esVacia()) {
      if (nroNodos() == 1) {
        x = P; // x apunta a la raiz P
        P = null;
      } else {
        NodoE R = P;
        NodoE S = P;
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
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i <= n; i++) {
      System.out.println("insert nom, nota:");
      String nom = scanner.next();
      int nota = scanner.nextInt();

      adiPrincipio(nom, nota);
    }
  }
  public void leer2(int n) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i <= n; i++) {
      System.out.println("insert nom, nota:");
      String nom = scanner.next();
      int nota = scanner.nextInt();

      adiFinal(nom, nota);
    }
  }
}
