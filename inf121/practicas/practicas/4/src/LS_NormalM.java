import java.util.Scanner;

public class LS_NormalM extends ListaSimpleM {

  public LS_NormalM() { super(); }

  public boolean esVacia() {
    if (P == null)
      return true;
    return false;
  }

  public void adiPrimero(String sigla, LS_NormalE le) {
    NodoM nuevo = new NodoM(sigla, le);
    P = nuevo;
  }

  public void adiFinal(String sigla, LS_NormalE le) {
    NodoM nuevo = new NodoM(sigla, le);
    if (esVacia())
      P = nuevo;
    else {
      NodoM R = P;
      while (R.getSig() != null) {
        R = R.getSig();
      }
      R.setSig(nuevo);
    }
  }

  /* public void adiFinal(Persona z) { */
  /*   NodoM nuevo = new NodoM(); */
  /*   nuevo.setQ(z); */
  /*  */
  /*   if (esVacia()) */
  /*     P = nuevo; // p apunta a nuevo */
  /*   else { */
  /*     NodoM R = P; */
  /*     while (R.getSig() != null) { */
  /*       R = R.getSig(); */
  /*     } */
  /*     R.setSig(nuevo); */
  /*   } */
  /* } */
  //

  public void mostrar() {
    NodoM R = P; // R apunta  a la raiz P
    while (R != null) {
      System.out.println("###################");
      System.out.println("Sigla: " + R.getSigla());
      R.getLe().mostrar();
      /* R.getQ().mostrar(); */
      R = R.getSig();
    }
  }

  public int nroNodos() {
    NodoM R = P;
    int c = 0;
    if (this.esVacia())
      return 0;
    else {
      while (R != null) {
        c++;
        R = R.getSig();
      }
    }
    return c;
  }

  public NodoM eliPrincipio() {
    NodoM x = new NodoM();
    if (!esVacia()) {
      x = P; // x apunta a la raiz P
      P = P.getSig();
      x.setSig(null);
    }
    return x;
  }

  public NodoM eliFinal() {
    NodoM x = new NodoM();
    if (!esVacia()) {
      if (nroNodos() == 1) {
        x = P; // x apunta a la raiz P
        P = null;
      } else {
        NodoM R = P;
        NodoM S = P;
        while (R.getSig() != null) {
          S = R;          // S apunta a R
          R = R.getSig(); // R apunta al siguiente de R
        }
        x = R;
        S.setSig(null);
      }
    }
    return x;
  }

  public void leer1(int n) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i <= n; i++) {
      System.out.println("Insert: sigla.");
      String sigla = scanner.next();
      System.out.println("Insert nro de estudiantes");
      int nroE = scanner.nextInt();
      LS_NormalE e = new LS_NormalE();
      e.leer1(nroE);

      adiPrimero(sigla, e);
    }
  }

  public void leer2(int n) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i <= n; i++) {
      System.out.println("Insert: sigla.");
      String sigla = scanner.next();
      System.out.println("Insert nro de estudiantes");
      int nro = scanner.nextInt();
      LS_NormalE e = new LS_NormalE();
      e.leer2(nro);

      adiFinal(sigla, e);
    }
  }
}

/* import java.util.Scanner; */
/*  */
/* public class LS_NormalM extends ListaDobleM { */
/*   public LS_NormalM() { super(); } */
/*   boolean esVacia() { */
/*     if (this.P == null) */
/*       return true; */
/*     return false; */
/*   } */
/*   int nroNodos() { */
/*     int c = 0; */
/*     NodoM R = this.P; */
/*     while (R != null) { */
/*       c++; */
/*       R = R.getSig(); */
/*     } */
/*     return c; */
/*   } */
/*   void adiPrimero(String sigla, LS_NormalE le) { */
/*     NodoM nuevo = new NodoM(); */
/*     nuevo.setSigla(sigla); */
/*     nuevo.setLe(le); */
/*  */
/*     if (esVacia()) */
/*       P = nuevo; */
/*     else { */
/*       nuevo.setSig(P); */
/*       P = nuevo; */
/*     } */
/*   } */
/*   void mostrar() { */
/*     NodoM R = P; */
/*     while (R != null) { */
/*       // R.getProy().mostrar(); */
/*       System.out.println("\nsigla materia: " + R.getSigla()); */
/*       System.out.println("Lista de estudiantes de la materia: "); */
/*       R.getLe().mostrar(); */
/*       R = R.getSig(); */
/*     } */
/*   } */
/*   NodoM eliPrimero() { */
/*     NodoM x = new NodoM(); */
/*     if (!esVacia()) { */
/*       if (nroNodos() == 1) { */
/*         x = P; */
/*         P = null; */
/*       } else { */
/*         x = P; */
/*         P = P.getSig(); */
/*         x.setSig(null); */
/*       } */
/*     } */
/*     return x; */
/*   } */
/*  */
/*   void adiFinal(String sigla, LS_NormalE le) { */
/*     NodoM nuevo = new NodoM(); */
/*     nuevo.setSigla(sigla); */
/*     nuevo.setLe(le); */
/*     if (esVacia()) */
/*       P = nuevo; */
/*     else { */
/*       NodoM R = P; */
/*       while (R.getSig() != null) { */
/*         R = R.getSig(); */
/*       } */
/*       R.setSig(nuevo); */
/*     } */
/*   } */
/*   NodoM eliFinal() { */
/*     NodoM nuevo = new NodoM(); */
/*     if (!esVacia()) { */
/*       if (nroNodos() == 1) { */
/*         nuevo = P; */
/*         P = null; */
/*       } else { */
/*         NodoM R = P; */
/*         while (R.getSig() != null) { */
/*           R = R.getSig(); */
/*         } */
/*         nuevo = R; */
/*         NodoM aux = R.getAnt(); */
/*         aux.setSig(null); */
/*         nuevo.setAnt(null); */
/*       } */
/*     } */
/*     return nuevo; */
/*   } */
/*  */
/*   void leer1(int n) { */
/*     Scanner lee = new Scanner(System.in); */
/*     String sigla; */
/*     for (int i = 1; i <= n; i++) { */
/*  */
/*       System.out.println("Intr. Sigla"); */
/*       sigla = lee.next(); */
/*  */
/*       LS_NormalE le = new LS_NormalE(); */
/*       System.out.println("nro estudiantes: "); */
/*       int ne = lee.nextInt(); */
/*       le.leer2(ne); */
/*  */
/*       adiPrimero(sigla, le); */
/*     } */
/*   } */
/*   void leer2(int n) { */
/*     Scanner lee = new Scanner(System.in); */
/*     String sigla; */
/*     for (int i = 1; i <= n; i++) { */
/*  */
/*       System.out.println("Intr. Sigla"); */
/*       sigla = lee.next(); */
/*  */
/*       LS_NormalE le = new LS_NormalE(); */
/*       System.out.println("nro estudiantes: "); */
/*       int ne = lee.nextInt(); */
/*       le.leer2(ne); */
/*  */
/*       adiFinal(sigla, le); */
/*     } */
/*   } */
/* } */
