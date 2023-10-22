import java.util.Scanner;

public class ColaSimpleEst extends ColaEst {

  public ColaSimpleEst() { super(); }
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
  public void adi(Estudiante elem) {
    if (esLlena())
      System.out.println("cola simple llena!!!");
    else {
      fi++;
      v[fi] = elem;
    }
  }
  public Estudiante eli() {
    Estudiante elem = new Estudiante("", "", 0);
    if (esVacia())
      System.out.println("Cola simple vacia!!");
    else {
      fr++;
      elem = v[fr];
    }
    return elem;
  }
  public int nroElem() { return (fi - fr); }
  public void vaciar(ColaSimpleEst z) {
    while (!z.esVacia()) {
      adi(z.eli());
    }
  }
  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);

    for (int i = 1; i <= n; i++) {
      System.out.println("Intr. nombre, materia, nota");
      String nom = lee.next();
      String materia = lee.next();
      double nota = lee.nextDouble();

      Estudiante x = new Estudiante(nom, materia, nota);
      adi(x);
    }
  }
  public void mostrar() {
    ColaSimpleEst aux = new ColaSimpleEst();
    Estudiante x;
    while (!esVacia()) {
      x = eli();
      x.mostrar();
      aux.adi(x);
    }
    vaciar(aux);
  }
}
