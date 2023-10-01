package Temperatura;

public class Temperatura {
  protected String nombreZona;
  protected int dia;
  protected int temperatura;
  protected int precipitacion;

  public Temperatura(String nombreZona, int dia, int temperatura,
                     int precipitacion) {
    this.nombreZona = nombreZona;
    this.dia = dia;
    this.temperatura = temperatura;
    this.precipitacion = precipitacion;
  }

  public String getNombreZona() { return this.nombreZona; }
  public int getDia() { return this.dia; }
  public int getTemperatura() { return this.temperatura; }
  public int getPrecipitacion() { return this.precipitacion; }
}
