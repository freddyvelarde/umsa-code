public class Main {
  public static void main(String args[]) {
    PilaPar partipantes1 = new PilaPar();
    Participante p1 = new Participante(1, "6to", "freddy", 17);
    Participante p2 = new Participante(2, "4to", "erick", 18);
    Participante p3 = new Participante(1, "5to", "Daniel", 19);
    Participante p4 = new Participante(2, "3to", "Alejandro", 17);
    partipantes1.adi(p1);
    partipantes1.adi(p2);
    PilaPar partipantes2 = new PilaPar();
    partipantes2.adi(p3);
    partipantes2.adi(p4);

    Actividad enero1 = new Actividad(1, "2023-01-21", "pepe", "", partipantes1);
    Actividad febrero1 =
        new Actividad(2, "2023-02-01", "Juan", "Reunion", partipantes1);
    Actividad marzo1 =
        new Actividad(3, "2023-03-15", "Maria", "Presentación", partipantes1);
    Actividad abril1 =
        new Actividad(4, "2023-04-01", "Andres", "Reunion", partipantes1);
    Actividad mayo1 =
        new Actividad(5, "2023-05-10", "Alejandro", "Seminario", partipantes1);
    Actividad junio1 =
        new Actividad(6, "2023-06-10", "Carlos", "Entrenamiento", partipantes1);
    Actividad julio1 =
        new Actividad(7, "2023-07-10", "Luis", "Campeonato", partipantes1);
    Actividad agosto1 =
        new Actividad(8, "2023-08-20", "Ana", "Conferencia", partipantes1);
    Actividad agosto2 =
        new Actividad(9, "2023-08-10", "Erick", "Reunion", partipantes2);

    Mp_PilaAct x = new Mp_PilaAct();
    x.adicionar(0, enero1);
    x.adicionar(1, febrero1);
    x.adicionar(2, marzo1);
    x.adicionar(3, abril1);
    x.adicionar(4, marzo1);
    x.adicionar(5, junio1);
    x.adicionar(6, julio1);
    /* x.adicionar(7, agosto1); */
    x.adicionar(7, agosto2);

    // a
    /* System.out.println("Numero de participantes: " + */
    /*                    contarParticipantesEnAgosto(x, "2023-08-20")); */

    // b
    contarCumplesPrimos(x);
    /* x.mostrar(); */
  }

  // b
  static void contarCumplesPrimos(Mp_PilaAct actividades) {
    int maxPrimos = 0;
    for (int i = 0; i <= actividades.getN(); i++) {
      Actividad x = actividades.eliminar(i);

      PilaPar par = x.getParticipantes();

      PilaPar parAux = new PilaPar();

      int c = 0;
      while (!par.esVacia()) {
        Participante p = par.eli();

        if (esNumPrimo(p.getEdad())) {
          c++;
        }
        parAux.adi(p);
      }
      par.vaciar(parAux);
      if (c > maxPrimos)
        maxPrimos = c;

      actividades.adicionar(i, x);
    }
    //
    /* System.out.println(maxPrimos); */

    for (int i = 0; i <= actividades.getN(); i++) {
      Actividad x = actividades.eliminar(i);

      PilaPar par = x.getParticipantes();

      PilaPar parAux = new PilaPar();
      int c = 0;
      while (!par.esVacia()) {
        Participante p = par.eli();

        if (esNumPrimo(p.getEdad())) {
          c++;
        }

        parAux.adi(p);
      }
      par.vaciar(parAux);
      if (c == maxPrimos)
        System.out.println(
            "el mes con mas actividaes con participantes con cumpleanios con numero par, es el mes: " +
            i);

      actividades.adicionar(i, x);
    }
  }

  static boolean esNumPrimo(int num) {
    if (num <= 1) {
      return false;
    }
    if (num <= 3) {
      return true;
    }

    if (num % 2 == 0 || num % 3 == 0) {
      return false;
    }

    for (int i = 5; i * i <= num; i += 6) {
      if (num % i == 0 || num % (i + 2) == 0) {
        return false;
      }
    }

    return true;
  }

  // a
  static int contarParticipantesEnAgosto(Mp_PilaAct actividades,
                                         String fechaX) {
    int counter = 0;
    PilaAct aux = new PilaAct();

    while (!actividades.esVacia(7)) {

      Actividad x = actividades.eliminar(7);
      PilaPar participantes = x.getParticipantes();

      PilaPar parAux = new PilaPar();
      while (!participantes.esVacia()) {
        Participante p = participantes.eli();
        if (x.getFecha() == fechaX) {
          counter++;
        }
        parAux.adi(p);
      }
      participantes.vaciar(parAux);

      aux.adi(x);
    }
    actividades.vaciar(7, aux);
    return counter;
  }
}
