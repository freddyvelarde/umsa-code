import Temperatura.*;
import Temperatura.Mp_PilaTemperatura;
import Temperatura.PilaTemperatura;
import Temperatura.Temperatura;
import Zona.*;
import Zona.Zona;
import java.util.HashMap;

public class Main {
  public static void main(String args[]) {
    Zona z1 = new Zona("horizontes1");
    Zona z2 = new Zona("miraflores");
    Zona z3 = new Zona("zona sur");
    Zona z4 = new Zona("santiago2");

    ColaSimpleZonas zonas = new ColaSimpleZonas();
    zonas.adi(z1);
    zonas.adi(z2);
    zonas.adi(z3);
    zonas.adi(z4);

    Temperatura t1 = new Temperatura("horizontes1", 21, 13, 300);
    Temperatura t2 = new Temperatura("santiago2", 22, 20, 120);
    Temperatura t3 = new Temperatura("horizontes1", 13, 13, 100);
    Temperatura t4 = new Temperatura("miraflores", 21, 13, 300);
    Temperatura t5 = new Temperatura("santiago2", 22, 20, 120);
    Temperatura t6 = new Temperatura("horizontes1", 13, 13, 100);
    Temperatura t7 = new Temperatura("santiago2", 22, 10, 110);
    Temperatura t8 = new Temperatura("miraflores", 30, 12, 500);
    Temperatura t9 = new Temperatura("zona sur", 12, 13, 260);
    Temperatura t10 = new Temperatura("horizontes1", 12, 20, 210);
    Temperatura t11 = new Temperatura("miraflores", 22, 10, 110);
    Temperatura t12 = new Temperatura("zona sur", 22, 11, 190);

    // marzo
    Temperatura ti2 = new Temperatura("zona sur", 01, -1, 100);
    Temperatura ti3 = new Temperatura("miraflores", 22, -2, 220);

    Mp_PilaTemperatura year = new Mp_PilaTemperatura();

    year.adicionar(0, t1);
    year.adicionar(1, t2);
    year.adicionar(2, t3);
    year.adicionar(2, ti2);
    year.adicionar(2, ti3);
    year.adicionar(3, t4);
    year.adicionar(4, t5);
    year.adicionar(5, t6);
    year.adicionar(6, t7);
    year.adicionar(7, t8);
    year.adicionar(8, t9);
    year.adicionar(9, t10);
    year.adicionar(10, t11);
    year.adicionar(11, t12);
    // a)
    /* mostrarFechaQueLluvioEnZona(year, "horizontes1"); */

    // c)
    /* mostrarZonaPrecipitadas(year); */

    // b)
    tempBajoCeroEnMarzo(year, zonas, "miraflores");
    year.mostrar();
    System.out.println("--");
    zonas.mostrar();
  }

  // b
  static void tempBajoCeroEnMarzo(Mp_PilaTemperatura tempHistorial,
                                  ColaSimpleZonas zonas, String zonaX) {

    PilaTemperatura tempAux = new PilaTemperatura();
    boolean removeZone = false;
    while (!tempHistorial.esVacia(2)) {
      Temperatura x = tempHistorial.eliminar(2);
      if (x.getTemperatura() < 0 && x.getNombreZona().equals(zonaX)) {
        removeZone = true;
      }
      tempAux.adi(x);
    }
    tempHistorial.vaciar(2, tempAux);
    if (removeZone) {
      while (!tempHistorial.esVacia(2)) {
        Temperatura x = tempHistorial.eliminar(2);
        if (x.getTemperatura() < 0) {
          removeZone = true;
        }
        tempAux.adi(x);
      }
      //
      ColaSimpleZonas zonasAux = new ColaSimpleZonas();
      while (!zonas.esVacia()) {
        Zona z = zonas.eli();
        if (!z.getNombreZona().equals(zonaX)) {
          zonasAux.adi(z);
        }
      }
      zonas.vaciar(zonasAux);
    }
  }

  // c
  static void mostrarZonaPrecipitadas(Mp_PilaTemperatura tempHistorial) {
    PilaTemperatura tempAux = new PilaTemperatura();
    int counter = -1;
    int notFound = 0;
    for (int i = 0; i < tempHistorial.getN(); i++) {
      Temperatura x = tempHistorial.eliminar(i);
      if (x.getPrecipitacion() > 250) {
        System.out.println("zona: " + x.getNombreZona());
        notFound++;
      }
      tempAux.adi(x);
      counter++;
    }
    if (notFound == 0) {
      System.out.println("No existen zonas precipitadas");
    }
    tempHistorial.vaciar(counter, tempAux);
  }

  // a
  static void mostrarFechaQueLluvioEnZona(Mp_PilaTemperatura tempHistorial,
                                          String zonaX) {
    PilaTemperatura tempAux = new PilaTemperatura();
    HashMap<Integer, String> year = new HashMap<>();
    year.put(0, "enero");
    year.put(1, "febrero");
    year.put(2, "marzo");
    year.put(3, "abril");
    year.put(4, "mayo");
    year.put(5, "junio");
    year.put(6, "julio");
    year.put(7, "agosto");
    year.put(8, "septiembre");
    year.put(9, "octubre");
    year.put(10, "noviembre");
    year.put(11, "diciembre");
    int counter = -1;
    int notFound = 0;
    for (int i = 0; i < tempHistorial.getN(); i++) {
      Temperatura x = tempHistorial.eliminar(i);
      if (x.getPrecipitacion() > 250 && x.getNombreZona() == zonaX) {
        System.out.println("zona: " + x.getNombreZona() +
                           " Mes: " + year.get(i) + ", dia: " + x.getDia());
        notFound++;
      }
      tempAux.adi(x);
      counter++;
    }
    if (notFound == 0) {
      System.out.println("No existen dias precipitados en la zona: " + zonaX);
    }
    tempHistorial.vaciar(counter, tempAux);
  }
}
