public class Estudiante {
  private String nombre;
  private int edad;
  private String carrera;

  public Estudiante(String nombre, int edad, String carrera) {
    this.nombre = nombre;
    this.edad = edad;
    this.carrera = carrera;
  }

  public void setNombre(String nombre) { this.nombre = nombre; }
  public String getNombre() { return this.nombre; }

  public void setEdad(int edad) { this.edad = edad; }
  public int getEdad() { return this.edad; }

  public void setCarrera(String carrera) { this.carrera = carrera; }
  public String getCarrera() { return this.carrera; }
}
