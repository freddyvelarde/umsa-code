import java.util.Scanner;

public class ColaSimpleCanciones extends ColaCanciones {

  public ColaSimpleCanciones() { super(); }
  public boolean esVacia() {
    if (fr == fi)
      return true;
    return false;
  }
  public boolean esLlena() {
    if (fi == MAX - 1)
      return true;
    return false;
  }
  public void adi(Cancion elem) {
    if (esLlena())
      System.out.println("cola simple llena!!!");
    else {
      fi++;
      v[fi] = elem;
    }
  }
  public Cancion eli() {
    Cancion elem = new Cancion("", "", "", 0);
    if (esVacia())
      System.out.println("Cola simple vacia!!");
    else {
      fr++;
      elem = v[fr];
    }
    return elem;
  }
  public int nroElem() { return (fi - fr); }
  public void vaciar(ColaSimpleCanciones z) {
    while (!z.esVacia()) {
      adi(z.eli());
    }
  }
  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);

    for (int i = 1; i <= n; i++) {
      System.out.println("Intr. artista, titulo, genero, nroReproducciones ");
      String artista = lee.next();
      String titulo = lee.next();
      String genero = lee.next();
      int nroReproducciones = lee.nextInt();

      Cancion x = new Cancion(artista, titulo, genero, nroReproducciones);
      adi(x);
    }
  }
  public void mostrar() {
    ColaSimpleCanciones aux = new ColaSimpleCanciones();
    Cancion x;
    while (!esVacia()) {
      x = eli();
      System.out.println("Datos cancion:");
      System.out.println("Artista: " + x.getArtista());
      System.out.println("titulo: " + x.getTitulo());
      System.out.println("genero: " + x.getGenero());
      System.out.println("nroReproducciones: " + x.getNroReproducciones());
      aux.adi(x);
    }
    vaciar(aux);
  }
}
