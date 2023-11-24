package pedidos;

public class NodoCbPed {
  private int nroCombo;
  private int cantidad;
  private NodoCbPed sig;

  public NodoCbPed() { this.sig = null; }

  public NodoCbPed(int nroCombo, int cantidad) {
    this.nroCombo = nroCombo;
    this.cantidad = cantidad;
  }

  public int getNroCombo() { return this.nroCombo; }

  public void setNroCombo(int nroCombo) { this.nroCombo = nroCombo; }

  public int getCantidad() { return this.cantidad; }

  public void setCantidad(int cantidad) { this.cantidad = cantidad; }

  public NodoCbPed getSig() { return this.sig; }

  public void setSig(NodoCbPed sig) { this.sig = sig; }

  public void mostrar() {
    System.out.println("------------");
    System.out.println("nro combo: " + nroCombo);
    System.out.println("cantidad: " + cantidad);
  }
}
