package Zona;

public class Zona {
  private int nroDistrito;
  private String nombre;
  private int superficie;

  public Zona(int nroDistrito, String nombre, int superficie) {
    this.nroDistrito = nroDistrito;
    this.nombre = nombre;
    this.superficie = superficie;
  }

  public int getNroDistrito() { return this.nroDistrito; }
  public int getSuperficie() { return this.superficie; }
  public String getNombre() { return this.nombre; }
}
