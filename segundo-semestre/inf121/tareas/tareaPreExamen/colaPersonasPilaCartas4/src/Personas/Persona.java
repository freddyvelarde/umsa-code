package Personas;

public class Persona {
  private int ci;
  private String nombre;
  private String materno;
  private String paterno;

  public Persona(int ci, String nombre, String paterno, String materno) {
    this.ci = ci;
    this.nombre = nombre;
    this.paterno = paterno;
    this.materno = materno;
  }

  public int getCi() { return this.ci; }
  public String getNombre() { return this.nombre; }
  public String getPaterno() { return this.paterno; }
  public String getMaterno() { return this.materno; }
}
