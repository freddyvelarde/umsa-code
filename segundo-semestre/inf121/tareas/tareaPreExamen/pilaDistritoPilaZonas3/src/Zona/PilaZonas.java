package Zona;
import java.util.Scanner;

public class PilaZonas extends VectorZonas {

  private int tope;

  public PilaZonas() { this.tope = -1; }

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
  public void adi(Zona elem) {
    if (this.esLlena())
      System.out.println("Pila llena!!!");
    else {
      this.tope++;
      this.v[this.tope] = elem;
    }
  }
  public Zona eli() {
    Zona elem = new Zona(0, "", 0);
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
      System.out.println("Ingresa: nroZona, nombre, superficie");
      int nroZona = lee.nextInt();
      String nombre = lee.next();
      int superficie = lee.nextInt();

      Zona zona = new Zona(nroZona, nombre, superficie);
      this.adi(zona);
    }
  }
  public void mostrar() {
    PilaZonas aux = new PilaZonas();
    while (!esVacia()) {
      Zona elem = this.eli();
      System.out.println("----- Datos Zona: -----");
      System.out.println("nroZona: " + elem.getNroDistrito());
      System.out.println("nombre: " + elem.getNombre());
      System.out.println("superficie: " + elem.getSuperficie());
      aux.adi(elem);
    }
    this.vaciar(aux);
  }
  public void vaciar(PilaZonas aux) {
    while (!aux.esVacia()) {
      this.adi(aux.eli());
    }
  }
  public int nroElem() { return tope + 1; }
}
