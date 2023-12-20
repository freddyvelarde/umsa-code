public class Persona {
  private String nombre;
  private int ci;
  private int edad;

  public Persona(String nombre, int ci, int edad) {
    this.nombre = nombre;
    this.ci = ci;
    this.edad = edad;
  }

  public int getEdad() { return this.edad; }
  public int getCi() { return this.ci; }
  public String getNombre() { return this.nombre; }
}
