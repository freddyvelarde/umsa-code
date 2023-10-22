class Main {
  public static void main(String[] args) {

    LS_NormalPer people = new LS_NormalPer();

    Persona z1 = new Persona("mario", 15);
    Persona z2 = new Persona("luis", 22);
    Persona z3 = new Persona("alan", 20);
    Persona z4 = new Persona("lupe", 22);
    Persona z5 = new Persona("marce", 25);

    people.adiFinal(z1);
    people.adiFinal(z2);
    people.adiFinal(z3);
    people.adiFinal(z4);
    people.adiPrincipio(z5);

    System.out.println(people.nroNodos());
    // people.mostrar();
  }
}
