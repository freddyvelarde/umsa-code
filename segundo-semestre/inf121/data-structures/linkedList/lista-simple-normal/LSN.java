import java.util.Scanner;

class LS_NormalPer extends ListaSimplePer {

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
class ListaSimplePer {
  protected NodoPer P; // raiz de la lista

  public ListaSimplePer() {
    P = null; // la raiz apunta a nullo es decir
              // se define una lista simple vacia
  }

  public NodoPer getP() { return P; }

  public void setP(NodoPer p) { P = p; }
}
class NodoPer {
  private Persona q;   // define el dato objeto persona
  private NodoPer sig; // definiendo el campo enlace sig

  public NodoPer() { // constructor
    sig = null;
  }

  public Persona getQ() { return q; }

  public void setQ(Persona q) { this.q = q; }

  public NodoPer getSig() { return sig; }

  public void setSig(NodoPer sig) { this.sig = sig; }
}
class Persona {
  private String nom;
  private int edad;

  public Persona(String nom, int edad) {
    this.nom = nom;
    this.edad = edad;
  }

  public Persona() {
    this.nom = "";
    this.edad = 0;
  }

  @Override
  public String toString() {
    return "Persona [nom=" + nom + ", edad=" + edad + "]";
  }

  public void leer() {
    Scanner lee = new Scanner(System.in);
    System.out.println("Datos persona: nombre, edad");
    this.nom = lee.next();
    this.edad = lee.nextInt();
  }

  public void mostrar() {
    System.out.println("\nnombre : " + this.nom);
    System.out.println("edad: " + this.edad);
  }

  public String getNom() { return nom; }

  public void setNom(String nom) { this.nom = nom; }

  public int getEdad() { return edad; }

  public void setEdad(int edad) { this.edad = edad; }
}
public class LSN {

  public static void main(String[] args) {
    LS_NormalPer firstLinkedList = new LS_NormalPer();

    Persona z1 = new Persona("mario", 15);
    Persona z2 = new Persona("luis", 22);
    Persona z3 = new Persona("alan", 20);
    Persona z4 = new Persona("lupe", 22);

    firstLinkedList.adiFinal(z1);
    firstLinkedList.adiFinal(z2);
    firstLinkedList.adiFinal(z3);
    firstLinkedList.adiFinal(z4);

    firstLinkedList.mostrar();
  }
}
