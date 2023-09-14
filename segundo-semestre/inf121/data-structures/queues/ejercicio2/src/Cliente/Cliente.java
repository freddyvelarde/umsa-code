public class Cliente {
  private String codCli;
  private String edad;
  private String nombre;

  public Cliente(String nombre, String edad, String codCli) {
    this.codCli = codCli;
    this.edad = edad;
    this.nombre = nombre;
  }

  public String getNombre() { return this.nombre; }

  public void setNombre(String nom) { this.nombre = nom; }

  public String getEdad() { return this.edad; }

  public void setEdad(String edad) { this.edad = edad; }

  public String getCodigoCliente() { return this.codCli; }

  public void setCodigoCliente(String codCli) { this.codCli = codCli; }

  public void mostrar() {
    System.out.println("Nombre: " + this.nombre + " Edad: " + this.edad +
                       " Codigo Cliente: " + this.codCli);
  };
}
