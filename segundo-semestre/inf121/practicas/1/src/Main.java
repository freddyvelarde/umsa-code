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
    Comerciante c1 = new Comerciante("Miguel", 21, 102);
    Comerciante c2 = new Comerciante("Sofia", 20, 102);
    Comerciante c3 = new Comerciante("Andrea", 19, 101);
    Comerciante c4 = new Comerciante("Carmen", 23, 103);
    Comerciante c5 = new Comerciante("Luis", 22, 101);
    Comerciante c6 = new Comerciante("Hugo", 26, 101);

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

    eliminarComerciantes(comerciantes, mercados, "Garita");
    comerciantes.mostrar();
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
}
