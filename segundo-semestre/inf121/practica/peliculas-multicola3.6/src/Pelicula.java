public class Pelicula {
  private String nombre;
  private String genero;
  private int duracion;
  private int anioEstreno;

  public Pelicula(String nombre, String genero, int duracion, int anioEstreno) {
    this.nombre = nombre;
    this.genero = genero;
    this.duracion = duracion;
    this.anioEstreno = anioEstreno;
  }

  public String getNombre() { return this.nombre; }
  public String getGenero() { return this.genero; }
  public int getDuracion() { return this.duracion; }
  public int getAnioEstreno() { return this.anioEstreno; }
}
