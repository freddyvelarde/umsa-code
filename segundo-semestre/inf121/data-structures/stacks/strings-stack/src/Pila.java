import java.util.Scanner;

public class Pila<T> extends Vector {
  private int tope;

  public Pila() { this.tope = -1; }

  public boolean esVacia() {
    if (this.tope == -1)
      return true;
    return false;
  }

  public boolean esLlena() {
    if (this.tope == this.max - 1)
      return true;
    return false;
  }

  public void adi(T elem) {
    if (this.esLlena())
      System.out.println("Pila llena!!!");
    else {
      this.tope++;
      this.v[this.tope] = elem;
    }
  }

  public T eli() {
    T elem = null;
    if (this.esVacia())
      System.out.println("Pila Vacia!!");
    else {
      elem = (T)this.v[this.tope];
      this.v[this.tope] = null;
      this.tope--;
    }
    return elem;
    /* T elem = null; */
    /* if (this.esVacia()) */
    /*   System.out.println("Pila Vacia!!"); */
    /* else { */
    /*   elem = (T)this.v[this.tope]; */
    /*   this.tope--; */
    /* } */
    /* return elem; */
  }

  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);
    System.out.println("Ingresa tus datos:");
    for (int i = 0; i < n; i++) {
      T elem = (T)lee.nextLine();
      this.adi(elem);
    }
    lee.close();
  }

  public void mostrar() {
    Pila<T> aux = new Pila<>(); // Specify the type parameter for aux
    while (!esVacia()) {
      T elem = this.eli();
      System.out.println("elemento: " + elem);
      aux.adi(elem);
    }
    this.vaciar(aux);
  }

  public void vaciar(Pila aux) {
    while (!aux.esVacia()) {
      T elem = (T)aux.eli();
      this.adi(elem);
    }
  }

  public int nroElem() { return tope + 1; }
}
