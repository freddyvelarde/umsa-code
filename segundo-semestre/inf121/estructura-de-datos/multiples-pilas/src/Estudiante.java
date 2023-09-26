public class Estudiante {
  private String nom;
  private double nota;

  public Estudiante(String nom, double nota) {
    this.nom = nom;
    this.nota = nota;
  }

  public String getNom() { return nom; }

  public void setNom(String nom) { this.nom = nom; }

  public double getNota() { return nota; }

  public void setNota(double nota) { this.nota = nota; }

  @Override
  public String toString() {
    return "Estudiante [nom=" + nom + ", nota=" + nota + "]";
  }

  public void mostrar() { System.out.println(toString()); }
}
