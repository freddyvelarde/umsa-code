import java.util.Scanner;

public class PilaNum extends Vector {
  private int tope;

  public PilaNum() { this.tope = -1; }

  public boolean esVacia() {
    if (this.tope == -1)
      return true;
    return false;
  }

  public boolean esLlena() {
    if (this.tope == this.max - 1)
      return true;
    return false;
  }

  public void adi(int elem) {
    if (this.esLlena())
      System.out.println("Pila llena!!!");
    else {
      this.tope++;
      this.v[this.tope] = elem;
    }
  }

  public int eli() {
    int elem = -1;
    if (this.esVacia())
      System.out.println("Pila Vacia!!");
    else {
      elem = this.v[this.tope];
      this.tope--;
    }
    return elem;
  }

  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      int elem = lee.nextInt();
      this.adi(elem);
    }
    lee.close();
  }

  public void mostrar() {
    PilaNum aux = new PilaNum();
    while (!esVacia()) {
      int elem = this.eli();
      System.out.println("elemento: " + elem);
      aux.adi(elem);
    }
    this.vaciar(aux);
  }

  public void vaciar(PilaNum aux) {
    while (!aux.esVacia()) {
      this.adi(aux.eli());
    }
  }

  public int nroElem() { return tope + 1; }
}
