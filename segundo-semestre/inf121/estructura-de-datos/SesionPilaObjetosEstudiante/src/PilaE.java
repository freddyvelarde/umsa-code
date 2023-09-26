import java.util.Scanner;

public class PilaE extends VectorE {
  private int tope;

  public PilaE() { this.tope = -1; }
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
  // modificar solo el tipo de parametro
  public void adi(Estudiante elem) {
    if (this.esLlena())
      System.out.println("Pila llena!!!");
    else {
      this.tope++;
      this.v[this.tope] = elem;
    }
  }
  // modificar el tipo de dato a retornar
  public Estudiante eli() {
    Estudiante elem =
        new Estudiante(); // se crea un objeto estudiante que no tiene datos
    if (this.esVacia())
      System.out.println("Pila Vacia!!");
    else {
      elem = this.v[this.tope];
      this.tope--;
    }
    return elem;
  }
  // modificar: debemos de crear al objeto estudiante!!!
  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      // crear objetos
      System.out.println("int. nombre carrera y edad");
      String nom = lee.next();
      String carrera = lee.next();
      int edad = lee.nextInt();
      Estudiante e = new Estudiante(nom, carrera, edad);
      this.adi(e);
    }
  }
  // modificar: crear una var de tipo estudiante para luego mostrar datos!!
  public void mostrar() {
    PilaE aux = new PilaE();
    while (!esVacia()) {
      // int elem = this.eli();
      Estudiante elem = this.eli();
      // System.out.println("elemento: " + elem);
      elem.mostrar();
      aux.adi(elem);
    }
    this.vaciar(aux);
  }
  public void vaciar(PilaE aux) {
    while (!aux.esVacia()) {
      this.adi(aux.eli());
    }
  }
  public int nroElem() { return tope + 1; }
}
