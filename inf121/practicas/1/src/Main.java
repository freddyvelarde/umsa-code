import comerciante.Comerciante;
import comerciante.LS_NormalComerciante;
import comerciante.NodoComerciante;
import mercado.LS_NormalMercado;
import mercado.Mercado;
import mercado.NodoMercado;

class Main {
  public static void main(String[] args) {
    Mercado m1 = new Mercado(101, "Garita");
    Mercado m2 = new Mercado(102, "Lanza");
    Mercado m3 = new Mercado(103, "Camacho");
    Comerciante c1 = new Comerciante("Miguel", 21, 101);
    Comerciante c2 = new Comerciante("Sofia", 20, 101);
    Comerciante c3 = new Comerciante("Andrea", 19, 101);
    Comerciante c4 = new Comerciante("Carmen", 23, 102);
    Comerciante c5 = new Comerciante("Luis", 22, 103);
    Comerciante c6 = new Comerciante("Hugo", 26, 103);

    LS_NormalComerciante comerciantes = new LS_NormalComerciante();
    comerciantes.adiFinal(c1);
    comerciantes.adiFinal(c2);
    comerciantes.adiFinal(c3);
    comerciantes.adiFinal(c4);
    comerciantes.adiFinal(c5);
    comerciantes.adiFinal(c6);
    LS_NormalMercado mercados = new LS_NormalMercado();
    mercados.adiFinal(m1);
    mercados.adiFinal(m2);
    mercados.adiFinal(m3);

    /* eliminarComerciantes(comerciantes, mercados, "Garita"); */

    // caso 1
    /* System.out.println(verificarComercianteEnMercado(comerciantes, mercados,
     */
    /*                                                  "Sofia", "Lanza")); //
     * true */
    /* // caso 2 */
    /* System.out.println(verificarComercianteEnMercado(comerciantes, mercados,
     */
    /*                                                  "luis", "Lanza")); //
     * false */
    /* comerciantes.mostrar(); */
    mostrarMercadosConMayorNumeroComerciantes(comerciantes, mercados);
  }

  // Verificar si en el mercado de nombre “x” existe el comerciante “y”
  static boolean verificarComercianteEnMercado(
      LS_NormalComerciante comerciantes, LS_NormalMercado mercados,
      String nombreComerciante, String nombreMercado) {
    NodoMercado nodoMercado = mercados.getP();
    NodoComerciante nodoComerciante = comerciantes.getP();

    while (nodoMercado != null) {
      Mercado mercado = nodoMercado.getQ();

      if (mercado.getNombre().equals(nombreMercado)) {

        while (nodoComerciante != null) {
          if (nodoComerciante.getQ().getIdMercado() ==
              nodoMercado.getQ().getId()) {
            if (nodoComerciante.getQ().getNombre() == nombreComerciante) {
              return true;
            }
          }

          nodoComerciante = nodoComerciante.getSig();
        }

        break;
      }

      nodoMercado = nodoMercado.getSig();
    }
    return false;
  }

  // eliminar los comerciantes del mercado de nombre "x"
  static void eliminarComerciantes(LS_NormalComerciante comerciantes,
                                   LS_NormalMercado mercados, String mercadoX) {
    NodoMercado nodoMercado = mercados.getP();

    LS_NormalComerciante res = new LS_NormalComerciante();

    while (nodoMercado != null) {
      Mercado x = nodoMercado.getQ();
      if (x.getNombre().equals(mercadoX)) {
        int n = comerciantes.nroNodos();
        for (int i = 0; i < n; i++) {
          NodoComerciante nodoComerciante = comerciantes.eliPrincipio();
          Comerciante c = nodoComerciante.getQ();
          if (c.getIdMercado() == x.getId())
            res.adiFinal(c);
        }
        break;
      }
      nodoMercado = nodoMercado.getSig();
    }

    int n = res.nroNodos();
    for (int i = 0; i < n; i++) {
      comerciantes.adiFinal(res.eliPrincipio().getQ());
    }
  }

  // Mostrar el o los mercados con el mayor numero de comerciantes.
  static void
  mostrarMercadosConMayorNumeroComerciantes(LS_NormalComerciante comerciantes,
                                            LS_NormalMercado mercados) {
    NodoMercado nodoMercado = mercados.getP();
    int maxComerciantes = 0;
    LS_NormalMercado mercadosConMaxComerciantes = new LS_NormalMercado();

    while (nodoMercado != null) {
      Mercado mercado = nodoMercado.getQ();
      int numComerciantesEnMercado =
          contarComerciantesEnMercado(comerciantes, mercado);

      if (numComerciantesEnMercado > maxComerciantes) {
        maxComerciantes = numComerciantesEnMercado;
        mercadosConMaxComerciantes = new LS_NormalMercado();
        mercadosConMaxComerciantes.adiFinal(mercado);
      } else if (numComerciantesEnMercado == maxComerciantes) {
        mercadosConMaxComerciantes.adiFinal(mercado);
      }

      nodoMercado = nodoMercado.getSig();
    }

    System.out.println("Mercado(s) con el mayor número de comerciantes:");

    NodoMercado nodoMaxComerciantes = mercadosConMaxComerciantes.getP();
    while (nodoMaxComerciantes != null) {
      nodoMaxComerciantes.getQ().mostrar();
      nodoMaxComerciantes = nodoMaxComerciantes.getSig();
    }
  }

  static int contarComerciantesEnMercado(LS_NormalComerciante comerciantes,
                                         Mercado mercado) {
    int count = 0;
    int n = comerciantes.nroNodos();

    for (int i = 0; i < n; i++) {
      NodoComerciante nodoComerciante = comerciantes.eliPrincipio();
      Comerciante comerciante = nodoComerciante.getQ();

      if (comerciante.getIdMercado() == mercado.getId()) {
        count++;
      }

      comerciantes.adiFinal(comerciante);
    }

    return count;
  }
}
