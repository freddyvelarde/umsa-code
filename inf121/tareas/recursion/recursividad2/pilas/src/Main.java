public class Main {
  public static void main(String[] args) {
    Pila p = new Pila();
    p.adi(1);
    p.adi(2);
    p.adi(3);
    p.adi(4);
    p.adi(5);
    p.adi(6);

    // recorrido recursivo
    procesoRec(p);

    // suma de los numeros de la pila recursiva
    System.out.println(suma(p));

    // contar los numeros multiplos del numero "x"
    System.out.println(contarMulti(p, 2));
  }

  static int contarMulti(Pila A, int x) {
    if (!A.esVacia()) {
      int z = A.eli();
      int r = contarMulti(A, x);
      if (z % x == 0) {
        r++;
      }
      return r;
    } else {
      return 0;
    }
  }

  static int suma(Pila A) {
    if (A.esVacia())
      return 0;
    return A.eli() + suma(A);
  }

  static void procesoRec(Pila A) {
    if (!A.esVacia()) {
      int x = A.eli();
      System.out.println("numero: " + x);
      procesoRec(A);
    }
  }
}
