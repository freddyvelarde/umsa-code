public class Nodo {
  private int q;
  private Nodo sig;

  public Nodo() { sig = null; }

  public int getQ() { return q; }

  public void setQ(int q) { this.q = q; }

  public Nodo getSig() { return sig; }

  public void setSig(Nodo sig) { this.sig = sig; }
}
