import java.util.Scanner;

public class ColaSimpleCli extends ColaCli {
  public ColaSimpleCli() { super(); }
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
  public void adi(Cliente elem) {
    if (esLlena())
      System.out.println("cola simple llena!!!");
    else {
      fi++;
      v[fi] = elem;
    }
  }
  public Cliente eli() {
    Cliente elem = new Cliente("", "", "");
    if (esVacia())
      System.out.println("Cola simple vacia!!");
    else {
      fr++;
      elem = v[fr];
    }
    return elem;
  }
  public int nroElem() { return (fi - fr); }
  public void vaciar(ColaSimpleCli z) {
    while (!z.esVacia()) {
      adi(z.eli());
    }
  }
  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);

    for (int i = 1; i <= n; i++) {
      System.out.println("Intr. nombre, edad, codigo de cliente");
      String nom = lee.next();
      String edad = lee.next();
      String codigo = lee.next();

      Cliente x = new Cliente(nom, edad, codigo);
      adi(x);
    }
    // lee.close();
  }
  public void mostrar() {
    ColaSimpleCli aux = new ColaSimpleCli();
    Cliente x;
    while (!esVacia()) {
      x = eli();
      x.mostrar();
      aux.adi(x);
    }
    vaciar(aux);
  }
}
