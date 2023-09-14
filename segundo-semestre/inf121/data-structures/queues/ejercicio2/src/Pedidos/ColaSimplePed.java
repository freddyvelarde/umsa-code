import java.util.Scanner;

public class ColaSimplePed extends ColaPed {
  public ColaSimplePed() { super(); }
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
  public void adi(Pedidos elem) {
    if (esLlena())
      System.out.println("cola simple llena!!!");
    else {
      fi++;
      v[fi] = elem;
    }
  }
  public Pedidos eli() {
    Pedidos elem = new Pedidos("", "", 0, 0, "");
    if (esVacia())
      System.out.println("Cola simple vacia!!");
    else {
      fr++;
      elem = v[fr];
    }
    return elem;
  }
  public int nroElem() { return (fi - fr); }
  public void vaciar(ColaSimplePed z) {
    while (!z.esVacia()) {
      adi(z.eli());
    }
  }
  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);

    for (int i = 1; i <= n; i++) {
      System.out.println(
          "Introduce código de cliente, número de pedido, fecha, cantidad y código de libro:");
      String codCli = lee.next();
      int nroPed = lee.nextInt();
      String fecha = lee.next();
      int cantidad = lee.nextInt();
      String codLib = lee.next();

      Pedidos x = new Pedidos(codCli, fecha, cantidad, nroPed, codLib);
      adi(x);
    }
    // lee.close();
  }

  public void mostrar() {
    ColaSimplePed aux = new ColaSimplePed();
    Pedidos x;
    while (!esVacia()) {
      x = eli();
      x.mostrar();
      aux.adi(x);
    }
    vaciar(aux);
  }
}
