public class Main {
  public static void main(String args[]) {
    ColaCirCar c = new ColaCirCar();
    /* c.adi('a'); */
    /* c.adi('a'); */
    /* c.adi('b'); */
    /* c.adi('c'); */
    /* c.adi('d'); */
    /* c.adi('d'); */

    c.adi('a');
    c.adi('e');
    c.adi('a');
    c.adi('i');
    c.adi('d');
    c.adi('x');
    c.adi('d');

    // a
    /* System.out.println(verificarSiExisteCadena(c, "dia")); // true */

    // b
    /* moverCaracterMasRepetido(c); */

    // c
    /* eliminarCarsRepetidos(c); */
    /* c.mostrar(); */

    // d) invertir cola
    ColaCirCar colaD = new ColaCirCar();
    colaD.adi('a');
    colaD.adi('e');
    colaD.adi('i');
    colaD.adi('o');
    colaD.adi('u');
    invertirCola(colaD);
  }
  // d
  static void invertirCola(ColaCirCar cars) {
    ColaCirCar aux = new ColaCirCar();

    while (!cars.esVacia()) {
      char x = cars.eli();
      System.out.println(x);

      aux.adi(x);
    }

    cars.vaciar(aux);
  }

  // c
  static void eliminarCarsRepetidos(ColaCirCar cars) {
    ColaCirCar carsAux = new ColaCirCar();
    ColaCirCar repetidos = new ColaCirCar();

    while (!cars.esVacia()) {
      char x = cars.eli();

      if (contadorCaracteres(cars, x) + 1 > 1) {
        repetidos.adi(x);
      } else {
        carsAux.adi(x);
      }
    }
    cars.vaciar(carsAux);

    while (!cars.esVacia()) {
      char a = cars.eli();

      if (!contieneCar(repetidos, a)) {
        carsAux.adi(a);
      }
    }

    cars.vaciar(carsAux);
  }
  static boolean contieneCar(ColaCirCar cars, char c) {
    ColaCirCar aux = new ColaCirCar();
    boolean sw = false;
    while (!cars.esVacia()) {
      char x = cars.eli();
      if (x == c && !sw) {
        sw = true;
      }

      aux.adi(x);
    }
    cars.vaciar(aux);
    return sw;
  }

  // b
  static void moverCaracterMasRepetido(ColaCirCar cars) {
    ColaCirCar carsAux = new ColaCirCar();

    int max = 0;

    while (!cars.esVacia()) {
      char x = cars.eli();
      int c = (contadorCaracteres(cars, x) + 1);
      if (c > max)
        max = c;

      carsAux.adi(x);
    }
    cars.vaciar(carsAux);
    ColaCirCar repetidos = new ColaCirCar();
    while (!cars.esVacia()) {
      char x = cars.eli();

      int c = (contadorCaracteres(cars, x) + 1);

      if (c == max) {
        repetidos.adi(x);
      } else {
        carsAux.adi(x);
      }
    }
    cars.vaciar(repetidos);
    cars.vaciar(carsAux);
  }

  static int contadorCaracteres(ColaCirCar cars, char c) {
    ColaCirCar carsAux = new ColaCirCar();
    int counter = 0;
    while (!cars.esVacia()) {
      char x = cars.eli();

      if (x == c)
        counter++;

      carsAux.adi(x);
    }

    cars.vaciar(carsAux);
    return counter;
  }

  // a
  static boolean verificarSiExisteCadena(ColaCirCar cars, String strX) {
    int counter = 0;
    for (int i = 0; i < strX.length(); i++) {
      ColaCirCar carsAux = new ColaCirCar();
      while (!cars.esVacia()) {
        char x = cars.eli();
        if (x == strX.charAt(i)) {
          carsAux.adi(x);
          cars.vaciar(carsAux);
          counter++;
          break;
        }

        carsAux.adi(x);
      }
      cars.vaciar(carsAux);
    }
    return counter == strX.length();
  }
}
