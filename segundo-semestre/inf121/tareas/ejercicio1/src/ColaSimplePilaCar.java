import java.util.Scanner;

//la clase colaSimpleEst es clase hij@ de la clase ColaEst
// es decir clase colaEst es clase padre de cla clase colaSimpleEst
// en java la herencia se define con "extends"

public class ColaSimplePilaCar extends ColaPilaCar{

	public ColaSimplePilaCar() {
		super();
	}
	public boolean esVacia() {
		if(fr == fi)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(fi == MAX-1)
			return true;
		return false;
	}
	public void adi(PilaCar elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public PilaCar eli() {
		PilaCar elem = new PilaCar();
		if(esVacia())
			System.out.println("Cola simple vacia!!");
		else {
			fr++;
			elem = v[fr];
		}
		return elem;
	}
	public int nroElem() {
		return (fi - fr);
	}
	public void vaciar(ColaSimplePilaCar z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			PilaCar x = new PilaCar();
			System.out.println("Intr. nro de elem pila");
			int nc = lee.nextInt();
			x.llenar(nc);
			adi(x);
		}
	}
	public void mostrar() {
		ColaSimplePilaCar aux = new ColaSimplePilaCar();
		PilaCar x;
		while(!esVacia()) {
			x = eli();
			System.out.println(" ---- datos de la pila ---");
			x.mostrar();
			aux.adi(x);
		}
		vaciar(aux);
	}
}