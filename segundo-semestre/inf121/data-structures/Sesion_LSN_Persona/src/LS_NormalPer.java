
public class LS_NormalPer extends ListaSimplePer{

	public LS_NormalPer() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Persona z) {
		NodoPer nuevo = new NodoPer();
		nuevo.setQ(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Persona z) {
		NodoPer nuevo = new NodoPer();
		nuevo.setQ(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoPer R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoPer R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getQ().mostrar();
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoPer R = P;
		int c = 0;
		if(this.esVacia())
			return 0;
		else {
			while(R != null) {
				c++;
				R = R.getSig();
			}
		}
		return c;
	}
}
