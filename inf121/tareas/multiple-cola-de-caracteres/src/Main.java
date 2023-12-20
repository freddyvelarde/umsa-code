class Main {
  public static void main(String args[]) {
    /* // nora */
    /* ColaSimpleCar nora = new ColaSimpleCar(); */
    /* nora.adi('n'); */
    /* nora.adi('o'); */
    /* nora.adi('r'); */
    /* nora.adi('a'); */
    /*  */
    /* ColaSimpleCar miguel = new ColaSimpleCar(); */
    /* nora.adi('m'); */
    /* nora.adi('i'); */
    /* nora.adi('g'); */
    /* nora.adi('u'); */
    /* nora.adi('e'); */
    /* nora.adi('l'); */
    /*  */
    /* ColaSimpleCar alex = new ColaSimpleCar(); */
    /* nora.adi('a'); */
    /* nora.adi('l'); */
    /* nora.adi('e'); */
    /* nora.adi('x'); */

    /* nora.mostrar(); */
    /* miguel.mostrar(); */
    /* nora.mostrar(); */

    Mp_ColaSimCar c = new Mp_ColaSimCar();
    c.llenar(3);

    /* c.vaciar(0, nora); */
    /* c.vaciar(1, miguel); */
    /* c.vaciar(2, alex); */

    reverseCharStack(c, 1);

    c.mostrar();

    System.out.println("Nombre: Velarde Silva Freddy Erick");
    System.out.println("CI: 13827575 LP");
  }

  static void reverseCharStack(Mp_ColaSimCar chars, int indexTarget) {
    for (int i = 0; i < chars.getN(); i++) {

      PilaCar aux = new PilaCar();
      if (i == indexTarget) {
        while (!chars.esVacia(i)) {
          char x = chars.eliminar(i);
          aux.adi(x);
        }
      }
      aux.mostrar();

      while (!aux.esVacia()) {
        chars.adicionar(i, aux.eli());
      }
    }
  }
}
