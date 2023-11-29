import java.util.Scanner;

// Nodo persona
class NodoP {
  private String nom;
  private int edad;
  private NodoP sig;
  private NodoP ant;

  public NodoP() {
    this.sig = null;
    this.ant = null;
  }
  public String getNom() { return nom; }

  public void setNom(String nom) { this.nom = nom; }

  public int getEdad() { return edad; }

  public void setEdad(int edad) { this.edad = edad; }

  public NodoP getSig() { return sig; }

  public void setSig(NodoP sig) { this.sig = sig; }

  public NodoP getAnt() { return ant; }

  public void setAnt(NodoP ant) { this.ant = ant; }

  public void mostrar() {
    System.out.println("nombre: " + nom + ", edad: " + edad);
  }
}

// lista doble de personas
class ListaDobleP {
  protected NodoP P;
  public ListaDobleP() { P = null; }

  public NodoP getP() { return this.P; }

  public void setP(NodoP p) { this.P = p; }
}
// Lista doble circular de personas

class LD_CircularP extends ListaDobleP {
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

// main class
class LDC {
  public static void main(String[] args) {
    LD_CircularP A = new LD_CircularP();
    A.leer2(2);
    A.adiPrimero("Freddy", 22);
    A.adiPrimero("Erick", 21);
    A.adiPrimero("Einer", 10);
    A.adiPrimero("Marianne", 20);
    A.adiPrimero("Eliana", 23);

    /* A.eliFinal(); */
    A.mostrar();
  }
}
