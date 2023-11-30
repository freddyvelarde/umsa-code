import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // a)
    LS_CircularMas L = new LS_CircularMas();
    L.adiFinal("Whiskers", 4, "felino");
    L.adiFinal("Buddy", 6, "canino");
    L.adiFinal("Luna", 2, "felino");
    L.adiFinal("Rocky", 3, "canino");
    L.adiFinal("Spike", 4, "reptil");
    L.adiFinal("Pepper", 1, "ave");
    L.mostrar();

    // b)
    eliminarMascotaX(L, 5, "canino");
    L.mostrar();

    // c)
    LS_CircularMas LFel = new LS_CircularMas();
    crearNuevaListaDeFelinos(L, LFel);
    LFel.mostrar();
  }

  public static void eliminarMascotaX(LS_CircularMas L, int edad, String tipo) {
    NodoMas R = L.getP();
    NodoMas S = R;
    while (R.getSig() != L.getP()) {
      if (R.getEdad() == edad && R.getTipo() == tipo) {
        if (R == L.getP()) {
          R = R.getSig();
          S = R;
          L.setP(R);

        } else {
          S.setSig(R.getSig());
          R = R.getSig();
        }
      } else {
        S = R;
        R = R.getSig();
      }
    }
  }

  public static void crearNuevaListaDeFelinos(LS_CircularMas L,
                                              LS_CircularMas LFel) {
    NodoMas R = L.getP();
    while (R.getSig() != L.getP()) {
      if (R.getTipo() == "felino") {
        LFel.adiFinal(R.getNombre(), R.getEdad(), R.getTipo());
      }
      R = R.getSig();
    }
  }
}
