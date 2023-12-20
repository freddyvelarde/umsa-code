import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    LD_NormalProy L = new LD_NormalProy();
    // a)  CREAR UNA LISTA CON 6 PROYECTOS Y MOSTRAR
    L.adiFinal("Mensajeria", "Carlos", "Ana", 80);
    L.adiFinal("Red Social", "Juan", "Laura", 45);
    L.adiFinal("Pagina Web", "maria", "Pedrito", 78);
    L.adiFinal("Cajero", "Javier", "Sofia", 100);
    L.adiFinal("Calendario", "Carolina", "ricardo", 50);
    L.adiFinal("Applicacion", "manuel", "valeria", 67);
    // L.mostrar();

    // b)  ELIMINA PROYECTO DEONDE EXISTA PARTICIPANTE X:
    System.out.println(
        "///////////////////////////////////////////////////////");
    eliminar(L, "Juan");
    L.mostrar();
    // c)  MOSTRAR PARTICIPANTES DEL PROYECTO CON MAYOR CALIFICACION:
    // MuestraMayCalifProy(L);
    // d)  INSTANCIAR UN NUEVO PROYECTO DESPUES DEL PROYECTO X
    // NuevoProyDespues(L,"Calendario");
    // L.mostrar();
  }

  // b)
  public static void eliminar(LD_NormalProy L, String x) {
    NodoProy R = L.getP();
    NodoProy S = R.getAnt();
    while (R != null) {
      if (R.getParti1() == x || R.getParti2() == x) {
        if (S == null) {
          L.setP(R.getSig());
          R.setAnt(null);
          break;
        }
        if (R.getSig() == null) {
          S.setSig(null);
          break;
        }

        S.setSig(R.getSig());
        R.getSig().setAnt(S);
      }
      S = R;
      R = R.getSig();
    }
  }

  // c)
  public static void MuestraMayCalifProy(LD_NormalProy L) {
    NodoProy R = L.getP();
    int May = 0;
    String p1 = "";
    String p2 = "";
    while (R != null) {
      if (R.getCalificaion() > May) {
        May = R.getCalificaion();
        p1 = R.getParti1();
        p2 = R.getParti2();
        R = R.getSig();
      } else {
        R = R.getSig();
      }
    }
    System.out.println("Participantes del proyecto con mayor calificaion:\n" +
                       p1 + "\n" + p2);
  }

  // d)
  public static void NuevoProyDespues(LD_NormalProy L, String proy) {
    NodoProy R = L.getP();
    Scanner sc = new Scanner(System.in);

    while (R != null) {
      if (R.getTitulo() == proy) {
        NodoProy nuevo = new NodoProy();
        System.out.println("Ingrese titulo nuevo proyecto:");
        String t = sc.next();
        System.out.println("Ingrese participante 1:");
        String p1 = sc.next();
        System.out.println("Ingrese participante 2:");
        String p2 = sc.next();
        System.out.println("Ingrese calificacion:");
        int c = sc.nextInt();

        nuevo.setTitulo(t);
        nuevo.setParti1(p1);
        nuevo.setParti2(p2);
        nuevo.setCalificaion(c);

        NodoProy S = R.getSig();

        R.setSig(nuevo);
        nuevo.setAnt(R);
        nuevo.setSig(S);
        S.setAnt(nuevo);

        R = R.getSig();
      } else {
        R = R.getSig();
      }
    }
  }
}
