package Temperatura;
import java.util.Scanner;

public class Mp_PilaTemperatura {
  private int n;
  private PilaTemperatura c[] = new PilaTemperatura[100];

  public Mp_PilaTemperatura() {
    for (int i = 0; i < c.length; i++) {
      c[i] = new PilaTemperatura();
    }
  }
  // El numero de elementos (Pilas) que contiene esta Multi-Pila.
  public int nroElem(int i) { return c[i].nroElem(); }

  // La Pila en la posicion "i", esta vacia?
  public boolean esVacia(int i) { return c[i].esVacia(); }

  // La pila en la posicion "i", esta llena?
  public boolean esLlena(int i) { return c[i].esLlena(); }

  // Adicionar un element (De tipe Temperatura) en la pila en la posicion "i"
  public void adicionar(int i, Temperatura e) {
    c[i].adi(e);
    n++;
  }

  // Eliminar el elemento (De tipe Temperatura) en la pila con posicion "i"
  public Temperatura eliminar(int i) { return c[i].eli(); }

  // llenar de "n" numeros de Pilas
  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);
    this.n = n;
    for (int i = 0; i < n; i++) {
      System.out.println("Introducir el nro elem de la pila");
      int ne = lee.nextInt();
      c[i].llenar(ne);
    }
  }

  // llenar de "n" numeros de Pilas en la Pila con posicion "i"
  public void llenar(int i, int n) { c[i].llenar(n); }

  // muestra todos los elementos de cada Pila dentro de esta Multi-Pila
  public void mostrar() {
    for (int i = 0; i < this.n; i++) {
      c[i].mostrar();
    }
  }

  // muestra todos los elementos de la Pila con posicion "i"
  public void mostrar(int i) { c[i].mostrar(); }

  // Vacia la Pila con posicion "i", con la nueva pila auxiliar

  public void vaciar(int i, PilaTemperatura z) { c[i].vaciar(z); }

  // Vacia la Pila con posicion "i", con la Pila en la posicion "j"
  public void vaciar(int i, int j) { c[i].vaciar(c[j]); }

  // regresa el numero de Pilas dentro de esta Multi-Pila
  public int getN() { return n; }

  public void setN(int n) { this.n = n; } // ?
}
