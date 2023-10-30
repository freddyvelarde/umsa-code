import java.util.Scanner;

public class ColaSimpleAlumnos extends ColaAlumnos {

  public ColaSimpleAlumnos() { super(); }
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
  public void adi(Alumno elem) {
    if (esLlena())
      System.out.println("cola simple llena!!!");
    else {
      fi++;
      v[fi] = elem;
    }
  }
  public Alumno eli() {
    Alumno elem = new Alumno("", "", 0);
    if (esVacia())
      System.out.println("Cola simple vacia!!");
    else {
      fr++;
      elem = v[fr];
    }
    return elem;
  }
  public int nroElem() { return (fi - fr); }
  public void vaciar(ColaSimpleAlumnos z) {
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

      Alumno x = new Alumno(nom, materia, nota);
      adi(x);
    }
  }
  public void mostrar() {
    ColaSimpleAlumnos aux = new ColaSimpleAlumnos();
    Alumno x;
    while (!esVacia()) {
      x = eli();
      System.out.println("Datos de Alumno: ");
      System.out.println("Nombre: " + x.getNombre());
      System.out.println("Materia: " + x.getMateria());
      System.out.println("Nota: " + x.getNota());
      aux.adi(x);
    }
    vaciar(aux);
  }
}
