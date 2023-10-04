public class Actividad {
  private int id;
  private String fecha;
  private String encargado;
  private String tipoActividad;
  private PilaPar participantes;

  public Actividad(int id, String fecha, String encargado, String tipoActividad,
                   PilaPar parts) {
    this.id = id;
    this.fecha = fecha;
    this.encargado = encargado;
    this.tipoActividad = tipoActividad;
    this.participantes = parts;
  }
  public int getId() { return this.id; }
  public String getFecha() { return this.fecha; }
  public String getEncargado() { return this.encargado; }
  public String getTipoActividad() { return this.tipoActividad; }
  public PilaPar getParticipantes() { return this.participantes; }
}
