
public class NodoP {
  private Proyecto P;
  private NodoP ant;
  private NodoP sig;

  NodoP() {
    this.sig = null;
    this.ant = null;
  }

  public Proyecto getProy() { return P; }

  public void setProy(Proyecto P) { this.P = P; }

  public NodoP getAnt() { return ant; }

  public void setAnt(NodoP ant) { this.ant = ant; }

  public NodoP getSig() { return sig; }

  public void setSig(NodoP sig) { this.sig = sig; }
}
