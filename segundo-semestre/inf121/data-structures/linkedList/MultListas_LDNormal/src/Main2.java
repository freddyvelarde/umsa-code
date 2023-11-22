public class Main2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("nombre: MARCELO ARUQUIPA");
    System.out.println("CI: 123456 \n");

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

    ldm.adiPrimero("inf-111", le4);
    ldm.adiPrimero("inf-112", le3);
    ldm.adiPrimero("inf-131", le2);
    ldm.adiPrimero("inf-121", le1);

    // System.out.println(ldm.esVacia());
    // ldm.leer1(4);
    ldm.mostrar();

    /* // a) Mostrar las siglas de las materias donde se encuentre el estudiante
     * de */
    /* // nombre x */
    /* System.out.println( */
    /*     "\n Mostrar las siglas de las materias donde se encuentre el
     * estudiante de nombre x"); */
    /* mostrarSiglaEst(ldm, "fredy"); */
    /*  */
    /* // b) Mostrar las materias que tengan el mayor numero de estudiantes */
    /* System.out.println( */
    /*     "\nMostrar las materias que tengan el mayor numero de estudiantes");
     */
    /* mostrarMatMayorNroEst(ldm); */

    //		LS_NormalE z = new LS_NormalE();
    //		z.adiFinal("alan");
    //		z.adiFinal("edwin");
    //		z.adiFinal("maria");
    //		z.adiFinal("juana");
    //
    //		z.adiPrincipio("russel");

    //		z.leer2(4);
    //		z.mostrar();
  }
  // solucion b)
  static void mostrarMatMayorNroEst(LD_NormalM ldm) {
    int may = mayorNroEst(ldm);
    NodoM R = ldm.getP();
    int nroMat = ldm.nroNodos();
    for (int i = 1; i <= nroMat; i++) {
      if (R.getLe().nroNodos() == may)
        System.out.println("sigla: " + R.getSigla());
      R = R.getSig();
    }
  }

  static int mayorNroEst(LD_NormalM ldm) {
    int may = 0;
    NodoM R = ldm.getP();
    int nroMat = ldm.nroNodos();
    for (int i = 1; i <= nroMat; i++) {
      if (R.getLe().nroNodos() > may)
        may = R.getLe().nroNodos();
      R = R.getSig();
    }
    return may;
  }
  // solucion a)
  static void mostrarSiglaEst(LD_NormalM ldm, String nomx) {
    NodoM R = ldm.getP();
    while (R != null) {
      LS_NormalE aux = R.getLe();
      if (buscarEst(aux, nomx))
        System.out.println("sigla: " + R.getSigla());
      R = R.getSig();
    }
  }

  static boolean buscarEst(LS_NormalE aux, String nomx) {
    NodoE R = aux.getP();
    boolean sw = false;
    while (R != null) {
      if (R.getNom().equals(nomx))
        sw = true;
      R = R.getSig();
    }
    return sw;
  }
}
