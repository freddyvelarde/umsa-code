import java.util.Scanner;

public class ColaSimpleCar extends ColaCar {

  public ColaSimpleCar() { super(); }
  public boolean esVacia() {
    if (fr == fi)
      return true;
    return false;
  }
  public boolean esLlena() {
    if (fi == MAX - 1)
      return true;
    return false;
  }
  public void adi(char elem) {
    if (esLlena())
      System.out.println("cola simple llena!!!");
    else {
      fi++;
      v[fi] = elem;
    }
  }
  public char eli() {
    char elem = ' ';
    if (esVacia())
      System.out.println("Cola simple vacia!!");
    else {
      fr++;
      elem = v[fr];
    }
    return elem;
  }
  public int nroElem() { return (fi - fr); }
  public void vaciar(ColaSimpleCar z) {
    while (!z.esVacia()) {
      adi(z.eli());
    }
  }
  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);

    for (int i = 1; i <= n; i++) {
      System.out.println("Intr. caracter");

      char x = lee.next().charAt(0);
      adi(x);
    }
  }
  public void mostrar() {
    ColaSimpleCar aux = new ColaSimpleCar();
    char x;

    System.out.println("Caracteres de la Cola: ");
    while (!esVacia()) {
      x = eli();
      System.out.println("elemento: " + x);
      aux.adi(x);
    }
    vaciar(aux);
  }
}
