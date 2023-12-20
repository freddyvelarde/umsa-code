public class Main {
  public static void main(String[] args) {
    LS_Normal n = new LS_Normal();
    n.adiFinal(1);
    n.adiFinal(2);
    n.adiFinal(3);
    n.adiFinal(4);

    procesoRec(n.getP());

    System.out.println(suma(n.getP()));

    mostrar(n.getP());

    System.out.println(buscar(n.getP(), 2));
  }

  static boolean buscar(Nodo R, int x) {
    if (R != null) {
      if (R.getQ() == x) {
        return true;
      } else {
        return buscar(R.getSig(), x);
      }
    } else {
      return false;
    }
  }

  static void mostrar(Nodo R) {

    if (R != null) {
      System.out.println(R.getQ());
      mostrar(R.getSig());
    }
  }

  static int suma(Nodo R) {
    if (R != null) {
      return suma(R.getSig()) + R.getQ();
    } else {
      return 0;
    }
  }

  static void procesoRec(Nodo R) {
    if (R != null) {
      System.out.println(R.getQ());
      procesoRec(R.getSig());
    }
  }
}
