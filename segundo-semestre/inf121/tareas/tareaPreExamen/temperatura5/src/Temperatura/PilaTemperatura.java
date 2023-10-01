package Temperatura;
import java.util.Scanner;

public class PilaTemperatura extends VectorTemperatura {
  private int tope;

  public PilaTemperatura() { this.tope = -1; }
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
  public void adi(Temperatura elem) {
    if (this.esLlena())
      System.out.println("Pila llena!!!");
    else {
      this.tope++;
      this.v[this.tope] = elem;
    }
  }
  public Temperatura eli() {
    Temperatura elem = new Temperatura("", 0, 0, 0);
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
      System.out.println(
          "Ingresa: nombre zona, dia, Temperatura, precipitacion");
      String nombreZona = lee.next();
      int dia = lee.nextInt();
      int temperatura = lee.nextInt();
      int precipitacion = lee.nextInt();

      Temperatura t =
          new Temperatura(nombreZona, dia, temperatura, precipitacion);
      this.adi(t);
    }
  }
  public void mostrar() {
    PilaTemperatura aux = new PilaTemperatura();
    while (!esVacia()) {
      Temperatura elem = this.eli();
      System.out.println("----- ### -----");
      System.out.println("Nombre de zona: " + elem.getNombreZona());
      System.out.println("dia: " + elem.getDia());
      System.out.println("Temperatura: " + elem.getTemperatura());
      System.out.println("precipitacion: " + elem.getPrecipitacion());
      aux.adi(elem);
    }
    this.vaciar(aux);
  }
  public void vaciar(PilaTemperatura aux) {
    while (!aux.esVacia()) {
      this.adi(aux.eli());
    }
  }
  public int nroElem() { return tope + 1; }
}
