public class LugarTrabajo {
  protected String nom;

  public LugarTrabajo(String nom) { this.nom = nom; }

  public void mostrar() { System.out.println("nom: " + this.nom); }

  public String getNom() { return this.nom; }
  public void setNom(String nom) { this.nom = nom; }
}
