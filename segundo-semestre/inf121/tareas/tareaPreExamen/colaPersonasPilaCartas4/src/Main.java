import Cartas.Carta;
import Cartas.PilaCartas;
import Personas.ColaSimplePersonas;
import Personas.Persona;

class Main {
  public static void main(String args[]) {
    Persona p1 = new Persona(111, "freddy", "Velarde", "Silva");
    Persona p2 = new Persona(222, "erick", "silva", "velarde");
    Persona p3 = new Persona(333, "camila", "tarqui", "quispe");

    ColaSimplePersonas personas = new ColaSimplePersonas();
    personas.adi(p1);
    personas.adi(p2);
    personas.adi(p3);

    // cartas
    Carta c1 =
        new Carta("02-01-2022", 222, "hello world", "this is hello world");
    Carta c2 =
        new Carta("03-04-2022", 333, "hello world3", "this is hello world3");
    Carta c3 =
        new Carta("01-04-2022", 111, "hello world2", "this is hello world2");
    PilaCartas cartas = new PilaCartas();
    cartas.adi(c1);
    cartas.adi(c2);
    cartas.adi(c3);

    // a
    /* mostrarPersonas(personas, cartas); */
    // b
    /* mostrarCartaPorFecha(personas, cartas, "15-04-2022"); */

    // c
    /* agruparCartas(personas, cartas); */

    /* personas.mostrar(); */
    /* cartas.mostrar(); */
  }

  static void agruparCartas(ColaSimplePersonas personas, PilaCartas cartas) {
    ColaSimplePersonas personasAux = new ColaSimplePersonas();

    PilaCartas cartasAux2 = new PilaCartas();
    while (!personas.esVacia()) {
      Persona p = personas.eli();
      PilaCartas cartasAux = new PilaCartas();

      while (!cartas.esVacia()) {
        Carta c = cartas.eli();

        if (p.getCi() == c.getCi()) {
          cartasAux2.adi(c);
          System.out.println("feca: " + c.getFecha());
        }
        cartasAux.adi(c);
      }
      cartas.vaciar(cartasAux);

      personasAux.adi(p);
    }
    cartas.vaciar(cartasAux2);
    personas.vaciar(personasAux);
  }

  static void mostrarCartaPorFecha(ColaSimplePersonas personas,
                                   PilaCartas cartas, String fecha) {
    PilaCartas cartasAux = new PilaCartas();

    while (!cartas.esVacia()) {
      Carta c = cartas.eli();
      ColaSimplePersonas personasAux = new ColaSimplePersonas();
      if (c.getFecha() == fecha) {
        while (!personas.esVacia()) {
          Persona p = personas.eli();

          if (p.getCi() == c.getCi()) {

            System.out.println("Carta: ");
            System.out.println("asunto: " + c.getAsunto());
            System.out.println("persona: " + p.getNombre() + " " +
                               p.getPaterno() + " " + p.getMaterno());
            System.out.println("contenido: " + c.getContenido());
          }

          personasAux.adi(p);
        }
        personas.vaciar(personasAux);
      }

      cartasAux.adi(c);
    }
    cartas.vaciar(cartasAux);
  }

  static void mostrarPersonas(ColaSimplePersonas personas, PilaCartas cartas) {
    ColaSimplePersonas personasAux = new ColaSimplePersonas();

    int cartasContador = 0;

    while (!personas.esVacia()) {
      Persona x = personas.eli();

      PilaCartas cartasAux = new PilaCartas();
      while (!cartas.esVacia()) {
        Carta c = cartas.eli();
        if (c.getCi() == x.getCi()) {
          cartasContador++;
        }
        cartasAux.adi(c);
      }
      cartas.vaciar(cartasAux);

      System.out.println(x.getNombre() + " tiene: " + cartasContador +
                         " cartas");
      personasAux.adi(x);
      cartasContador = 0;
    }
    personas.vaciar(personasAux);
  }
}
