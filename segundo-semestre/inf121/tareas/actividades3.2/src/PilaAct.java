import java.util.Scanner;

public class PilaAct extends VectorAct {
  private int tope;

  public PilaAct() { this.tope = -1; }
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
  public void adi(Actividad elem) {
    if (this.esLlena())
      System.out.println("Pila llena!!!");
    else {
      this.tope++;
      this.v[this.tope] = elem;
    }
  }
  public Actividad eli() {
    PilaPar parts = new PilaPar();

    Actividad elem = new Actividad(0, "", "", "", parts);
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
          "Ingresa: id, fecha, encargado, tipo de actividad, nro de participantes");
      int id = lee.nextInt();
      String fecha = lee.next();
      String encargado = lee.next();
      String tipAc = lee.next();
      int nroPart = lee.nextInt();
      PilaPar parts = new PilaPar();
      parts.llenar(nroPart);

      Actividad p = new Actividad(id, fecha, encargado, tipAc, parts);
      this.adi(p);
    }
  }
  public void mostrar() {
    PilaAct aux = new PilaAct();
    while (!esVacia()) {
      Actividad elem = this.eli();
      System.out.println("----- Datos Actividad -----");
      System.out.println("id: " + elem.getId());
      System.out.println("fecha: " + elem.getFecha());
      System.out.println("encargado: " + elem.getEncargado());
      System.out.println("tipo de actividad: " + elem.getTipoActividad());
      System.out.println("Participantes:");
      /* PilaPar x = elem.get */
      elem.getParticipantes().mostrar();
      aux.adi(elem);
    }
    this.vaciar(aux);
  }
  public void vaciar(PilaAct aux) {
    while (!aux.esVacia()) {
      this.adi(aux.eli());
    }
  }
  public int nroElem() { return tope + 1; }
}
