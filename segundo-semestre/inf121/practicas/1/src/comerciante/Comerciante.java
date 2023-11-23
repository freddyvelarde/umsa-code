package comerciante;
import java.util.Scanner;

public class Comerciante {
  private String nombre;
  private int edad;
  private int idMercado;

  public Comerciante() {}
  public Comerciante(String nombre, int edad, int idMercado) {
    this.nombre = nombre;
    this.edad = edad;
    this.idMercado = idMercado;
  }

  public String getNombre() { return nombre; }
  public int getEdad() { return edad; }
  public int getIdMercado() { return idMercado; }
  public void setNombre(String nombre) { this.nombre = nombre; }
  public void setEdad(int edad) { this.edad = edad; }
  public void setIdMercado(int idMercado) { this.idMercado = idMercado; }

  public void leer() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insert: nombre, edad, id mercado:");
    this.nombre = scanner.next();
    this.edad = scanner.nextInt();
    this.idMercado = scanner.nextInt();
  }

  public void mostrar() {
    System.out.println("------------");
    System.out.println("nombre: " + nombre);
    System.out.println("edad: " + edad);
    System.out.println("id mercado: " + idMercado);
  }
}
