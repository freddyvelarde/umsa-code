
public class Estudiante {
	private String nom;
	private String carrera;
	private int edad;
	
	public Estudiante() {
	}
	
	public Estudiante(String nom, String carrera, int edad) {
		this.nom = nom;
		this.carrera = carrera;
		this.edad = edad;
	}
	
	public void mostrar(){
		System.out.println("Datos de Estudiante");
		System.out.println("nombre = " + this.nom);
		System.out.println("carrera = " + this.carrera);
		System.out.println("edad = " + this.edad);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}	
}
