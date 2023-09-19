import java.util.Scanner;

public class MpPila {
  private int n;
  private Pila[] c = new Pila[100];
  public MpPila() {

    for (int i = 0; i < c.length; i++) {
      c[i] = new Pila();
    }
  }

  public int nroElem(int i) { return c[i].nroElem(); }

  public boolean esVacia(int i) { return c[i].esVacia(); }

  public boolean esLlena(int i) { return c[i].esLlena(); }

  public void adiciona(int i, Estudiante e) { c[i].adi(e); }

  public Estudiante eliminar(int i) { return c[i].eli(); }

  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);
    this.n = n;
    // int ne;
    for (int i = 0; i < this.n; i++) {

      System.out.println("Cuantos estudiantes ingresaran en la pila: ");
      int ne = lee.nextInt();

      c[i].llenar(ne);
    }
  }

  public void llenar(int i, int n) { c[i].llenar(n); }

  public void mostrar() {
    for (int i = 0; i < this.n; i++) {
      c[i].mostrar();
    }
  }

  public void mostrar(int i) { c[i].mostrar(); }

  public void vaciar(int i, Pila z) { c[i].vaciar(z); }

  public void vaciar(int i, int j) { c[i].vaciar(c[j]); }

  public int getN() { return n; }
}
