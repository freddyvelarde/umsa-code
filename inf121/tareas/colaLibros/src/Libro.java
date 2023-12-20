public class Libro {
  private String titulo;
  private String autor;
  private int precio;

  public Libro(String titulo, String autor, int precio) {
    this.titulo = titulo;
    this.autor = autor;
    this.precio = precio;
  }

  public String getTitulo() { return this.titulo; }
  public String getAutor() { return this.autor; }
  public int getPrecio() { return this.precio; }

  public void setTitulo(String titulox) { this.titulo = titulox; }
  public void setAutor(String autorx) { this.autor = autorx; }
  public void setPrecio(int precio) { this.precio = precio; }

  public void mostrar() {
    System.out.println("-----------------------");
    System.out.println("Titulo: " + this.titulo);
    System.out.println("Autor: " + this.autor);
    System.out.println("Precio: " + this.precio);
  }
}
