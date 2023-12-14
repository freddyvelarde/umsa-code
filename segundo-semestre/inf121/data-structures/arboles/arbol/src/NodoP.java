
public class NodoP {
  private Persona per;
  private NodoP izq;
  private NodoP der;

  public NodoP() {
    this.izq = null;
    this.der = null;
  }

  public Persona getPer() { return per; }

  public NodoP getIzq() { return izq; }

  public NodoP getDer() { return der; }

  public void setPer(Persona per) { this.per = per; }

  public void setIzq(NodoP izq) { this.izq = izq; }

  public void setDer(NodoP der) { this.der = der; }
}
