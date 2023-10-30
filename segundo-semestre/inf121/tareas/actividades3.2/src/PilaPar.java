import java.util.Scanner;

public class PilaPar extends VectorPar {
  private int tope;

  public PilaPar() { this.tope = -1; }
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
  public void adi(Participante elem) {
    if (this.esLlena())
      System.out.println("Pila llena!!!");
    else {
      this.tope++;
      this.v[this.tope] = elem;
    }
  }
  public Participante eli() {
    Participante elem = new Participante(0, "", "", 0);
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
      System.out.println("Ingresa: id, curso, nombre, edad");
      int id = lee.nextInt();
      String curso = lee.next();
      String nombre = lee.next();
      int edad = lee.nextInt();

      Participante p = new Participante(id, curso, nombre, edad);
      this.adi(p);
    }
  }
  public void mostrar() {
    PilaPar aux = new PilaPar();
    while (!esVacia()) {
      Participante elem = this.eli();
      System.out.println("\t ----- Datos Participante -----");
      System.out.println("\t id: " + elem.getId());
      System.out.println("\t Nombre: " + elem.getNombre());
      System.out.println("\t curso: " + elem.getCurso());
      System.out.println("\t Edad: " + elem.getEdad());
      aux.adi(elem);
    }
    this.vaciar(aux);
  }
  public void vaciar(PilaPar aux) {
    while (!aux.esVacia()) {
      this.adi(aux.eli());
    }
  }
  public int nroElem() { return tope + 1; }
}
