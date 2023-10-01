package Cartas;
import java.util.Scanner;

public class PilaCartas extends VectorCartas {
  private int tope;

  public PilaCartas() {
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
  public void adi(Carta elem) {
    if (this.esLlena())
      System.out.println("Pila llena!!!");
    else {
      this.tope++;
      this.v[this.tope] = elem;
    }
  }
  public Carta eli() {
    Carta elem = new Carta("", 0, "", "");
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
      System.out.println("Ingresa: fecha, ci, asunto y contenido");
      String fecha = lee.next();
      int ci = lee.nextInt();
      String asunto = lee.next();
      String contenido = lee.next();

      Carta carta = new Carta(fecha, ci, asunto, contenido);
      this.adi(carta);
    }
  }
  public void mostrar() {
    PilaCartas aux = new PilaCartas();
    while (!esVacia()) {
      Carta elem = this.eli();
      System.out.println("----- Datos de carta: -----");
      System.out.println("fecha: " + elem.getFecha());
      System.out.println("ci: " + elem.getCi());
      System.out.println("Asunto: " + elem.getAsunto());
      System.out.println("contenido: " + elem.getContenido());
      aux.adi(elem);
    }
    this.vaciar(aux);
  }
  public void vaciar(PilaCartas aux) {
    while (!aux.esVacia()) {
      this.adi(aux.eli());
    }
  }
  public int nroElem() { return tope + 1; }
}
