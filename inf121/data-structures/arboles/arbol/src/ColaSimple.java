import java.util.Scanner;

public class ColaSimple extends cola {

  public ColaSimple() { super(); }

  public boolean esVacia() {
    if (fr == fi) {
      return true;
    }
    return false;
  }

  public boolean esLlena() {
    if (fi == max - 1) {
      return true;
    }
    return false;
  }

  public void adi(NodoP elem) {
    if (esLlena()) {
      System.out.println("cola simple llena!!!");
    } else {
      fi++;
      v[fi] = elem;
    }
  }

  public NodoP eli() {
    NodoP elem = new NodoP();
    if (esVacia()) {
      System.out.println("Cola simple vacia!!");
    } else {
      fr++;
      elem = v[fr];
    }
    return elem;
  }

  public int nroElem() { return (fi - fr); }

  public void vaciar(ColaSimple z) {
    while (!z.esVacia()) {
      adi(z.eli());
    }
  }
  /*
      public void llenar(int n) {
          Scanner lee = new Scanner(System.in);

          for (int i = 1; i <= n; i++) {
              System.out.println("INTRO ARTISTA, TITULO, GENERO,
     NROREPRODUCCIONES"); String nom = lee.next(); int ed = lee.nextInt();

              Persona x = new Persona(nom,ed);
              adi(x);
          }
      }*/

  public void mostrar() {
    ColaSimple aux = new ColaSimple();
    NodoP x;
    while (!esVacia()) {
      x = eli();
      x.getPer().mostrar();
      aux.adi(x);
    }
    vaciar(aux);
  }
}
