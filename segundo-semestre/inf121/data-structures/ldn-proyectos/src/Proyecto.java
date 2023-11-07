import java.util.Scanner;

public class Proyecto {
  private String titulo;
  private String nom1;
  private String nom2;

  public Proyecto(String titulo, String nom1, String nom2) {
    this.titulo = titulo;
    this.nom1 = nom1;
    this.nom2 = nom2;
  }
  public Proyecto() {
    this.titulo = "";
    this.nom1 = "";
    this.nom2 = "";
  }
  public void mostrar() {
    System.out.println("\nTitulo: " + this.titulo);
    System.out.println("nom1: " + this.nom1);
    System.out.println("nom2: " + this.nom2);
  }
  public void leer() {
    Scanner lee = new Scanner(System.in);
    this.titulo = lee.next();
    this.nom1 = lee.next();
    this.nom2 = lee.next();
  }
  public String getTitulo() { return titulo; }
  public void setTitulo(String titulo) { this.titulo = titulo; }
  public String getNom1() { return nom1; }
  public void setNom1(String nom1) { this.nom1 = nom1; }
  public String getNom2() { return nom2; }
  public void setNom2(String nom2) { this.nom2 = nom2; }
}
