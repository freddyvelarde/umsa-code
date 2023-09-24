import java.util.Scanner;

public class ColaCircularEst extends ColaEst {
  public ColaCircularEst() { super(); }

  public int nroElem() { return (fi - fr + MAX) % MAX; }

  public boolean esVacia() {
    if (nroElem() == 0)
      return true;
    return false;
  }

  public boolean esLlena() {
    if (nroElem() == MAX - 1)
      return true;
    return false;
  }

  public void adi(Estudiante estudiante) {
    if (!esLlena()) {
      fi = (fi + 1) % MAX;
      v[fi] = estudiante;
    } else {
      System.out.println("Cola Circular de Estudiantes llena");
    }
  }

  public Estudiante eli() {
    Estudiante elem = new Estudiante("", "", 0);
    if (!esVacia()) {
      fr = (fr + 1) % MAX;
      elem = v[fr];
    } else {
      System.out.println("Cola Circular de Estudiante vacia.");
    }
    return elem;
  }

  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);
    for (int i = 1; i <= n; i++) {
      System.out.println("Ingresar: nombre, materia, nota");
      String nom = lee.next();
      String materia = lee.next();
      double nota = lee.nextDouble();
      Estudiante e = new Estudiante(nom, materia, nota);
      adi(e);
    }
  }

  public void mostrar() {
    ColaCircularEst aux = new ColaCircularEst();

    while (!esVacia()) {
      Estudiante elem = eli();
      System.out.println("-----------------------------");
      System.out.println("Nombre: \t" + elem.getNom());
      System.out.println("Materia: \t" + elem.getMateria());
      System.out.println("Nota: \t" + elem.getNota());
      aux.adi(elem);
    }
    vaciar(aux);
  }

  public void vaciar(ColaCircularEst c) {
    while (!c.esVacia()) {
      adi(c.eli());
    }
  }
}
