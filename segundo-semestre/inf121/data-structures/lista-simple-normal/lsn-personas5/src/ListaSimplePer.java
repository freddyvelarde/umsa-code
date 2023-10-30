
public class ListaSimplePer {
	protected NodoPer P;  //raiz de la lista
	
	public ListaSimplePer() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoPer getP() {
		return P;
	}

	public void setP(NodoPer p) {
		P = p;
	}
	
}
