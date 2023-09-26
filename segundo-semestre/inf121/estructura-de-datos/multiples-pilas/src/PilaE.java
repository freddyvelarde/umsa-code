import java.util.Scanner;

public class PilaE extends VectorE {
  private int tope;

  public PilaE() { tope = -1; }

  public boolean esVacia() {
    if (tope == -1)
      return true;
    return false;
  }

  public boolean esLlena() {
    if (tope == max - 1)
      return true;
    return false;
  }

  public void adi(Estudiante elem) {
    if (!esLlena()) {
      tope++;
      v[tope] = elem;
    } else {
      System.out.println("Pila Llena.");
    }
  }

  public Estudiante eli() {
    Estudiante elem = new Estudiante("", 0);

    if (!esVacia()) {
      elem = v[tope];
      tope--;
    } else {
      System.out.println("Pila Vacia");
    }
    return elem;
  }

  public int nroElem() { return tope + 1; }

  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);
    for (int i = 1; i <= n; i++) {
      System.out.println("Ingresar: nombre, nota");
      String nombre = lee.next();
      double nota = lee.nextDouble();
      Estudiante e = new Estudiante(nombre, nota);
      adi(e);
    }
  }

  public void mostrar() {
    PilaE aux = new PilaE();

    while (!esVacia()) {
      Estudiante x = eli();
      x.mostrar();

      aux.adi(x);
    }
    vaciar(aux);
  }

  public void vaciar(PilaE p) {
    while (!p.esVacia()) {
      adi(p.eli());
    }
  }
}
