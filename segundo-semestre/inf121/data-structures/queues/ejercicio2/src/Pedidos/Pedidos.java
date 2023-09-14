public class Pedidos {
  private String codCli;
  private String fecha;
  private int cantidad;
  private int nroPed;
  private String codLib;

  public Pedidos(String codCli, String fecha, int cantidad, int nroPed,
                 String codLib) {
    this.codCli = codCli;
    this.fecha = fecha;
    this.cantidad = cantidad;
    this.nroPed = nroPed;
    this.codLib = codLib;
  }

  public String getCodCli() { return codCli; }

  public void setCodCli(String codCli) { this.codCli = codCli; }

  public String getFecha() { return fecha; }

  public void setFecha(String fecha) { this.fecha = fecha; }

  public int getCantidad() { return cantidad; }

  public void setCantidad(int cantidad) { this.cantidad = cantidad; }

  public int getNroPed() { return nroPed; }

  public void setNroPed(int nroPed) { this.nroPed = nroPed; }

  public String getCodLib() { return codLib; }

  public void setCodLib(String codLib) { this.codLib = codLib; }

  public void mostrar() {
    System.out.println("Código Cliente: " + this.codCli +
                       " Fecha: " + this.fecha + " Cantidad: " + this.cantidad +
                       " Número de Pedido: " + this.nroPed +
                       " Código Libro: " + this.codLib);
  }
}
