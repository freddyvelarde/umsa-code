public class Principal {
  public static void main(String[] args) {
    PilaCar pc1 = new PilaCar();
    PilaCar pc2 = new PilaCar();
    PilaCar pc3 = new PilaCar();
    PilaCar pc4 = new PilaCar();
    // aron
    pc1.adi('n');
    pc1.adi('o');
    pc1.adi('r');
    pc1.adi('a');

    // laura
    pc2.adi('a');
    pc2.adi('r');
    pc2.adi('u');
    pc2.adi('a');
    pc2.adi('l');

    // miguel
    pc3.adi('l');
    pc3.adi('e');
    pc3.adi('u');
    pc3.adi('g');
    pc3.adi('i');
    pc3.adi('m');

    // lenny
    pc4.adi('y');
    pc4.adi('n');
    pc4.adi('n');
    pc4.adi('e');
    pc4.adi('l');

    ColaSimplePilaCar z = new ColaSimplePilaCar();
    z.adi(pc1);
    z.adi(pc2);
    z.adi(pc3);
    z.adi(pc4);

    // b)
    /* veriCarPila(z, 'a'); */

    // C)
    /* removeStackName(z, "lenny"); */

    // D)
    exchangeStackToFront(z, "lenny");

    z.mostrar();
    System.out.println("Nombre: Velarde Silva Freddy Erick");
    System.out.println("CI: 13827575 LP");
  }

  // D
  static void exchangeStackToFront(ColaSimplePilaCar stackOfNames,
                                   String targetName) {
    ColaSimplePilaCar stackOfNamesSwap = new ColaSimplePilaCar();
    ColaSimplePilaCar stackNamesMatch = new ColaSimplePilaCar();
    String chars = "";
    while (!stackOfNames.esVacia()) {
      PilaCar names = stackOfNames.eli();
      PilaCar namesSwap = new PilaCar();
      while (!names.esVacia()) {
        char c = names.eli();
        chars += c;
        namesSwap.adi(c);
      }
      names.vaciar(namesSwap);
      if (chars.equals(targetName)) {
        stackNamesMatch.adi(names);
      } else {
        stackOfNamesSwap.adi(names);
      }
      chars = "";
    }
    stackOfNames.vaciar(stackNamesMatch);
    stackOfNames.vaciar(stackOfNamesSwap);
  }

  // C
  static void removeStackName(ColaSimplePilaCar stackOfNames,
                              String targetName) {
    ColaSimplePilaCar stackOfNamesSwap = new ColaSimplePilaCar();
    String chars = "";
    while (!stackOfNames.esVacia()) {
      PilaCar names = stackOfNames.eli();
      PilaCar namesSwap = new PilaCar();
      while (!names.esVacia()) {
        char c = names.eli();
        chars += c;
        namesSwap.adi(c);
      }
      names.vaciar(namesSwap);
      if (!chars.equals(targetName)) {
        stackOfNamesSwap.adi(names);
      }
      chars = "";
    }
    stackOfNames.vaciar(stackOfNamesSwap);
  }

  // B
  static void veriCarPila(ColaSimplePilaCar z, char x) {
    ColaSimplePilaCar aux = new ColaSimplePilaCar();
    while (!z.esVacia()) {
      PilaCar pc = z.eli();
      if (buscarCar(pc, x)) {
        System.out.println("Si existe");
      } else {
        System.out.println("No existe");
      }
      aux.adi(pc);
    }
    z.vaciar(aux);
  }

  public static boolean buscarCar(PilaCar pc, char x) {
    PilaCar aux = new PilaCar();
    boolean sw = false;
    while (!pc.esVacia()) {
      char car = pc.eli();
      if (String.valueOf(car).equals(String.valueOf(x))) {
        sw = true;
      }
      aux.adi(car);
    }
    pc.vaciar(aux);
    return sw;
  }
}
