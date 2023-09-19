
public class Principal {

  public static void main(String[] args) {

    MpPila w = new MpPila();
    w.llenar(4);
    w.mostrar();

    w.mostrar(2);

    System.out.println(w.nroElem(2));

    Estudiante x = w.eliminar(2);
    x.mostrar();

    System.out.println(x.getCarrera());

    Estudiante k = new Estudiante();
    k.leer();

    w.adiciona(2, k);
  }
}
