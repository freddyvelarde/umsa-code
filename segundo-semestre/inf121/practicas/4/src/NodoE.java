public class NodoE {
  private String nom;
  private int nota;
  private NodoE sig;

  public NodoE() { sig = null; }
  public NodoE(String nom, int nota) {
    this.nom = nom;
    this.nota = nota;
    this.sig = null;
  }

  public String getNom() { return nom; }

  public void setNom(String nom) { this.nom = nom; }

  public int getNota() { return nota; }

  public void setNota(int nota) { this.nota = nota; }

  public NodoE getSig() { return sig; }

  public void setSig(NodoE sig) { this.sig = sig; }
}
