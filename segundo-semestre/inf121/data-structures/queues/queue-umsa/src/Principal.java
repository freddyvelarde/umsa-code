public class Principal {
  public static void main(String[] args) {
    ColaSimpleEst A = new ColaSimpleEst();
    A.llenar(3);
    A.mostrar();
    System.out.println("nro de elementos: " + A.nroElem());
    /* System.out.println(A.esVacia()); */
    /* System.out.println(A.esLlena()); */
  }
}
