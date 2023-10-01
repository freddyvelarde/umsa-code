package Distrito;

public class Distrito {
  private int nroDistrito;
  private String ubicacion;

  public Distrito(int nroDistrito, String ubicacion) {
    this.nroDistrito = nroDistrito;
    this.ubicacion = ubicacion;
  }

  public String getUbicacion() { return this.ubicacion; }
  public int getNroDistrito() { return this.nroDistrito; }
}
