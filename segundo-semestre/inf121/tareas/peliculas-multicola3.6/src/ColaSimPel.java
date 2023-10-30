import java.util.Scanner;

public class ColaSimPel extends ColaPel {

  public ColaSimPel() { super(); }
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
  public void adi(Pelicula elem) {
    if (esLlena())
      System.out.println("cola simple llena!!!");
    else {
      fi++;
      v[fi] = elem;
    }
  }
  public Pelicula eli() {
    Pelicula elem = new Pelicula("", "", 0, 0);
    if (esVacia())
      System.out.println("Cola simple vacia!!");
    else {
      fr++;
      elem = v[fr];
    }
    return elem;
  }
  public int nroElem() { return (fi - fr); }
  public void vaciar(ColaSimPel z) {
    while (!z.esVacia()) {
      adi(z.eli());
    }
  }
  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);

    for (int i = 1; i <= n; i++) {
      System.out.println("Intr. nombre, genero, duracion, anioEstreno");
      String nombre = lee.next();
      String genero = lee.next();
      int duracion = lee.nextInt();
      int anioEstreno = lee.nextInt();

      Pelicula x = new Pelicula(nombre, genero, duracion, anioEstreno);
      adi(x);
    }
  }
  public void mostrar() {
    ColaSimPel aux = new ColaSimPel();
    Pelicula x;
    while (!esVacia()) {
      x = eli();
      System.out.println("Datos de Pelicula: ------------");
      System.out.println("Nombre: " + x.getNombre());
      System.out.println("genero: " + x.getGenero());
      System.out.println("Duracion: " + x.getDuracion());
      System.out.println("Anio estreno: " + x.getAnioEstreno());
      aux.adi(x);
    }
    vaciar(aux);
  }
}
