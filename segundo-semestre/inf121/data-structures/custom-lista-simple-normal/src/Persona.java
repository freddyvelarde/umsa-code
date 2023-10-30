import java.util.Scanner;

public class Persona {
  private String nom;
  private int edad;

  public Persona(String nom, int edad) {
    this.nom = nom;
    this.edad = edad;
  }

  public Persona() {
    this.nom = "";
    this.edad = 0;
  }

  @Override
  public String toString() {
    return "Persona [nom=" + nom + ", edad=" + edad + "]";
  }

  public void leer() {
    Scanner lee = new Scanner(System.in);
    System.out.println("Datos persona: nombre, edad");
    this.nom = lee.next();
    this.edad = lee.nextInt();
  }

  public void mostrar() {
    System.out.println("\nnombre : " + this.nom);
    System.out.println("edad: " + this.edad);
  }

  public String getNom() { return nom; }

  public void setNom(String nom) { this.nom = nom; }

  public int getEdad() { return edad; }

  public void setEdad(int edad) { this.edad = edad; }
}
