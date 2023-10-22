public class Principal {

  public static void main(String[] args) {
    LS_NormalPer A = new LS_NormalPer();

    System.out.println(A.esVacia());
    System.out.println("\nnro de nodos de la lista: " + A.nroNodos());

    Persona z1 = new Persona("mario", 15);
    Persona z2 = new Persona("luis", 22);
    Persona z3 = new Persona("alan", 20);
    Persona z4 = new Persona("lupe", 22);
    Persona z5 = new Persona("marce", 25);

    A.adiPrincipio(z1);
    A.adiPrincipio(z2);
    A.adiPrincipio(z3);
    A.adiPrincipio(z4);

    System.out.println(A.esVacia());
    System.out.println("\n---------datos de la lísta");
    A.mostrar();

    A.adiFinal(z5);

    System.out.println("\n-------- datos de la lísta");
    A.mostrar();

    System.out.println("\nnro de nodos de la lista: " + A.nroNodos());
  }
}
