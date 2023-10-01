package Distrito;
import java.util.Scanner;

public class PilaDistritos extends VectorDistritos {

  private int tope;

  public PilaDistritos() { this.tope = -1; }

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
  public void adi(Distrito elem) {
    if (this.esLlena())
      System.out.println("Pila llena!!!");
    else {
      this.tope++;
      this.v[this.tope] = elem;
    }
  }
  public Distrito eli() {
    Distrito elem = new Distrito(0, "");
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
      System.out.println("Ingresa: nroDistrito, ubicacion");
      int nroDistrito = lee.nextInt();
      String ubicacion = lee.next();

      Distrito estudiante = new Distrito(nroDistrito, ubicacion);
      this.adi(estudiante);
    }
  }
  public void mostrar() {
    PilaDistritos aux = new PilaDistritos();
    while (!esVacia()) {
      Distrito elem = this.eli();
      System.out.println("----- Datos Distrito: -----");
      System.out.println("nroDistrito: " + elem.getNroDistrito());
      System.out.println("ubicacion: " + elem.getUbicacion());
      aux.adi(elem);
    }
    this.vaciar(aux);
  }
  public void vaciar(PilaDistritos aux) {
    while (!aux.esVacia()) {
      this.adi(aux.eli());
    }
  }
  public int nroElem() { return tope + 1; }
}
