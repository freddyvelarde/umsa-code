class Main {

  public static void main(String args[]) {
    Proyecto p1 = new Proyecto("p1", "info", "e1");
    Proyecto p2 = new Proyecto("p2", "ing", "e2");

    Proyecto p3 = new Proyecto("p3", "med", "e3");
    Proyecto p4 = new Proyecto("p4", "econ", "e4");
    Proyecto p5 = new Proyecto("p5", "socio", "e5");

    Proyecto p6 = new Proyecto("p6", "info", "e6");
    Proyecto p7 = new Proyecto("p7", "ing", "e4");
    Proyecto p8 = new Proyecto("p8", "econ", "e8");

    // a)
    Mp_ColaSimpleProy stand = new Mp_ColaSimpleProy();
    stand.adicionar(0, p1);
    stand.adicionar(0, p2);
    stand.adicionar(1, p3);
    stand.adicionar(1, p4);
    stand.adicionar(1, p5);
    stand.adicionar(2, p6);
    stand.adicionar(2, p7);
    stand.adicionar(2, p8);

    /* stand.mostrar(); */

    // b)
    /* mostrarUltimoProyecto(stand, 0); */
    /* stand.mostrar(); */

    // c)
    /* mostrarStandPorCarrera(stand, "ing"); */
  }
  static void mostrarStandPorCarrera(Mp_ColaSimpleProy stand, String carreraX) {
    for (int i = 0; i <= stand.getN(); i++) {
      ColaSimpleProy aux = new ColaSimpleProy();
      boolean sw = false;
      while (!stand.esVacia(i)) {
        Proyecto x = stand.eliminar(i);
        if (x.getCarrera() == carreraX) {
          sw = true;
        }
        aux.adi(x);
      }
      stand.vaciar(i, aux);
      if (sw) {
        System.out.println("stand con carrera: " + carreraX);
        stand.mostrar(i);
      }
      sw = false;
    }
  }

  /* static void existeCarrera */

  // b
  static void mostrarUltimoProyecto(Mp_ColaSimpleProy stand, int i) {

    int nroElem = stand.nroElem(i);

    int counter = 1;
    ColaSimpleProy aux = new ColaSimpleProy();
    while (!stand.esVacia(i)) {
      Proyecto x = stand.eliminar(i);

      if (counter == nroElem) {
        System.out.println("Ultimo proyecto: ");
        System.out.println("titulo: " + x.getTitulo());
        System.out.println("carrera: " + x.getCarrera());
        System.out.println("expositor: " + x.getExpositor());
      }

      aux.adi(x);
      counter++;
    }
    stand.vaciar(i, aux);
  }
}
