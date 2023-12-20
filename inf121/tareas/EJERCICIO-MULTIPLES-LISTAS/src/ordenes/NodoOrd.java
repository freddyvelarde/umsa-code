package ordenes;
import pedidos.LS_NormalCbPed;

public class NodoOrd {
  private String nomComensal;
  private LS_NormalCbPed lped;
  private NodoOrd sig;

  public NodoOrd() { this.sig = null; }
  public NodoOrd(String nomComensal, LS_NormalCbPed lped) {
    this.nomComensal = nomComensal;
    this.lped = lped;
  }

  public String getNomComensal() { return this.nomComensal; }

  public void setNomComensal(String nomComensal) {
    this.nomComensal = nomComensal;
  }

  public LS_NormalCbPed getLped() { return this.lped; }

  public void setLped(LS_NormalCbPed lped) { this.lped = lped; }

  public NodoOrd getSig() { return this.sig; }

  public void setSig(NodoOrd sig) { this.sig = sig; }

  public void mostrar() {
    System.out.println("---------");
    System.out.println("nom comensal: " + nomComensal);
    lped.mostrar();
  }
}
