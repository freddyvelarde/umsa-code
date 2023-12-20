public class NodoM {
  private String sigla;
  private LS_NormalE Le;
  private NodoM sig;

  public NodoM() { this.sig = null; }

  public NodoM(String sigla, LS_NormalE Le) {
    this.sigla = sigla;
    this.Le = Le;
    this.sig = null;
  }

  public String getSigla() { return this.sigla; }

  public void setSigla(String sigla) { this.sigla = sigla; }

  public LS_NormalE getLe() { return this.Le; }

  public void setLe(LS_NormalE Le) { this.Le = Le; }

  public NodoM getSig() { return this.sig; }

  public void setSig(NodoM sig) { this.sig = sig; }
}
