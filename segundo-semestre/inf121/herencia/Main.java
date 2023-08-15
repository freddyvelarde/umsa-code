public class Main {
  public static void main(String[] args) {
    // Freddy Erick Velarde Velarde
    // CI: 13827575 LP
    OficinaPublica op = new OficinaPublica("Tigo");
    Ministerio min = new Ministerio("Ministerio de educacion");

    System.out.println("-- Oficina publica --");
    op.mostrar();
    System.out.println("--- Ministerio -----");
    min.mostrar();
  }
}
