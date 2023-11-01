public class Principal {
  public static void main(String[] args) {
    LS_CircularP a = new LS_CircularP();
    // a.llenar(5);
    a.adiFinal("erick", 21);
    a.adiFinal("freddy", 22);
    a.adiFinal("alejandro", 20);
    a.adiFinal("pedro", 20);
    a.adiFinal("Camila", 20);
    /* a.mostrar(); */

    NodoP z = a.eliPrincipio();
    /* System.out.println("first element: " + z.getNom() + " " + z.getEdad());
     */
    /*  */
    a.adiFinal("Marcelo", 25);
    a.mostrar();
  }
}
