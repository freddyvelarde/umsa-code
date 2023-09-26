
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PilaE A = new PilaE();
		A.llenar(6);
		A.mostrar();
		
		//B
		double promEst = promEstCarr(A, "info");
		System.out.println("\nPromedio = " + promEst);
		
		//C
		System.out.println("\n PILA AGRUPADA POR CARRERA");
		agruparCarrera(A);
		A.mostrar();
		
	}

	static void agruparCarrera(PilaE a) {
		PilaE aux = new PilaE();
		PilaE agrupado = new PilaE();
		while(!a.esVacia()){
			Estudiante est = a.eli();
			while(!a.esVacia()){
				Estudiante z = a.eli();
				if(est.getCarrera().equals(z.getCarrera())){
					agrupado.adi(z);
				}else{
					aux.adi(z);
				}
			}
			agrupado.adi(est);
			a.vaciar(aux);
		}
		a.vaciar(agrupado);	
	}

	static double promEstCarr(PilaE a, String carrerax) {
		System.out.println("datos: Marcelo Aruquipa");
		PilaE aux = new PilaE();
		int con = 0;
		int sum = 0;
		while(!a.esVacia()) //mientras la pila a NO es VACIA
		{
			Estudiante e = a.eli();
			aux.adi(e);
			if(e.getCarrera().equals(carrerax)){
				con ++;
				sum = sum + e.getEdad();
			}
		}
		a.vaciar(aux);
		
		return (double)sum/con;
	}

}
