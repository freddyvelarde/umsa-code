import java.util.Scanner;

public class Mp_PilaE {
  private int n;
  private PilaE c[] = new PilaE[100];

  public Mp_PilaE() {
    for (int i = 0; i < c.length; i++) {
      c[i] = new PilaE(); // Initialize each element with a new PilaE object
    }
  }

  int nroElem(int i) { return c[i].nroElem(); }

  boolean esVacia(int i) { return c[i].esVacia(); }

  boolean esLlena(int i) { return c[i].esLlena(); }

  void adicionar(int i, Estudiante e) { c[i].adi(e); }

  Estudiante eliminar(int i) { return c[i].eli(); }

  void llenar(int n) {
    Scanner lee = new Scanner(System.in);
    this.n = n;
    for (int i = 0; i < n; i++) {
      System.out.println("intr. nro elem de la pila");
      int ne = lee.nextInt();
      c[i].llenar(ne);
    }
  }

  void llenar(int i, int n) { c[i].llenar(n); }

  void mostrar() {
    for (int i = 0; i < this.n; i++) {
      c[i].mostrar();
    }
  }
  void mostrar(int i) { c[i].mostrar(); }

  void vaciar(int i, PilaE z) { c[i].vaciar(z); }

  void vaciar(int i, int j) { c[i].vaciar(c[j]); }
  public int getN() { return n; }
  public void setN(int n) { this.n = n; }
}
