package comerciante;

public class LS_NormalComerciante extends ListaSimpleComerciante {

  public LS_NormalComerciante() { super(); }

  public boolean esVacia() {
    if (P == null)
      return true;
    return false;
  }

  public void adiPrincipio(Comerciante z) {
    NodoComerciante nuevo = new NodoComerciante();
    nuevo.setQ(z);
    nuevo.setSig(P); // el siguiente del nodo nuevo apunta a nodo raiz
    P = nuevo;       // P apunta a nuevo
  }

  public void adiFinal(Comerciante z) {
    NodoComerciante nuevo = new NodoComerciante();
    nuevo.setQ(z);

    if (esVacia())
      P = nuevo; // p apunta a nuevo
    else {
      NodoComerciante R = P;
      while (R.getSig() != null) {
        R = R.getSig();
      }
      R.setSig(nuevo);
    }
  }

  public void mostrar() {
    NodoComerciante R = P; // R apunta  a la raiz P
    while (R != null) {
      R.getQ().mostrar();
      R = R.getSig();
    }
  }

  public int nroNodos() {
    NodoComerciante R = P;
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

  public NodoComerciante eliPrincipio() {
    NodoComerciante x = new NodoComerciante();
    if (!esVacia()) {
      x = P; // x apunta a la raiz P
      P = P.getSig();
      x.setSig(null);
    }
    return x;
  }

  public NodoComerciante eliFinal() {
    NodoComerciante x = new NodoComerciante();
    if (!esVacia()) {
      if (nroNodos() == 1) {
        x = P; // x apunta a la raiz P
        P = null;
      } else {
        NodoComerciante R = P;
        NodoComerciante S = P;
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
      Comerciante z = new Comerciante();
      z.leer();
      adiPrincipio(z);
    }
  }

  public void leer2(int n) {
    for (int i = 1; i <= n; i++) {
      Comerciante z = new Comerciante();
      z.leer();
      adiFinal(z);
    }
  }
}
