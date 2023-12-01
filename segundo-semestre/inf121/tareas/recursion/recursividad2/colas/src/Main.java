public class Main {
  public static void main(String[] args) {

    ColaSimplePer c = new ColaSimplePer();

    c.adi(new Persona("Freddy", 22));
    c.adi(new Persona("eric", 13));
    c.adi(new Persona("fernanda", 31));

    /* mostrar(c); */

    /* System.out.println(mayorEdad(c)); */
  }

  static int mayorEdad(ColaSimplePer W) {
    if (!W.esVacia()) {
      Persona p = W.eli();
      int may = mayorEdad(W);
      if (may > p.getEdad()) {
        return may;
      } else {
        return p.getEdad();
      }
    } else {
      return 0;
    }
  }

  static void mostrar(ColaSimplePer W) {
    if (!W.esVacia()) {
      Persona p = W.eli();
      p.mostrar();
      mostrar(W);
    }
  }
}
