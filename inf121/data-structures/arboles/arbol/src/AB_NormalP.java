import java.util.Scanner;

public class AB_NormalP extends ArbolBinarioP {

  public AB_NormalP() { super(); }

  public void crear(NodoP R) {
    Scanner lee = new Scanner(System.in);
    String res;
    if (R != null) {
      Persona x = new Persona();
      x.leer();
      R.setPer(x);
      System.out.println("tendra iz?  s/n");
      res = lee.next();
      if (res.equals("s")) {
        NodoP nuevo = new NodoP();
        R.setIzq(nuevo);
        crear(R.getIzq());
      }
      System.out.println("tendra der?  s/n");
      res = lee.next();
      if (res.equals("s")) {
        NodoP nuevo = new NodoP();
        R.setDer(nuevo);
        crear(R.getDer());
      }
    }
  }

  public void preOrden(NodoP R) {
    if (R != null) {
      R.getPer().mostrar();
      preOrden(R.getIzq());
      preOrden(R.getDer());
    }
  }
  public void postOrden(NodoP R) {
    if (R != null) {
      postOrden(R.getIzq());
      postOrden(R.getDer());
      R.getPer().mostrar();
    }
  }
  public void inOrden(NodoP R) {
    if (R != null) {
      inOrden(R.getIzq());
      R.getPer().mostrar();
      inOrden(R.getDer());
    }
  }
  public void hojas(NodoP R) {
    if (R != null) {
      if (R.getIzq() == null && R.getDer() == null) {
        R.getPer().mostrar();
      }
      hojas(R.getIzq());
      hojas(R.getDer());
    }
  }

  public int nroNodos() {
    int c = 0;
    ColaSimple nivel = new ColaSimple();
    ColaSimple des = new ColaSimple();
    nivel.adi(raiz);
    while (!nivel.esVacia()) {
      while (!nivel.esVacia()) {
        c++;
        NodoP x = nivel.eli();
        if (x.getIzq() != null) {
          des.adi(x.getIzq());
        }
        if (x.getDer() != null) {
          des.adi(x.getDer());
        }
      }
      nivel.vaciar(des);
    }
    return c;
  }
}
