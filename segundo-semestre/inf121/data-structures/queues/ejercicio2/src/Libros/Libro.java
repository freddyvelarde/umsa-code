public class Libro {
  private String codLib;
  private int precio;
  private String titulo;
  private String autor;

  public Libro() {}

  public Libro(String codLib, int precio, String titulo, String autor) {
    this.codLib = codLib;
    this.precio = precio;
    this.titulo = titulo;
    this.autor = autor;
  }

  public String getCodLib() { return codLib; }

  public void setCodLib(String codLib) { this.codLib = codLib; }

  public int getPrecio() { return precio; }

  public void setPrecio(int precio) { this.precio = precio; }

  public String getTitulo() { return titulo; }

  public void setTitulo(String titulo) { this.titulo = titulo; }

  public String getAutor() { return autor; }

  public void setAutor(String autor) { this.autor = autor; }

  public void mostrar() {
    System.out.println("Código de Libro: " + this.codLib +
                       " Precio: " + this.precio + " Título: " + this.titulo +
                       " Autor: " + this.autor);
  }
}
