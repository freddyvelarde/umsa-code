
public class Main {
  public static void main(String args[]) {
    Cancion c1 =
        new Cancion("pxndx", "bella en mi cabeza por siempre", "rock", 2999);
    Cancion c2 = new Cancion("Camila", "entre tus alas", "romantica", 2499);
    Cancion c3 =
        new Cancion("Luis fonsi", "nada es para siempre", "romantica", 1000);
    Cancion c4 = new Cancion("Rio roma", "princesa", "romantica", 1060);
    Cancion c5 = new Cancion("Queen", "don't stop me now", "rock", 1000);
    Cancion c6 =
        new Cancion("sin bandera", "mientes tan bien", "romantica", 2000);
    ColaSimpleCanciones canciones = new ColaSimpleCanciones();
    canciones.adi(c1);
    canciones.adi(c2);
    canciones.adi(c3);
    canciones.adi(c4);
    canciones.adi(c5);
    canciones.adi(c6);

    // a)
    /* mostrarCancionesConMasReproducciones(canciones); */

    // b)
    /* agregarReprodCancion(canciones); */
    /* canciones.mostrar(); */

    // c)
    ColaSimpleCanciones cancionesB = new ColaSimpleCanciones();
    Cancion c7 = new Cancion("Reik", "noviembre sin ti", "romantica", 2000);
    Cancion c8 = new Cancion("Crash adams", "California Girl", "pop", 4999);
    Cancion c9 = new Cancion("Diezell", "conmiseracion", "rock", 2439);
    Cancion c10 = new Cancion("Adele", "some one like you", "pop", 999);

    cancionesB.adi(c7);
    cancionesB.adi(c8);
    cancionesB.adi(c9);
    cancionesB.adi(c10);
    /* canciones.mostrar(); */

    /* agregarCancion(canciones, c7); */

    moverCancionesDePlaylist(canciones, cancionesB);
    canciones.mostrar();
    /* System.out.println("-0----------"); */
    /* cancionesB.mostrar(); */
  }

  // c
  // this fucking exercise it takes me 4 fuckin' hours :\
  static void moverCancionesDePlaylist(ColaSimpleCanciones cancionesA,
                                       ColaSimpleCanciones cancionesB) {
    /* ColaSimpleCanciones cancionesBAux = new ColaSimpleCanciones(); */
    ColaSimpleCanciones finalSongs = new ColaSimpleCanciones();

    while (!cancionesB.esVacia()) {
      Cancion cB = cancionesB.eli();
      if (existeCancionEnPlayList(cancionesA, cB.getGenero())) {
        agregarCancion(cancionesA, cB);
      } else {
        finalSongs.adi(cB);
      }
      /* cancionesBAux.adi(cB); */
    }
    /* cancionesB.vaciar(cancionesBAux); */
    cancionesA.vaciar(finalSongs);
  }

  static void agregarCancion(ColaSimpleCanciones canciones, Cancion c) {
    ColaSimpleCanciones aux = new ColaSimpleCanciones();
    ColaSimpleCanciones aux2 = new ColaSimpleCanciones();

    boolean addSong = true; // and this song???
    while (!canciones.esVacia()) {
      Cancion x = canciones.eli();

      if (x.getGenero() == c.getGenero() && addSong) {
        aux.adi(x);
        aux.adi(c);
        addSong = false;
      } else {
        aux.adi(x);
      }
    }
    canciones.vaciar(aux);
  }

  static boolean existeCancionEnPlayList(ColaSimpleCanciones playlist,
                                         String generoX) {
    ColaSimpleCanciones aux = new ColaSimpleCanciones();
    boolean sw = false;
    while (!playlist.esVacia()) {
      Cancion x = playlist.eli();

      if (x.getGenero() == generoX) {
        sw = true;
      }
      aux.adi(x);
    }
    playlist.vaciar(aux);
    return sw;
  }

  // a
  static void
  mostrarCancionesConMasReproducciones(ColaSimpleCanciones canciones) {
    ColaSimpleCanciones cancionesAux = new ColaSimpleCanciones();
    int max = 0;
    while (!canciones.esVacia()) {
      Cancion c = canciones.eli();

      if (c.getNroReproducciones() > max) {
        max = c.getNroReproducciones();
      }

      cancionesAux.adi(c);
    }
    canciones.vaciar(cancionesAux);
    while (!canciones.esVacia()) {
      Cancion x = canciones.eli();

      if (x.getNroReproducciones() == max) {
        System.out.println("-------- Cancion mas reproducida --------");
        System.out.println("Artista: " + x.getArtista());
        System.out.println("Titulo: " + x.getTitulo());
      }
      cancionesAux.adi(x);
    }
    canciones.vaciar(cancionesAux);
  }

  // b
  static void agregarReprodCancion(ColaSimpleCanciones canciones) {
    ColaSimpleCanciones cancionesAux = new ColaSimpleCanciones();

    int max = 0;
    String artista = "";
    while (!canciones.esVacia()) {
      Cancion x = canciones.eli();

      if (x.getNroReproducciones() > max) {
        max = x.getNroReproducciones();
        artista = x.getArtista();
      }

      cancionesAux.adi(x);
    }
    canciones.vaciar(cancionesAux);
    while (!canciones.esVacia()) {
      Cancion x = canciones.eli();

      if (x.getArtista() == artista) {
        x.setNroReproducciones(x.getNroReproducciones() + 1);
      }

      cancionesAux.adi(x);
    }
    canciones.vaciar(cancionesAux);
  }
}
