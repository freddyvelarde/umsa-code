public class Alumno {
  private String nombre;
  private String materia;
  private double nota;

  public Alumno(String nombre, String materia, double nota) {
    this.nombre = nombre;
    this.materia = materia;
    this.nota = nota;
  }

  public String getNombre() { return this.nombre; }
  public String getMateria() { return this.materia; }
  public double getNota() { return this.nota; }
}
