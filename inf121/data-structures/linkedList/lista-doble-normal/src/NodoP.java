
public class NodoP {
  private Proyecto proy;
  private NodoP ant;
  private NodoP sig;

  NodoP() {
    this.sig = null;
    this.ant = null;
  }

  public Proyecto getProy() { return proy; }

  public void setProy(Proyecto proy) { this.proy = proy; }

  public NodoP getAnt() { return ant; }

  public void setAnt(NodoP ant) { this.ant = ant; }

  public NodoP getSig() { return sig; }

  public void setSig(NodoP sig) { this.sig = sig; }
}
