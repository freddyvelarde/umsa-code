public class Principal {

  public static void main(String[] args) {
    LD_NormalP A = new LD_NormalP();

    Proyecto z1 = new Proyecto("tienda", "willy", "monica");
    Proyecto z2 = new Proyecto("juego", "ana", "bryan");
    Proyecto z3 = new Proyecto("uml", "jose", "adrian");
    Proyecto z4 = new Proyecto("oop", "alan", "jorge");

    A.adiPrimero(z1);
    A.adiPrimero(z2);
    A.adiPrimero(z3);

    A.eliPrimero();

    A.mostrar();
  }
}
