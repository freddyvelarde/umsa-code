import java.util.Scanner;
import java.util.Vector;

class estudiantes {
  private Vector<Vector<String>> estudiantes;
  private Vector<Vector<Integer>> notas;

  public estudiantes() { // constructor
    estudiantes = new Vector<Vector<String>>();
    notas = new Vector<Vector<Integer>>();
  }

  public void llenarYMostrarMatrices() {
    Scanner reader = new Scanner(System.in);
    Vector<String> estudiante = new Vector<String>();
    Vector<Integer> nota = new Vector<Integer>();

    /* String id = UUID.randomUUID().toString(); */
    System.out.println("Estudiante:");
    /* estudiante.add(id); */
    System.out.println("nombre:");
    estudiante.add(reader.nextLine());
    System.out.println("paterno:");
    estudiante.add(reader.nextLine());
    System.out.println("materno:");
    estudiante.add(reader.nextLine());
    this.estudiantes.add(estudiante);

    System.out.println("Nota:");
    /* nota.add(id); */
    System.out.println("Parcial1:");
    nota.add(reader.nextInt());
    System.out.println("Parcial2:");
    nota.add(reader.nextInt());
    System.out.println("Examen final:");
    nota.add(reader.nextInt());
    this.notas.add(nota);

    /* System.out.println(this.estudiantes); */
    /* System.out.println(this.notas); */
  }

  public void mostrarEstudiantes() {
    System.out.println("Estudiantes registrados:");

    for (int i = 0; i < this.estudiantes.size(); i++) {
      Vector<String> estudiante = this.estudiantes.get(i);
      System.out.println("Nombre: " + estudiante.get(0));
      System.out.println("Apellido paterno: " + estudiante.get(1));
      System.out.println("Apellido materno: " + estudiante.get(2));

      Vector<Integer> notas = this.notas.get(i);
      System.out.println("Parcial 1: " + notas.get(0));
      System.out.println("Parcial 2: " + notas.get(1));
      System.out.println("Examen final: " + notas.get(2));

      System.out.println("--------------");
    }
  }

  public void mayorNota() {
    int nota_final = 0;
    Vector<Integer> notas_finales = new Vector<Integer>();

    for (Vector<Integer> nota : this.notas) {
      for (Integer n : nota) {
        System.out.println(n);
        nota_final += n;
      }
      notas_finales.add(nota_final);
      nota_final = 0;
    }

    int max = notas_finales.get(0);

    for (Integer n : notas_finales) {
      if (n >= max) {
        max = n;
      }
    }

    System.out.println("Mayor nota: " + max);
  }

  public void cuantosEstudiantesTienenNotaMayorA51() {
    int nota_final = 0;
    Vector<Integer> notas_finales = new Vector<Integer>();

    for (Vector<Integer> nota : this.notas) {
      for (Integer n : nota) {
        System.out.println(n);
        nota_final += n;
      }
      notas_finales.add(nota_final);
      nota_final = 0;
    }

    int counter = 0;
    for (Integer n : notas_finales) {
      if (n >= 51) {
        counter++;
      }
    }
    System.out.println("Estudiantes que tienen nota mayor a 51: " + counter);
  }

  public void mostrarNotaYDatosDelEstudiante() {
    String es = "";
    int nota_final = 0;
    for (Vector<String> est : this.estudiantes) {
      for (String e : est) {
        System.out.println(e);
        es += e + " ";
      }
    }

    for (Vector<Integer> nota : this.notas) {
      for (Integer n : nota) {
        System.out.println(n);
        nota_final += n;
      }
    }

    System.out.println("Nota total: " + nota_final + " Estudiante: " + es);
  }

  public void obtenerDatosYNotasDelEstudiante(String apellido) {
    for (int i = 0; i < this.estudiantes.size(); i++) {
      Vector<String> estudiante = this.estudiantes.get(i);
      if (estudiante.get(1).equals(apellido)) {
        System.out.println("Datos del estudiante:");
        System.out.println("Nombre: " + estudiante.get(0));
        System.out.println("Apellido paterno: " + estudiante.get(1));
        System.out.println("Apellido materno: " + estudiante.get(2));

        System.out.println("Notas del estudiante:");
        Vector<Integer> notas = this.notas.get(i);
        System.out.println("Parcial 1: " + notas.get(0));
        System.out.println("Parcial 2: " + notas.get(1));
        System.out.println("Examen final: " + notas.get(2));

        return;
      } else {
        System.out.println("No existe el estudiante con apelliso: " + apellido);
      }
    }
  }
}

class Main {
  public static void main(String[] args) {
    estudiantes clase = new estudiantes();
    clase.llenarYMostrarMatrices();
    clase.llenarYMostrarMatrices();
    /* clase.llenarYMostrarMatrices(); */
    /* clase.llenarYMostrarMatrices(); */

    clase.mostrarEstudiantes();
    /* clase.mayorNota(); */
    /* clase.cuantosEstudiantesTienenNotaMayorA51(); */
    /* clase.mostrarNotaYDatosDelEstudiante(); */
    /* clase.obtenerDatosYNotasDelEstudiante("Velarde"); */
  }
}
