
public class LD_NormalP extends ListaDobleP {
  public LD_NormalP() { super(); }
  boolean esVacia() { return this.P == null; }
  int nroNodos() {
    int c = 0;
    NodoP R = this.P;
    while (R != null) {
      c++;
      R = R.getSig();
    }
    return c;
  }
  void adiPrimero(Proyecto z) {
    NodoP nuevo = new NodoP();
    nuevo.setProy(z);
    if (esVacia())
      P = nuevo;
    else {
      nuevo.setSig(P);
      P.setAnt(nuevo);
      P = nuevo;
    }
  }

  void adiFinal(Proyecto z) {
    NodoP newNode = new NodoP();
    newNode.setProy(z);
    if (esVacia()) {
      this.P = newNode;
      return;
    }

    NodoP temp = P;
    while (temp.getSig() != null) {
      temp = temp.getSig();
    }
    temp.setSig(newNode);
    newNode.setAnt(temp);
  }

  void mostrar() {
    NodoP R = P;
    while (R != null) {
      R.getProy().mostrar();
      R = R.getSig();
    }
  }
  NodoP eliFinal() {
    NodoP x = new NodoP();
    if (!esVacia()) {
      if (nroNodos() == 1) {
        x = P;
        P = null;
      } else {
        NodoP r = P;
        while (r.getSig() != null) {
          r = r.getSig();
        }
        x = r;
        NodoP aux = r.getAnt();
        aux.setSig(null);
        x.setAnt(null);
      }
    }
    return x;
  }

  NodoP eliPrimero() {
    NodoP x = new NodoP();
    if (!esVacia()) {
      if (nroNodos() == 1) {
        x = P;
        P = null;
      } else {
        x = P;
        P = P.getSig();
        P.setAnt(null);
        x.setSig(null);
      }
    }
    return x;
  }

  void leer1(int n) {
    for (int i = 1; i <= n; i++) {
      Proyecto z = new Proyecto();
      z.leer();
      adiPrimero(z);
    }
  }
  void leer2(int n) {
    for (int i = 1; i <= n; i++) {
      Proyecto z = new Proyecto();
      z.leer();
      adiFinal(z);
    }
  }
}
