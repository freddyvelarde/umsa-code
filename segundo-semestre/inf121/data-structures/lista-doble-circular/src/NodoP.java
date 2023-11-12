public class NodoP {
  private String nom;
  private int edad;
  private NodoP sig;
  private NodoP ant;

  public NodoP() {
    this.sig = null;
    this.ant = null;
  }
  public String getNom() { return nom; }

  public void setNom(String nom) { this.nom = nom; }

  public int getEdad() { return edad; }

  public void setEdad(int edad) { this.edad = edad; }

  public NodoP getSig() { return sig; }

  public void setSig(NodoP sig) { this.sig = sig; }

  public NodoP getAnt() { return ant; }

  public void setAnt(NodoP ant) { this.ant = ant; }
  public void mostrar() {
    System.out.println("nombre: " + nom + ", edad: " + edad);
  }
}
