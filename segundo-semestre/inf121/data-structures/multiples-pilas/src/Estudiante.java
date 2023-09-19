import java.util.Scanner;

public class Estudiante {
  private String nom;
  private String carrera;

  /* public Estudiante(String nom, String carrera, double nota) { */
  /*   this.nom = nom; */
  /*   this.carrera = carrera; */
  /*   this.nota = nota; */
  /* } */

  public String getNom() { return nom; }

  public void setNom(String nom) { this.nom = nom; }

  public String getCarrera() { return carrera; }

  public void setCarrera(String carrera) { this.carrera = carrera; }

  public void leer() {
    Scanner lee = new Scanner(System.in);
    System.out.println("Ingresa: nombre, carrera \n");
    this.nom = lee.next();
    this.carrera = lee.next();
  }

  @Override
  public String toString() {
    return "Estudiante [nom=" + nom + ", carrera=" + carrera + "]";
  }

  public void mostrar() { System.out.println(toString()); }
}
