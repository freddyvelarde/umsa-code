public class OficinaPublica extends EntidadPublica {
  private int nroTramites;

  public OficinaPublica(String nom) {
    super(nom);
    this.nroTramites = 20;
  }

  public void mostrar() {
    super.mostrar();
    System.out.println("nro de tramites: " + this.nroTramites);
  }
}
