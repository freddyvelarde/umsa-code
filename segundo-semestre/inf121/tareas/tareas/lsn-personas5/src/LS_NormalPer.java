
public class LS_NormalPer extends ListaSimplePer {

  public LS_NormalPer() { super(); }

  public boolean esVacia() {
    if (P == null)
      return true;
    return false;
  }

  public void adiPrincipio(Persona z) {
    NodoPer nuevo = new NodoPer();
    nuevo.setQ(z);
    nuevo.setSig(P); // el siguiente del nodo nuevo apunta a nodo raiz
    P = nuevo;       // P apunta a nuevo
  }

  public void adiFinal(Persona z) {
    NodoPer nuevo = new NodoPer();
    nuevo.setQ(z);

    if (esVacia())
      P = nuevo; // p apunta a nuevo
    else {
      NodoPer R = P;
      while (R.getSig() != null) {
        R = R.getSig();
      }
      R.setSig(nuevo);
    }
  }

  public void mostrar() {
    NodoPer R = P; // R apunta  a la raiz P
    while (R != null) {
      R.getQ().mostrar();
      R = R.getSig();
    }
  }

  public int nroNodos() {
    NodoPer R = P;
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

  public NodoPer eliPrincipio() {
    NodoPer x = new NodoPer();
    if (!esVacia()) {
      x = P; // x apunta a la raiz P
      P = P.getSig();
      x.setSig(null);
    }
    return x;
  }

  public NodoPer eliFinal() {
    NodoPer x = new NodoPer();
    if (!esVacia()) {
      if (nroNodos() == 1) {
        x = P; // x apunta a la raiz P
        P = null;
      } else {
        NodoPer R = P;
        NodoPer S = P;
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
      Persona z = new Persona();
      z.leer();
      adiPrincipio(z);
    }
  }

  public void leer2(int n) {
    for (int i = 1; i <= n; i++) {
      Persona z = new Persona();
      z.leer();
      adiFinal(z);
    }
  }
}
