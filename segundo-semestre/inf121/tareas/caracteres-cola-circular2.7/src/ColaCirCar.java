import java.util.Scanner;

public class ColaCirCar extends ColaCar {
  public ColaCirCar() { super(); }

  public int nroElem() { return (fi - fr + MAX) % MAX; }

  public boolean esVacia() {
    if (nroElem() == 0)
      return true;
    return false;
  }

  public boolean esLlena() {
    if (nroElem() == MAX - 1)
      return true;
    return false;
  }

  public void adi(char c) {
    if (!esLlena()) {
      fi = (fi + 1) % MAX;
      v[fi] = c;
    } else {
      System.out.println("Cola Circular de caracteres esta llena");
    }
  }

  public char eli() {
    char elem = ' ';
    if (!esVacia()) {
      fr = (fr + 1) % MAX;
      elem = v[fr];
    } else {
      System.out.println("Cola Circular de char vacia.");
    }
    return elem;
  }

  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);
    for (int i = 1; i <= n; i++) {
      System.out.println("Ingresar caracter");
      char c = lee.next().charAt(0);
      adi(c);
    }
  }

  public void mostrar() {
    ColaCirCar aux = new ColaCirCar();

    while (!esVacia()) {
      char elem = eli();
      System.out.println("-----------------------------");
      System.out.println("elemento: \t" + elem);
      aux.adi(elem);
    }
    vaciar(aux);
  }

  public void vaciar(ColaCirCar c) {
    while (!c.esVacia()) {
      adi(c.eli());
    }
  }
}
