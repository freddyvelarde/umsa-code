package mercado;

import java.util.Scanner;

public class Mercado {
  private int id;
  private String nombre;

  public Mercado() {}
  public Mercado(int id, String nombre) {
    this.id = id;
    this.nombre = nombre;
  }

  public int getId() { return id; }
  public String getNombre() { return nombre; }
  public void setId(int id) { this.id = id; }
  public void setNombre(String nombre) { this.nombre = nombre; }

  public void leer() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insert: id, nombre:");
    this.id = scanner.nextInt();
    this.nombre = scanner.next();
  }

  public void mostrar() {
    System.out.println("------------");
    System.out.println("id: " + id);
    System.out.println("nombre: " + nombre);
  }
}
