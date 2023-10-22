public class NodoPer {
  private Persona q;   // define el dato objeto persona
  private NodoPer sig; // definiendo el campo enlace sig

  public NodoPer() { // constructor
    sig = null;
  }

  public Persona getQ() { return q; }

  public void setQ(Persona q) { this.q = q; }

  public NodoPer getSig() { return sig; }

  public void setSig(NodoPer sig) { this.sig = sig; }
}
