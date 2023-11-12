import java.util.Scanner;

public class LD_CircularP extends ListaDobleP {
  public LD_CircularP() { super(); }

  public boolean esVacia() { return P == null; }

  public int nroNodos() {
    int c = 0;
    NodoP R = P;
    if (esVacia()) {
      return c;
    }
    while (R.getSig() != P) {
      c++;
      R = R.getSig();
    }
    c++;
    return c;
  }

  public void adiPrimero(String nom, int edad) {
    NodoP nuevo = new NodoP();
    nuevo.setNom(nom);
    nuevo.setEdad(edad);
    if (esVacia()) {
      P = nuevo;
      P.setSig(P);
      P.setAnt(P);
    } else {
      NodoP R = P.getAnt();
      nuevo.setSig(P);
      P.setAnt(nuevo);
      P = nuevo;
      P.setAnt(R);
      R.setSig(P);
    }
  }

  public void mostrar() {
    NodoP R = P;
    while (R.getSig() != P) {
      System.out.println("nombre: " + R.getNom() + ", edad: " + R.getEdad());
      R = R.getSig();
    }
    System.out.println("nombre: " + R.getNom() + ", edad: " + R.getEdad());
  }

  public void adiFinal(String nom, int edad) {

    NodoP nuevo = new NodoP();
    nuevo.setNom(nom);
    nuevo.setEdad(edad);

    if (esVacia()) {
      P = nuevo;
      P.setSig(P);
      P.setAnt(P);
    } else {
      NodoP R = P.getAnt();
      R.setSig(nuevo);
      nuevo.setAnt(R);
      nuevo.setSig(P);
      P.setAnt(nuevo);
    }
  }

  public NodoP eliPrimero() {
    NodoP x = new NodoP();
    if (!esVacia()) {
      if (nroNodos() == 1) {
        x = P;
        P = null;
      } else {
        x = P;
        NodoP R = P.getAnt();
        P = P.getSig();
        P.setAnt(R);
        R.setSig(P);
      }
      x.setSig(null);
      x.setAnt(null);
    }
    return x;
  }
  public NodoP eliFinal() {
    NodoP x = new NodoP();
    if (!esVacia()) {
      if (P.getSig() == P) {
        x = P;
        P = null;
      } else {
        NodoP R = new NodoP();
        x = P.getAnt();
        R = x.getAnt();
        R.setSig(P);
        P.setAnt(R);
      }
      x.setAnt(null);
      x.setSig(null);
    }
    return x;
  }
  public void leer2(int n) {
    Scanner scanner = new Scanner(System.in);
    String nom;
    int edad;

    for (int i = 0; i < n; i++) {
      System.out.println("insert: nom, edad:");
      nom = scanner.next();
      edad = scanner.nextInt();

      adiPrimero(nom, edad);
    }
  }
  public void leer1(int n) {
    Scanner scanner = new Scanner(System.in);
    String nom;
    int edad;

    for (int i = 0; i < n; i++) {
      System.out.println("insert: nom, edad:");
      nom = scanner.next();
      edad = scanner.nextInt();

      adiFinal(nom, edad);
    }
  }
}
