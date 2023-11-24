import ordenes.LS_NormalOrd;
import ventas.LS_NormalVenta;

class Main {
  public static void main(String[] arg) {
    LS_NormalVenta l = new LS_NormalVenta();
    l.leer2(2);
    System.out.println("output:");
    l.mostrar();
  }
}
