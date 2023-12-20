class Main {
  public static void main(String[] args) {
    LS_NormalPer l = new LS_NormalPer();

    Persona z1 = new Persona("mario", 15);
    Persona z2 = new Persona("luis", 22);
    Persona z3 = new Persona("alan", 20);
    Persona z4 = new Persona("lupe", 22);
    Persona z5 = new Persona("marcelo", 25);
    Persona z6 = new Persona("wilson", 19);

    l.adiFinal(z1);
    l.adiFinal(z2);
    l.adiFinal(z3);
    l.adiFinal(z4);
    l.eliFinal();
    l.eliFinal();
    l.eliFinal();
    // l.eliFinal();

    l.mostrar();
    System.out.println(l.nroNodos());
  }
}
