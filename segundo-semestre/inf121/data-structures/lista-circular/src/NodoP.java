public class NodoP {
  private String nom;
  private int edad;
  private NodoP sig;

  public NodoP() { this.sig = null; }

  public String getNom() { return nom; }
  public void setNom(String nom) { this.nom = nom; }
  public int getEdad() { return edad; }
  public void setEdad(int edad) { this.edad = edad; }
  public void setSig(NodoP sig) { this.sig = sig; }
  public NodoP getSig() { return sig; }
}
