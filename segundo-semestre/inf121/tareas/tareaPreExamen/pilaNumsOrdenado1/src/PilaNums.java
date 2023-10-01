import java.util.Scanner;

public class PilaNums extends VectorNums {
  private int tope;

  public PilaNums() {
    super();
    this.tope = -1;
  }

  public boolean esVacia() {
    if (this.tope == -1)
      return true;
    return false;
  }
  public boolean esLlena() {
    if (this.tope == this.MAX - 1)
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
    int elem = 0;
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
    for (int i = 1; i <= n; i++) {
      System.out.println("Ingresa num:");
      int x = lee.nextInt();

      this.adi(x);
    }
  }
  public void mostrar() {
    PilaNums aux = new PilaNums();
    while (!esVacia()) {
      int elem = this.eli();
      System.out.println("num: " + elem);
      aux.adi(elem);
    }
    this.vaciar(aux);
  }
  public void vaciar(PilaNums aux) {
    while (!aux.esVacia()) {
      this.adi(aux.eli());
    }
  }
  public int nroElem() { return tope + 1; }
}
