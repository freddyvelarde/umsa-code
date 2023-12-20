package mercado;

public class LS_NormalMercado extends ListaSimpleMercado {

  public LS_NormalMercado() { super(); }

  public boolean esVacia() {
    if (P == null)
      return true;
    return false;
  }

  public void adiPrincipio(Mercado z) {
    NodoMercado nuevo = new NodoMercado();
    nuevo.setQ(z);
    nuevo.setSig(P); // el siguiente del nodo nuevo apunta a nodo raiz
    P = nuevo;       // P apunta a nuevo
  }

  public void adiFinal(Mercado z) {
    NodoMercado nuevo = new NodoMercado();
    nuevo.setQ(z);

    if (esVacia())
      P = nuevo; // p apunta a nuevo
    else {
      NodoMercado R = P;
      while (R.getSig() != null) {
        R = R.getSig();
      }
      R.setSig(nuevo);
    }
  }

  public void mostrar() {
    NodoMercado R = P; // R apunta  a la raiz P
    while (R != null) {
      R.getQ().mostrar();
      R = R.getSig();
    }
  }

  public int nroNodos() {
    NodoMercado R = P;
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

  public NodoMercado eliPrincipio() {
    NodoMercado x = new NodoMercado();
    if (!esVacia()) {
      x = P; // x apunta a la raiz P
      P = P.getSig();
      x.setSig(null);
    }
    return x;
  }

  public NodoMercado eliFinal() {
    NodoMercado x = new NodoMercado();
    if (!esVacia()) {
      if (nroNodos() == 1) {
        x = P; // x apunta a la raiz P
        P = null;
      } else {
        NodoMercado R = P;
        NodoMercado S = P;
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
      Mercado z = new Mercado();
      z.leer();
      adiPrincipio(z);
    }
  }

  public void leer2(int n) {
    for (int i = 1; i <= n; i++) {
      Mercado z = new Mercado();
      z.leer();
      adiFinal(z);
    }
  }
}
