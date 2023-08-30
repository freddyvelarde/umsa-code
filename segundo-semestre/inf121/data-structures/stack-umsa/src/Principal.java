public class Principal {

  public static void main(String[] args) {
    PilaNum nums = new PilaNum();
    nums.llenar(3);
    System.out.println("elementos: ");
    nums.mostrar();

    ordenarPilarAsc(nums);

    System.out.println("elementos ordenados: ");
    nums.mostrar();
  }

  static void ordenarPilarAsc(PilaNum x) {
    PilaNum aux = new PilaNum();
    PilaNum orden = new PilaNum();

    while (!x.esVacia()) {
      int may = x.eli();

      while (!x.esVacia()) {
        int dato = x.eli();
        if (may < dato) {
          aux.adi(may);
          may = dato;
        } else {
          aux.adi(dato);
        }
      }

      orden.adi(may);
      x.vaciar(aux);
    }
    x.vaciar(orden);
  }
}
