import java.util.Scanner;

public class PilaEst extends VectorEst {
  private int tope;

  public PilaEst() { this.tope = -1; }
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
  public void adi(Estudiante elem) {
    if (this.esLlena())
      System.out.println("Pila llena!!!");
    else {
      this.tope++;
      this.v[this.tope] = elem;
    }
  }
  public Estudiante eli() {
    Estudiante elem = new Estudiante("", 0, "");
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
      String nombre = lee.next();
      int edad = lee.nextInt();
      String carrera = lee.next();

      Estudiante estudiante = new Estudiante(nombre, edad, carrera);
      this.adi(estudiante);
    }
  }
  public void mostrar() {
    PilaEst aux = new PilaEst();
    while (!esVacia()) {
      Estudiante elem = this.eli();
      System.out.println("----- ### -----");
      System.out.println("Nombre: " + elem.getNombre());
      System.out.println("Edad: " + elem.getEdad());
      System.out.println("Carrera: " + elem.getCarrera());
      aux.adi(elem);
    }
    this.vaciar(aux);
  }
  public void vaciar(PilaEst aux) {
    while (!aux.esVacia()) {
      this.adi(aux.eli());
    }
  }
  public int nroElem() { return tope + 1; }
}
