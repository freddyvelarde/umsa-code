import java.util.Scanner;

public class ColaSimpleNums extends ColaNums {

  public ColaSimpleNums() { super(); }
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
  public void adi(int elem) {
    if (esLlena())
      System.out.println("cola simple llena!!!");
    else {
      fi++;
      v[fi] = elem;
    }
  }
  public int eli() {
    int elem = 0;
    if (esVacia())
      System.out.println("Cola simple vacia!!");
    else {
      fr++;
      elem = v[fr];
    }
    return elem;
  }
  public int nroElem() { return (fi - fr); }
  public void vaciar(ColaSimpleNums z) {
    while (!z.esVacia()) {
      adi(z.eli());
    }
  }
  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);

    for (int i = 1; i <= n; i++) {
      System.out.println("Introduce num");
      int x = lee.nextInt();

      adi(x);
    }
  }
  public void mostrar() {
    ColaSimpleNums aux = new ColaSimpleNums();
    int x;
    while (!esVacia()) {
      x = eli();
      System.out.println("num: " + x);
      aux.adi(x);
    }
    vaciar(aux);
  }
}
