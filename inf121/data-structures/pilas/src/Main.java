public class Main {
  public static void main(String[] args) {
    PilaEst pila = new PilaEst();
    pila.llenar(1);

    Estudiante e = new Estudiante("Camila", 21, "inf121");
    pila.adi(e);
    pila.mostrar();
  }
}
