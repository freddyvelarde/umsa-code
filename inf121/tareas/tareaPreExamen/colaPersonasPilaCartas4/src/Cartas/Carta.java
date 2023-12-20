package Cartas;

public class Carta {
  private String fecha;
  private int ci;
  private String asunto;
  private String contenido;

  public Carta(String fecha, int ci, String asunto, String contenido) {
    this.ci = ci;
    this.fecha = fecha;
    this.asunto = asunto;
    this.contenido = contenido;
  }

  public String getFecha() { return this.fecha; }
  public int getCi() { return this.ci; }
  public String getAsunto() { return this.asunto; }
  public String getContenido() { return this.contenido; }
}
