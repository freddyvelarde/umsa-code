import java.util.Scanner;

public class ColaSimplePersonas extends ColaPersonas {

  public ColaSimplePersonas() { super(); }
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
    Persona elem = new Persona("", 0, 0);
    if (esVacia())
      System.out.println("Cola simple vacia!!");
    else {
      fr++;
      elem = v[fr];
    }
    return elem;
  }
  public int nroElem() { return (fi - fr); }
  public void vaciar(ColaSimplePersonas z) {
    while (!z.esVacia()) {
      adi(z.eli());
    }
  }
  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);

    for (int i = 1; i <= n; i++) {
      System.out.println("Intr. nombre, ci, edad");
      String nombre = lee.next();
      int ci = lee.nextInt();
      int edad = lee.nextInt();

      Persona x = new Persona(nombre, ci, edad);
      adi(x);
    }
  }
  public void mostrar() {
    ColaSimplePersonas aux = new ColaSimplePersonas();
    Persona x;
    while (!esVacia()) {
      x = eli();
      System.out.println("Datos Persona: ");
      System.out.println("Nombre: " + x.getNombre());
      System.out.println("CI: " + x.getCi());
      System.out.println("Edad: " + x.getEdad());
      aux.adi(x);
    }
    vaciar(aux);
  }
}
