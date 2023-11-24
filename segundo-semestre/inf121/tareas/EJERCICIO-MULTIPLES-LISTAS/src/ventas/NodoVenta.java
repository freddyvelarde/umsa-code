package ventas;
import ordenes.LS_NormalOrd;

public class NodoVenta {
  private String fecha;
  private LS_NormalOrd lord;
  private NodoVenta sig;

  public NodoVenta() { this.sig = null; }
  public NodoVenta(String fecha, LS_NormalOrd lord) {
    this.fecha = fecha;
    this.lord = lord;
  }

  public String getFecha() { return this.fecha; }

  public void setFecha(String fecha) { this.fecha = fecha; }

  public LS_NormalOrd getLord() { return this.lord; }

  public void setLord(LS_NormalOrd lord) { this.lord = lord; }

  public NodoVenta getSig() { return this.sig; }

  public void setSig(NodoVenta sig) { this.sig = sig; }
  public void mostrar() {
    System.out.println("---------------");
    System.out.println("fecha: " + fecha);
    lord.mostrar();
  }
}
