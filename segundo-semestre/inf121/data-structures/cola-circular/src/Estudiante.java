
public class Estudiante {
  private String nom;
  private String materia;
  private double nota;

  public Estudiante(String nom, String materia, double nota) {
    this.nom = nom;
    this.materia = materia;
    this.nota = nota;
  }

  public String getNom() { return nom; }

  public void setNom(String nom) { this.nom = nom; }

  public String getMateria() { return materia; }

  public void setMateria(String materia) { this.materia = materia; }

  public double getNota() { return nota; }

  public void setNota(double nota) { this.nota = nota; }

  @Override
  public String toString() {
    return "Estudiante [nom=" + nom + ", materia=" + materia +
        ", nota=" + nota + "]";
  }

  public void mostrar() { System.out.println(toString()); }
}
