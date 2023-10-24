public class Main {
  public static void main(String args[]) {
    Alumno a1 = new Alumno("Waldo", "inf121", 100);
    Alumno a2 = new Alumno("Camila", "inf122", 90);
    Alumno a3 = new Alumno("Andres", "inf121", 10);
    Alumno a4 = new Alumno("luan", "inf131", 100);

    ColaSimpleAlumnos alumnos = new ColaSimpleAlumnos();
    alumnos.adi(a1);
    alumnos.adi(a2);
    alumnos.adi(a3);
    alumnos.adi(a4);
    /* alumnos.mostrar(); */

    // a)
    // ColaSimpleAlumnos reprobados = new ColaSimpleAlumnos();
    // ColaSimpleAlumnos aprobados = new ColaSimpleAlumnos();
    // ordenarAprobReprob(aprobados, reprobados, alumnos);
    // System.out.println("reprobados:");
    // reprobados.mostrar();
    // System.out.println("aprobados:");
    // aprobados.mostrar();

    // b
    ColaSimpleAlumnos z = ordenarListPorNombre(alumnos);
    z.mostrar();
    /* System.out.println(letraMayor('b', 'c')); */
  }

  static boolean letraMayor(char x, char y) {
    char first = Character.toLowerCase(x);
    char second = Character.toLowerCase(y);
    int firstValue = (int)first;
    int secondValue = (int)second;

    return firstValue <= secondValue;
  }

  // b
  static ColaSimpleAlumnos ordenarListPorNombre(ColaSimpleAlumnos alumnos) {
    if (alumnos.nroElem() <= 1) {
      return alumnos;
    }

    ColaSimpleAlumnos left = new ColaSimpleAlumnos();
    ColaSimpleAlumnos right = new ColaSimpleAlumnos();
    ColaSimpleAlumnos res = new ColaSimpleAlumnos();

    Alumno pivot = alumnos.eli();

    while (!alumnos.esVacia()) {
      Alumno x = alumnos.eli();
      if (letraMayor(x.getNombre().charAt(0), pivot.getNombre().charAt(0))) {
        left.adi(x);
      } else {
        right.adi(x);
      }
    }
    left.adi(pivot);
    res.vaciar(ordenarListPorNombre(left));
    res.vaciar(ordenarListPorNombre(right));
    return res;
  }

  static void ordenarAprobReprob(ColaSimpleAlumnos aprobados,
                                 ColaSimpleAlumnos reprobados,
                                 ColaSimpleAlumnos alumnos) {
    ColaSimpleAlumnos alumnosAux = new ColaSimpleAlumnos();
    while (!alumnos.esVacia()) {
      Alumno x = alumnos.eli();

      if (x.getNota() < 51) {
        reprobados.adi(x);
      } else {
        aprobados.adi(x);
      }

      alumnosAux.adi(x);
    }
    alumnos.vaciar(alumnosAux);
  };
}
