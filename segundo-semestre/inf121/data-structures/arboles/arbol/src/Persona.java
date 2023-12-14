import java.util.Scanner;
public class Persona {
  private String nombre;
  private int edad;

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public Persona() {}

  public String getNombre() { return nombre; }

  public int getEdad() { return edad; }

  public void setNombre(String nombre) { this.nombre = nombre; }

  public void setEdad(int edad) { this.edad = edad; }
  public void mostrar() {
    System.out.println("Nombre:" + nombre + "\n Edad:" + edad + "\n");
  }

  public void leer() {
    Scanner lee = new Scanner(System.in);
    System.out.println("Ingrese el nombre:");
    this.nombre = lee.next();
    System.out.println("Ingrese edad:");
    this.edad = lee.nextInt();
  }
}
