import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    LinkedList System.out.println("nombre: Freddy Erick Velarde Silva");
    System.out.println("CI: 13827575 \n");

    // LISTA DOBLE MULTIPLE
    LS_NormalM ldm = new LS_NormalM();

    // LISTAS SIMPLES DE ESTUDIANTES
    LS_NormalE le1 = new LS_NormalE();
    LS_NormalE le2 = new LS_NormalE();
    LS_NormalE le3 = new LS_NormalE();
    LS_NormalE le4 = new LS_NormalE();

    le1.adiFinal("Jose Luna", 60);
    le1.adiFinal("Sofia Estrella", 45);
    le2.adiFinal("Carla Apaza", 73);
    le2.adiFinal("Miguel Castro", 51);
    le2.adiFinal("Miriam Luna", 90);

    ldm.adiFinal("inf-111", le1);
    ldm.adiFinal("inf-121", le2);
    ldm.adiFinal("inf-131", le3);
    /*  */
    /* mostrarMateriaConMejorPromedio(ldm); */

    /* verificarEstudiante(ldm, "Miguel Castro"); */

    /* insertarNuevoEstudiante(ldm); */

    eliminarMateria(ldm, "inf-131");
    ldm.mostrar();
  }

  // Mostrar la materia con el mejor promedio
  static void mostrarMateriaConMejorPromedio(LS_NormalM materias) {

    NodoM R = materias.getP();
    double max = 0;

    while (R != null) {
      double nota = promedioMateria(R.getLe());
      if (nota > max) {
        max = nota;
      }
      R = R.getSig();
    }
    R = materias.getP();
    while (R != null) {
      double nota = promedioMateria(R.getLe());
      if (nota == max) {
        System.out.println("materia con mejor promedio: " + R.getSigla());
        /* R.getLe().mostrar(); */
      }
      R = R.getSig();
    }
  }

  static double promedioMateria(LS_NormalE estudiantes) {
    NodoE R = estudiantes.getP();
    int sum = 0;
    while (R != null) {
      sum += R.getNota();

      R = R.getSig();
    }
    if (estudiantes.nroNodos() >= 1)
      return sum / estudiantes.nroNodos();
    return 0;
  }

  // Verificar si existe el estudiante de nombre “x”
  static void verificarEstudiante(LS_NormalM materias, String nombreX) {
    NodoM R = materias.getP();

    while (R != null) {
      LS_NormalE estudiantes = R.getLe();
      NodoE e = estudiantes.getP();
      while (e != null) {
        if (e.getNom().equals(nombreX)) {
          System.out.println("existe: " + nombreX +
                             " en materia: " + R.getSigla());
          return;
        }

        e = e.getSig();
      }

      R = R.getSig();
    }

    System.out.println("no existe: " + nombreX);
  }

  //  Eliminar la materia “x” con todos sus estudiantes
  static void eliminarMateria(LS_NormalM materias, String materiaX) {
    NodoM R = materias.getP();
    NodoM next = R.getSig();
    while (R.getSig() != null) {

      if (R.getSigla().equals(materiaX)) {
        materias.setP(next);
        return;
      }

      if (next.getSigla().equals(materiaX)) {
        R.setSig(next.getSig());
        return;
      }

      R = next;
      next = next.getSig();
    }
  }

  // Insertar un nuevo estudiante a la materia “x”
  static void insertarNuevoEstudiante(LS_NormalM materias) {
    Scanner scanner = new Scanner(System.in);
    NodoM R = materias.getP();
    System.out.println("ingrese materia:");
    String materiaX = scanner.next();

    while (R != null) {
      if (R.getSigla().equals(materiaX)) {
        System.out.println("inserta nuevo nombre:");
        String nom = scanner.next();
        System.out.println("inserta nota:");
        int nota = scanner.nextInt();
        R.getLe().adiFinal(nom, nota);
      }

      R = R.getSig();
    }
  }
}
