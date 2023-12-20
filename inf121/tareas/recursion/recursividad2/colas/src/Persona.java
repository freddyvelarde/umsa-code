public class Persona {
  private String nombre;
  private int edad;

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getNombre() { return this.nombre; }

  public void setNombre(String nombre) { this.nombre = nombre; }

  public int getEdad() { return this.edad; }

  public void setEdad(int edad) { this.edad = edad; }

  public void mostrar() {
    System.out.println("##############");
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Edad: " + this.edad);
  }
}
