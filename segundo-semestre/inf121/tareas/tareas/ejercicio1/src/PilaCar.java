import java.util.Scanner;

public class PilaCar extends VectorCar{
	private int tope;
	
	public PilaCar() {
		this.tope = -1;
	}
	public boolean esVacia() {
		if(this.tope == -1)
			return true;
		return false;
	}
	public boolean esLlena() {
		if(this.tope == this.max-1)
			return true;
		return false;
	}
	//modificar solo el tipo de parametro
	public void adi(char elem) {
		if(this.esLlena())
			System.out.println("Pila llena!!!");
		else {
			this.tope++;
			this.v[this.tope] = elem;
		}
	}
	//modificar el tipo de dato a retornar
	public char eli() {
		//Estudiante elem = new Estudiante();   //se crea un objeto estudiante que no tiene datos
		char elem = ' ';
		if(this.esVacia())
			System.out.println("Pila Vacia!!");
		else {
			elem = this.v[this.tope];
			this.tope--;
		}
		return elem;
	}
	//modificar: debemos de crear al objeto estudiante!!!
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			char car = lee.next().charAt(0);
			this.adi(car);
		}
	}
	//modificar: crear una var de tipo estudiante para luego mostrar datos!!
	public void mostrar() {
		PilaCar aux = new PilaCar();
		while(!esVacia()) {
			char elem = this.eli();
			System.out.println("elemento: " + elem);
			aux.adi(elem);
		}
		this.vaciar(aux);
	}
	public void vaciar(PilaCar aux) {
		while(!aux.esVacia()) {
			this.adi(aux.eli());
		}
	}
	public int nroElem() {
		return tope+1;
	}
}
