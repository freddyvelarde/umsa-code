import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("nombre: Freddy Erick Velarde Silva");
    System.out.println("CI: 13827575 \n");

    // LISTA DOBLE MULTIPLE
    LD_NormalM ldm = new LD_NormalM();

    // LISTAS SIMPLES DE ESTUDIANTES
    LS_NormalE le1 = new LS_NormalE();
    LS_NormalE le2 = new LS_NormalE();
    LS_NormalE le3 = new LS_NormalE();
    LS_NormalE le4 = new LS_NormalE();

    le1.adiFinal("juan");
    le1.adiFinal("marco");
    le1.adiFinal("ana");
    le1.adiFinal("fredy");
    le2.adiFinal("marco");
    le2.adiFinal("luis");
    le2.adiFinal("ana");
    le2.adiFinal("juan");
    le3.adiFinal("marco");
    le3.adiFinal("jeny");
    le3.adiFinal("fredy");
    le4.adiFinal("ana");
    le4.adiFinal("elba");

    ldm.adiFinal("inf-121", le1);
    ldm.adiFinal("inf-131", le2);
    ldm.adiFinal("inf-112", le3);
    ldm.adiFinal("inf-111", le4);

    /* ldm.mostrar(); */

    // c)
    /* System.out.println("inciso c: \n"); */
    /* contarMateriasPorEstudiante(ldm); */

    // d)
    System.out.println("inciso d: \n");
    agregarMateria(ldm);
    ldm.mostrar();
  }

  // solucion d)
  static void agregarMateria(LD_NormalM materias) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("insert, siglaz, nroEst, nueva sigla");
    String siglaX = scanner.next();
    int nroEst = scanner.nextInt();
    String nuevoSigla = scanner.next();
    NodoM R = materias.getP();
    NodoM prev = null;
    LS_NormalE nuevosEstudiantes = new LS_NormalE();
    nuevosEstudiantes.leer2(nroEst);
    NodoM nuevaMateria = new NodoM();
    nuevaMateria.setLe(nuevosEstudiantes);
    nuevaMateria.setSigla(nuevoSigla);

    int counter = 1;
    while (R != null) {
      if (R.getSigla().equals(siglaX)) {
        if (counter >= 2) {
          R.setAnt(nuevaMateria);
          nuevaMateria.setSig(R);
          if (prev != null) {
            prev.setSig(nuevaMateria);
          } else {
            materias.setP(nuevaMateria);
          }
          nuevaMateria.setAnt(prev);
          return;
        } else {
          R.setAnt(nuevaMateria);
          nuevaMateria.setSig(R);
          if (prev != null) {
            prev.setSig(nuevaMateria);
          } else {
            materias.setP(nuevaMateria);
          }
          return;
        }
      }
      counter++;
      prev = R;
      R = R.getSig();
    }
  }

  // solucion c)
  static void contarMateriasPorEstudiante(LD_NormalM materias) {
    NodoM inf121 = materias.getP();
    LS_NormalE estudiantes = inf121.getLe();
    NodoE nodoEstudiante = estudiantes.getP();
    while (nodoEstudiante != null) {
      String currentNom = nodoEstudiante.getNom();
      NodoM S = materias.getP();

      int counter = 0;
      while (S != null) {
        LS_NormalE x = S.getLe();
        NodoE e = x.getP();
        while (e != null) {
          if (e.getNom().equals(currentNom))
            counter++;

          e = e.getSig();
        }
        S = S.getSig();
      }
      System.out.println(currentNom + " asiste a " + counter);

      nodoEstudiante = nodoEstudiante.getSig();
    }
  }
}
