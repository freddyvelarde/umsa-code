public class Ministerio extends EntidadPublica {
  private int nroProy;

  public Ministerio(String nom) {
    super(nom);
    this.nroProy = 10;
  }

  public void mostrar() {
    super.mostrar();
    System.out.println("nro de proyectos: " + this.nroProy);
  }

  public void setNroProy(int nroProy) { this.nroProy = nroProy; }

  public int getNroProy() { return this.nroProy; }
}
