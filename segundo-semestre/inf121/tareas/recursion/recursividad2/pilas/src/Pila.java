import java.util.Scanner;

public class Pila extends Vector {
  private int tope;

  public Pila() { this.tope = -1; }
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
    int elem = 0;
    if (this.esVacia())
      System.out.println("Pila Vacia!!");
    else {
      elem = this.v[this.tope];
      this.tope--;
    }
    return elem;
  }
  /* public void llenar(int n) { */
  /*   Scanner lee = new Scanner(System.in); */
  /*   for (int i = 1; i <= n; i++) { */
  /*     System.out.println("Ingresa: nombre, edad y carrera"); */
  /*     String nombre = lee.next(); */
  /*     int edad = lee.nextInt(); */
  /*     String carrera = lee.next(); */
  /*  */
  /*     int estudiante = new int(nombre, edad, carrera); */
  /*     this.adi(estudiante); */
  /*   } */
  /* } */
  public void mostrar() {
    Pila aux = new Pila();
    while (!esVacia()) {
      int elem = this.eli();
      System.out.println("----- ### -----");
      System.out.println(elem);
      aux.adi(elem);
    }
    this.vaciar(aux);
  }
  public void vaciar(Pila aux) {
    while (!aux.esVacia()) {
      this.adi(aux.eli());
    }
  }
  public int nroElem() { return tope + 1; }
}
