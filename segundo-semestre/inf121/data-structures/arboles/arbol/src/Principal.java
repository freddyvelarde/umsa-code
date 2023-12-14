public class Principal {
  public static void main(String[] args) {
    AB_NormalP z = new AB_NormalP();
    NodoP r = new NodoP();
    z.setRaiz(r);
    z.crear(z.getRaiz());
    /* z.preOrden(z.getRaiz()); */
    z.hojas(r);

    /* System.out.println(z.nroNodos()); */
  }
}
