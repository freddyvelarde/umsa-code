package mercado;

public class NodoMercado {
  private Mercado q;       // define el dato objeto persona
  private NodoMercado sig; // definiendo el campo enlace sig

  public NodoMercado() { // constructor
    sig = null;
  }

  public Mercado getQ() { return q; }

  public void setQ(Mercado q) { this.q = q; }

  public NodoMercado getSig() { return sig; }

  public void setSig(NodoMercado sig) { this.sig = sig; }
}
