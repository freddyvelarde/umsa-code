package combo;

public class NodoCb {
  private int nroCombo;
  private String nombre;
  private int precio;
  private NodoCb sig;

  public NodoCb() { this.sig = null; }

  public NodoCb(int nroCombo, String nombre, int precio) {
    this.nroCombo = nroCombo;
    this.nombre = nombre;
    this.precio = precio;
  }

  public int getNroCombo() { return this.nroCombo; }

  public void setNroCombo(int nroCombo) { this.nroCombo = nroCombo; }

  public String getNombre() { return this.nombre; }

  public void setNombre(String nombre) { this.nombre = nombre; }

  public int getPrecio() { return this.precio; }

  public void setPrecio(int precio) { this.precio = precio; }

  public NodoCb getSig() { return this.sig; }

  public void setSig(NodoCb sig) { this.sig = sig; }

  public void mostrar() {
    System.out.println("-------------");
    System.out.println("nro combo: " + nroCombo);
    System.out.println("nombre: " + nombre);
    System.out.println("precio: " + precio);
  }
}
