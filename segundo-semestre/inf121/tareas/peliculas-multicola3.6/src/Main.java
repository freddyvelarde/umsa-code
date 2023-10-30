public class Main {
  public static void main(String args[]) {
    Pelicula t1 = new Pelicula("Pesadilla en Elm Street", "Terror", 91, 1984);
    Pelicula t2 = new Pelicula("El Resplandor", "Terror", 146, 1980);
    Pelicula t3 = new Pelicula("El Conjuro", "Terror", 112, 2013);
    Pelicula t4 = new Pelicula("Evil dead", "Terror", 35, 2013);

    Pelicula a1 =
        new Pelicula("Mad Max: Furia en el Camino", "accion", 120, 2015);
    Pelicula a2 = new Pelicula("Misión Imposible", "accion", 147, 1996);
    Pelicula a3 = new Pelicula("John Wick", "accion", 101, 2013);

    Mp_ColaSimPel peliculas = new Mp_ColaSimPel();
    peliculas.adicionar(0, t1);
    peliculas.adicionar(0, t2);
    peliculas.adicionar(0, t3);
    peliculas.adicionar(0, t4);
    peliculas.adicionar(1, a1);
    peliculas.adicionar(1, a2);
    peliculas.adicionar(1, a3);

    // a)
    /* moverPelicula(peliculas, 2013); */
    /* peliculas.mostrar(); */

    // b)
    /* repartirPeliculas(peliculas, "accion"); */
    /* peliculas.mostrar(); */

    // c)
    // moverPeliculasPorDuracion(peliculas);
    // peliculas.mostrar();
  }

  // c
  static void moverPeliculasPorDuracion(Mp_ColaSimPel peliculas) {

    Mp_ColaSimPel aux = new Mp_ColaSimPel();
    for (int i = 0; i <= peliculas.getN(); i++) {
      ColaSimPel cspAux = new ColaSimPel();

      while (!peliculas.esVacia(i)) {
        Pelicula x = peliculas.eliminar(i);
        int dur = convertirMinAHrs(x.getDuracion());
        aux.adicionar(dur, x);

        cspAux.adi(x);
      }
    }

    for (int i = 0; i <= aux.getN(); i++) {
      ColaSimPel cspAux = new ColaSimPel();

      while (!aux.esVacia(i)) {
        Pelicula x = aux.eliminar(i);
        // System.out.println("i: " + i + " " + x.getNombre());

        cspAux.adi(x);
      }
      cspAux.mostrar();
      peliculas.vaciar(i, cspAux);
    }
  }

  static int convertirMinAHrs(int minutos) { return (int)minutos / 60; }

  // b
  static void repartirPeliculas(Mp_ColaSimPel peliculas, String generoY) {
    peliculas.vaciar(1, 0);
    ColaSimPel pelisSelected = new ColaSimPel();
    for (int i = 0; i <= peliculas.getN(); i++) {
      ColaSimPel cspAux = new ColaSimPel();

      while (!peliculas.esVacia(i)) {
        Pelicula x = peliculas.eliminar(i);

        if (x.getGenero() == generoY) {
          pelisSelected.adi(x);
        } else {

          cspAux.adi(x);
        }
      }
      peliculas.vaciar(i, cspAux);
    }
    peliculas.vaciar(0, pelisSelected);
  }

  // a
  static void moverPelicula(Mp_ColaSimPel peliculas, int fechaX) {
    for (int i = 0; i <= peliculas.getN(); i++) {
      ColaSimPel cspAux = new ColaSimPel();
      ColaSimPel pelX = new ColaSimPel();

      while (!peliculas.esVacia(i)) {
        Pelicula x = peliculas.eliminar(i);
        if (x.getAnioEstreno() == fechaX) {
          pelX.adi(x);
        } else {
          cspAux.adi(x);
        }
      }
      peliculas.vaciar(i, pelX);
      peliculas.vaciar(i, cspAux);
    }
  }
}
