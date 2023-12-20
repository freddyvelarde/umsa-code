import java.util.Scanner;

public class ColaSimplePer extends ColaPer {

  public ColaSimplePer() { super(); }
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
  public void adi(Persona elem) {
    if (esLlena())
      System.out.println("cola simple llena!!!");
    else {
      fi++;
      v[fi] = elem;
    }
  }
  public Persona eli() {
    Persona elem = new Persona("", 0);
    if (esVacia())
      System.out.println("Cola simple vacia!!");
    else {
      fr++;
      elem = v[fr];
    }
    return elem;
  }
  public int nroElem() { return (fi - fr); }
  public void vaciar(ColaSimplePer z) {
    while (!z.esVacia()) {
      adi(z.eli());
    }
  }
  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);

    for (int i = 1; i <= n; i++) {
      System.out.println("Intr. nombre, materia, nota");
      String nom = lee.next();
      int edad = lee.nextInt();

      Persona x = new Persona(nom, edad);
      adi(x);
    }
  }
  public void mostrar() {
    ColaSimplePer aux = new ColaSimplePer();
    Persona x;
    while (!esVacia()) {
      x = eli();
      x.mostrar();
      aux.adi(x);
    }
    vaciar(aux);
  }
}
