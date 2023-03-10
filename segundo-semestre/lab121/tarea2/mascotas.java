import java.util.Scanner;

class Mascota {
  private String tipo;
  private String nombre;
  private String raza;
  private String color;
  private int edad;

  public Mascota(String tipo, String nombre, String raza, String color,
                 int edad) {
    this.tipo = tipo;
    this.nombre = nombre;
    this.raza = raza;
    this.color = color;
    this.edad = edad;
  }

  public void leer() {
    Scanner reader = new Scanner(System.in);
    System.out.println("tipo: ");
    this.tipo = reader.nextLine();

    System.out.println("nombre: ");
    this.nombre = reader.nextLine();

    System.out.println("raza: ");
    this.raza = reader.nextLine();

    System.out.println("color: ");
    this.color = reader.nextLine();

    System.out.println("edad: ");
    this.edad = reader.nextInt();
  }

  public void mostrar() {
    System.out.println("tipo: ");
    System.out.println(this.tipo);
    System.out.println("nombre: ");
    System.out.println(this.nombre);
    System.out.println("raza: ");
    System.out.println(this.raza);
    System.out.println("color: ");
    System.out.println(this.color);
    System.out.println("edad: ");
    System.out.println(this.edad);
  }

  public String getTipo() { return this.tipo; }

  public String getNombre() { return this.nombre; }

  public boolean esPerroPastorAleman() {
    return this.tipo.equals("perro") && this.raza.equals("pastor aleman");
  }
}

class Main {
  public static void main(String[] args) {
    Mascota m1 = new Mascota("gato", "rafael", "angora", "negro", 3);
    Mascota m2 = new Mascota("perro", "fred", "pitbull", "gris", 4);
    Mascota m3 = new Mascota("pato", "rafael", "montes", "blanco", 3);
    Mascota m4 = new Mascota("perro", "wolf", "pastor aleman", "negro", 1);

    // Buscar el objeto con raza "pastor aleman"
    for (Mascota m : new Mascota[] {m1, m2, m3, m4}) {
      if (m.esPerroPastorAleman()) {
        System.out.println("Se ha encontrado un perro de raza pastor aleman.");
        break;
      }
    }

    // Contar el número de mascotas de tipo "gato"
    int count = 0;
    for (Mascota m : new Mascota[] {m1, m2, m3, m4}) {
      if (m.getTipo().equals("gato")) {
        count++;
      }
    }

    System.out.println("Hay " + count + " mascotas de tipo gato.");

    // Verificar si hay dos mascotas con el mismo nombre
    Mascota[] mascotas = new Mascota[] {m1, m2, m3, m4};
    for (int i = 0; i < mascotas.length; i++) {
      for (int j = i + 1; j < mascotas.length; j++) {
        if (mascotas[i].getNombre().equals(mascotas[j].getNombre())) {
          System.out.println("Las mascotas " + mascotas[i].getNombre() +
                             " son de tipo " + mascotas[i].getTipo() + " y " +
                             mascotas[j].getTipo() + ".");
        }
      }
    }
  }
}
