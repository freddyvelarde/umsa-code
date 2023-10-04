public class Main {
  public static void main(String args[]) {

    Persona p1 = new Persona("Freddy", 13827575, 21);
    Persona p2 = new Persona("Ed", 13829970, 61);
    Persona p3 = new Persona("Erick", 13827571, 22);
    Persona p4 = new Persona("Manuel", 17887971, 91);

    ColaSimplePersonas p = new ColaSimplePersonas();
    p.adi(p1);
    p.adi(p2);
    p.adi(p3);
    p.adi(p4);

    // a)
    /* movePersonToBeggining(p); */

    // b)
    /* showPersonWithLastDigitFromCiEqualTo(p, 5); */

    // c)
    /* findTheLastDigitMostRepited(p); */
  }

  // a
  static void movePersonToBeggining(ColaSimplePersonas people) {

    ColaSimplePersonas peopleSwap = new ColaSimplePersonas();
    ColaSimplePersonas oldPeople = new ColaSimplePersonas();

    while (!people.esVacia()) {
      Persona p = people.eli();
      if (p.getEdad() >= 60) {
        oldPeople.adi(p);
      } else {
        peopleSwap.adi(p);
      }
    }
    people.vaciar(oldPeople);
    people.vaciar(peopleSwap);
  }

  // b
  static void showPersonWithLastDigitFromCiEqualTo(ColaSimplePersonas people,
                                                   int k) {
    ColaSimplePersonas peopleSwap = new ColaSimplePersonas();
    while (!people.esVacia()) {
      Persona x = people.eli();

      String lastDigitCi = getLastDigitFromCi(x.getCi());

      if (lastDigitCi.equals(String.valueOf(k))) {
        System.out.println("Nombre: " + x.getNombre());
        System.out.println("ci: " + x.getCi());
      }

      peopleSwap.adi(x);
    }
    people.vaciar(peopleSwap);
  }

  static String getLastDigitFromCi(int ci) {
    String ciString = String.valueOf(ci);
    return String.valueOf(ciString.charAt(ciString.length() - 1));
  }

  // c
  static void findTheLastDigitMostRepited(ColaSimplePersonas people) {
    ColaSimplePersonas peopleSwap = new ColaSimplePersonas();
    int max = 0;
    while (!people.esVacia()) {
      Persona x = people.eli();
      int c = 0;
      peopleSwap.adi(x);

      ColaSimplePersonas peopleSwap2 = new ColaSimplePersonas();

      while (!peopleSwap.esVacia()) {
        Persona p = peopleSwap.eli();

        if (getLastDigitFromCi(x.getCi()).equals(
                getLastDigitFromCi(p.getCi()))) {
          c++;
        }

        peopleSwap2.adi(p);
      }
      peopleSwap.vaciar(peopleSwap2);

      if (c > max) {
        max = c;
      }
      c = 0;
    }

    people.vaciar(peopleSwap);

    // :()
    while (!people.esVacia()) {
      Persona x = people.eli();
      int counter = 0;
      peopleSwap.adi(x);

      ColaSimplePersonas peopleSwap2 = new ColaSimplePersonas();

      while (!peopleSwap.esVacia()) {
        Persona p = peopleSwap.eli();

        if (getLastDigitFromCi(x.getCi()).equals(
                getLastDigitFromCi(p.getCi()))) {
          counter++;
        }

        peopleSwap2.adi(p);
      }
      peopleSwap.vaciar(peopleSwap2);

      if (max == counter) {
        System.out.println(getLastDigitFromCi(x.getCi()));
      }
      counter = 0;
    }

    people.vaciar(peopleSwap);
  }
}
