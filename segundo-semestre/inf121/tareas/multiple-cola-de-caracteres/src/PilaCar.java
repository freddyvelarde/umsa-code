import java.util.Scanner;

public class PilaCar extends VectorCar {
  private int tope;

  public PilaCar() { this.tope = -1; }
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
  public void adi(char elem) {
    if (this.esLlena())
      System.out.println("Pila llena!!!");
    else {
      this.tope++;
      this.v[this.tope] = elem;
    }
  }
  public char eli() {
    char elem = ' ';
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
      System.out.println("Ingresa: nombre, edad y carrera");
      char x = lee.next().charAt(0);

      this.adi(x);
    }
  }
  public void mostrar() {
    PilaCar aux = new PilaCar();
    while (!esVacia()) {
      char elem = this.eli();
      System.out.println("----- ### -----");
      System.out.println("elemento: " + elem);
      aux.adi(elem);
    }
    this.vaciar(aux);
  }
  public void vaciar(PilaCar aux) {
    while (!aux.esVacia()) {
      this.adi(aux.eli());
    }
  }
  public int nroElem() { return tope + 1; }
}
