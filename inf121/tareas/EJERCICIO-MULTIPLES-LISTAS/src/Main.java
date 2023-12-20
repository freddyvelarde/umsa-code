import ordenes.LS_NormalOrd;
import ventas.LS_NormalVenta;

class Main {
  public static void main(String[] arg) {
    LS_NormalVenta l = new LS_NormalVenta();
    l.leer2(2);
    System.out.println("output:");
    l.mostrar();
  }

  public int contarPedCombo(LS_NormalVenta lsv, int nroCombox) {
    int cant = 0;
    NodoVenta R = lsv.getP();

    while (R != null) {
      NodoOrd Q = R.getLord().getP();

      while (Q != null) {
        NodoCbPed S = Q.getLped().getP();

        while (S != null) {
          if (S.getNroCombo() == nroCombox) {
            cant += S.getCantidad();
          }
          S = S.getSig();
        }

        Q = Q.getSig();
      }

      R = R.getSig();
    }

    return cant;
  }

  public void mostrarTotalPedCombo(LS_NormalVenta lsv, LS_NormalCombo lsc) {
    NodoCombo R = lsc.getP();

    while (R != null) {
      int nroCombo = R.getNroCombo();
      System.out.println(R.getNombre() + " " + contarPedCombo(lsv, nroCombo));
      R = R.getSig();
    }
  }
}
