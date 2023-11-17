import java.util.Scanner;

class Proyecto {
  private String titulo;
  private String nom1;
  private String nom2;

  public Proyecto(String titulo, String nom1, String nom2) {
    this.titulo = titulo;
    this.nom1 = nom1;
    this.nom2 = nom2;
  }
  public Proyecto() {
    this.titulo = "";
    this.nom1 = "";
    this.nom2 = "";
  }
  public void mostrar() {
    System.out.println("\nTitulo: " + this.titulo);
    System.out.println("nom1: " + this.nom1);
    System.out.println("nom2: " + this.nom2);
  }
  public void leer() {
    Scanner lee = new Scanner(System.in);
    this.titulo = lee.next();
    this.nom1 = lee.next();
    this.nom2 = lee.next();
  }
  public String getTitulo() { return titulo; }
  public void setTitulo(String titulo) { this.titulo = titulo; }
  public String getNom1() { return nom1; }
  public void setNom1(String nom1) { this.nom1 = nom1; }
  public String getNom2() { return nom2; }
  public void setNom2(String nom2) { this.nom2 = nom2; }
}

class NodoP {
  private Proyecto proy;
  private NodoP ant;
  private NodoP sig;

  NodoP() {
    this.sig = null;
    this.ant = null;
  }

  public Proyecto getProy() { return proy; }

  public void setProy(Proyecto proy) { this.proy = proy; }

  public NodoP getAnt() { return ant; }

  public void setAnt(NodoP ant) { this.ant = ant; }

  public NodoP getSig() { return sig; }

  public void setSig(NodoP sig) { this.sig = sig; }
}

class ListaDobleP {
  protected NodoP P;

  ListaDobleP() { this.P = null; }

  public NodoP getP() { return P; }
}

class LD_NormalP extends ListaDobleP {
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

class LDN {

  public static void main(String[] args) {
    LD_NormalP A = new LD_NormalP();

    Proyecto z1 = new Proyecto("tienda", "willy", "monica");
    Proyecto z2 = new Proyecto("juego", "ana", "bryan");
    Proyecto z3 = new Proyecto("uml", "jose", "adrian");
    Proyecto z4 = new Proyecto("oop", "alan", "jorge");

    A.adiPrimero(z1);
    A.adiPrimero(z2);
    A.adiPrimero(z3);

    /* A.eliPrimero(); */

    A.mostrar();
  }
}
