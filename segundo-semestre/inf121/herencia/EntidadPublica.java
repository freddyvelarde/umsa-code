public class EntidadPublica extends LugarTrabajo {
  protected int nEmpleados;
  protected int nroTareas;
  protected String[][] em = new String[50][3];
  protected String[][] ta = new String[50][3];

  public EntidadPublica(String nom) {
    super(nom);
    this.nEmpleados = 2;
    this.nroTareas = 2;
    // empleados
    // datos del primer empleado
    this.em[0][0] = "Erick";
    this.em[0][1] = "13827575";
    this.em[0][2] = "Director";
    // datos del segundo empleado
    this.em[1][0] = "Ericka";
    this.em[1][1] = "13847275";
    this.em[1][2] = "asistente";

    // tareas
    // datos de la primera tarea
    this.ta[0][0] = "coordinacion";
    this.ta[0][1] = "100bs";
    this.ta[0][2] = "Erick";
    // datos de la segunda tarea
    this.ta[1][0] = "reunion";
    this.ta[1][1] = "50bs";
    this.ta[1][2] = "Ericka";
  }

  public void mostrar() {
    super.mostrar();
    System.out.println("nro emp: " + this.nEmpleados);
    for (int i = 0; i < this.nEmpleados; i++) {
      System.out.println(this.em[i][0] + "\t" + this.em[i][1] + "\t" +
                         this.em[i][2]);
    }

    System.out.println("nro ta: " + this.nroTareas);
    for (int i = 0; i < this.nroTareas; i++) {
      System.out.println(this.ta[i][0] + "\t" + this.ta[i][1] + "\t" +
                         this.ta[i][2]);
    }
  }
}
