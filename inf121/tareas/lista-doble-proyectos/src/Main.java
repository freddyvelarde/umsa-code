public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    LD_NormalP A = new LD_NormalP();

    System.out.println("Lista vacia: ");
    System.out.println(A.esVacia());

    System.out.println("nro de nodos: ");
    System.out.println(A.nroNodos());

    System.out.println("\nadicionando como primero: ");
    Proyecto z1 = new Proyecto("tienda", "willy", "monica");
    Proyecto z2 = new Proyecto("juego", "ana", "bryan");
    Proyecto z3 = new Proyecto("uml", "jose", "adrian");
    Proyecto z4 = new Proyecto("oop", "alan", "jorge");

    A.adiPrimero(z1);
    A.adiPrimero(z2);
    A.adiPrimero(z3);
    A.adiPrimero(z4);

    A.mostrar();

    /*		System.out.println("\nEliminando el nodo primero");
                    NodoP w = A.eliPrimero();
                    System.out.println("proyecto eliminado: ");
                    w.getProy().mostrar();

                    System.out.println("\nlista doble: ");
                    A.mostrar();

                    //1. Sea una lista doble de proyectos, mostrar a los
       integrantes
                    //del proyecto de titulo x
    */
    mostrarIntegrantesProy(A, "uml");
    nuevoMostrarIntegrantesProy(A, "uml");
  }
  // sol 1)
  static void mostrarIntegrantesProy(LD_NormalP Z, String titulox) {
    NodoP R = Z.getP(); // puntero auxiliar R apunta a la raiz P
    boolean sw = true;
    while (R != null) {
      Proyecto x = R.getProy();
      if (x.getTitulo().equals(titulox)) {
        System.out.println("\nintegrantes del proyecto: " + titulox + " " +
                           x.getNom1() + " - " + x.getNom2());
        sw = false;
      }
      R = R.getSig();
    }
    if (sw)
      System.out.println("\nel proyecto con titulo :" + titulox +
                         " no existe!!!");
  }
  // recorrido usando un for
  static void nuevoMostrarIntegrantesProy(LD_NormalP Z, String titulox) {
    NodoP R = Z.getP(); // puntero auxiliar R apunta a la raiz P
    boolean sw = true;
    int nd = Z.nroNodos();
    for (int i = 1; i <= nd; i++) {
      Proyecto x = R.getProy();
      if (x.getTitulo().equals(titulox)) {
        System.out.println("\nintegrantes del proyecto: " + titulox + " " +
                           x.getNom1() + " - " + x.getNom2());
        sw = false;
      }
      R = R.getSig();
    }
    if (sw)
      System.out.println("\nel proyecto con titulo :" + titulox +
                         " no existe!!!");
  }
}
