package Personas;

import java.util.Scanner;

public class ColaSimplePersonas extends ColaPersonas {

  public ColaSimplePersonas() { super(); }
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
  public void adi(Persona elem) {
    if (esLlena())
      System.out.println("cola simple llena!!!");
    else {
      fi++;
      v[fi] = elem;
    }
  }
  public Persona eli() {
    Persona elem = new Persona(0, "", "", "");
    if (esVacia())
      System.out.println("Cola simple vacia!!");
    else {
      fr++;
      elem = v[fr];
    }
    return elem;
  }
  public int nroElem() { return (fi - fr); }
  public void vaciar(ColaSimplePersonas z) {
    while (!z.esVacia()) {
      adi(z.eli());
    }
  }
  public void llenar(int n) {
    Scanner lee = new Scanner(System.in);

    for (int i = 1; i <= n; i++) {
      System.out.println("Intr. ci, nombre, paterno, materno");
      int ci = lee.nextInt();
      String nombre = lee.next();
      String paterno = lee.next();
      String materno = lee.next();

      Persona p = new Persona(ci, nombre, paterno, materno);
      adi(p);
    }
  }
  public void mostrar() {
    ColaSimplePersonas aux = new ColaSimplePersonas();
    Persona x;
    while (!esVacia()) {
      x = eli();
      System.out.println("----- Datos de Persona: -----");
      System.out.println("ci: " + x.getCi());
      System.out.println("nombre: " + x.getNombre());
      System.out.println("paterno: " + x.getPaterno());
      System.out.println("materno: " + x.getMaterno());
      aux.adi(x);
    }
    vaciar(aux);
  }
}
