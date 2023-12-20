public class Participante {
  private int id;
  private String curso;
  private String nombre;
  private int edad;

  public Participante(int id, String curso, String nombre, int edad) {
    this.id = id;
    this.curso = curso;
    this.nombre = nombre;
    this.edad = edad;
  }
  public int getId() { return this.id; }
  public String getCurso() { return this.curso; }
  public String getNombre() { return this.nombre; }
  public int getEdad() { return this.edad; }
}
