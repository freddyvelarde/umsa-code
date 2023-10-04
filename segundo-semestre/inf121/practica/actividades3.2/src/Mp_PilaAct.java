import java.util.Scanner;

public class Mp_PilaAct {
  private int n;
  private PilaAct c[] = new PilaAct[100];

  public Mp_PilaAct() {
    for (int i = 0; i < c.length; i++) {
      c[i] = new PilaAct();
    }
  }
  // El numero de elementos (Pilas) que contiene esta Multi-Pila.
  int nroElem(int i) { return c[i].nroElem(); }

  // La Pila en la posicion "i", esta vacia?
  boolean esVacia(int i) { return c[i].esVacia(); }

  // La pila en la posicion "i", esta llena?
  boolean esLlena(int i) { return c[i].esLlena(); }

  // Adicionar un element (De tipe Actividad) en la pila en la posicion "i"
  void adicionar(int i, Actividad e) {
    if (!c[i].esLlena()) {
      c[i].adi(e);
      if (i > n) {
        n = i;
      }

    } else
      System.out.print("pila " + i + " esta llena");
  }

  // Eliminar el elemento (De tipe Actividad) en la pila con posicion "i"
  Actividad eliminar(int i) {
    PilaPar x = new PilaPar();

    Actividad e = new Actividad(0, "", "", "", x);
    if (!c[i].esVacia())
      e = c[i].eli();
    else
      System.out.print("pila " + i + " esta vacia");
    return e;
  }

  // llenar de "n" numeros de Pilas
  void llenar(int n) {
    Scanner lee = new Scanner(System.in);
    this.n = n;
    for (int i = 0; i < n; i++) {
      System.out.println("Introducir el nro elem de la pila");
      int ne = lee.nextInt();
      c[i].llenar(ne);
    }
  }

  // llenar de "n" numeros de Pilas en la Pila con posicion "i"
  void llenar(int i, int n) { c[i].llenar(n); }

  // muestra todos los elementos de cada Pila dentro de esta Multi-Pila
  void mostrar() {
    for (int i = 0; i <= this.n; i++) {
      c[i].mostrar();
    }
  }

  // muestra todos los elementos de la Pila con posicion "i"
  void mostrar(int i) { c[i].mostrar(); }

  // Vacia la Pila con posicion "i", con la nueva pila auxiliar
  void vaciar(int i, PilaAct z) { c[i].vaciar(z); }

  // Vacia la Pila con posicion "i", con la Pila en la posicion "j"
  void vaciar(int i, int j) { c[i].vaciar(c[j]); }

  // regresa el numero de Pilas dentro de esta Multi-Pila
  public int getN() { return n; }

  public void setN(int n) { this.n = n; } // ?
}
