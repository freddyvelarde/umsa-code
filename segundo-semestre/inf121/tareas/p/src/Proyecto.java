public class Proyecto {
  private String titulo;
  private String carrera;
  private String expositor;

  public Proyecto(String tit, String car, String exp) {
    this.titulo = tit;
    this.carrera = car;
    this.expositor = exp;
  }

  public String getTitulo() { return this.titulo; }
  public String getCarrera() { return this.carrera; }
  public String getExpositor() { return this.expositor; }
}
