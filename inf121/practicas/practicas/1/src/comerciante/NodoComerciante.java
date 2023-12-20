package comerciante;

public class NodoComerciante {
  private Comerciante q;       // define el dato objeto persona
  private NodoComerciante sig; // definiendo el campo enlace sig

  public NodoComerciante() { // constructor
    sig = null;
  }

  public Comerciante getQ() { return q; }

  public void setQ(Comerciante q) { this.q = q; }

  public NodoComerciante getSig() { return sig; }

  public void setSig(NodoComerciante sig) { this.sig = sig; }
}
