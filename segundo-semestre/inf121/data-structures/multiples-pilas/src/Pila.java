class Vector {
  protected int max = 50;
  Estudiante[] v = new Estudiante[max];
}

class Pila extends Vector {
  private int tope;

  public Pila() { tope = -1; }

  public boolean esVacia() { return tope == -1; }

  public boolean esLlena() { return tope == max - 1; }

  public void adi(Estudiante elem) {
    if (!esLlena()) {
      tope++;
      v[tope] = elem;
    } else
      System.out.println("Pila llena");
  }

  public Estudiante eli() {
    Estudiante elem = null;
    if (!esVacia()) {
      elem = v[tope];
      tope--;
    } else
      System.out.println("Pila vacia");
    return elem;
  }

  public int nroElem() { return tope + 1; }

  public int vaciar(Pila p) {
    int c = 0;
    while (!p.esVacia()) {
      adi(p.eli());
      c++;
    }
    return c;
  }

  public void llenar(int n) {
    for (int i = 1; i <= n; i++) {
      Estudiante e = new Estudiante();
      e.leer();
      adi(e);
    }
  }

  public void mostrar() {
    Pila aux = new Pila();
    while (!esVacia()) {
      Estudiante x = eli();
      x.mostrar();
      aux.adi(x);
    }
    vaciar(aux);
  }
}
