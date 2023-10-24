public class Cancion {
  private String artista;
  private String titulo;
  private String genero;
  private int nroReproducciones;

  public Cancion(String artista, String titulo, String genero,
                 int nroReproducciones) {
    this.artista = artista;
    this.titulo = titulo;
    this.genero = genero;
    this.nroReproducciones = nroReproducciones;
  }

  public String getArtista() { return this.artista; }
  public String getTitulo() { return this.titulo; }
  public String getGenero() { return this.genero; }
  public int getNroReproducciones() { return this.nroReproducciones; }
  public void setNroReproducciones(int newNroReprod) {
    this.nroReproducciones = newNroReprod;
  }
}
