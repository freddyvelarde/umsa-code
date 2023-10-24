import Distrito.*;
import Distrito.PilaDistritos;
import Zona.PilaZonas;
import Zona.Zona;

public class Main {
  public static void main(String args[]) {
    // zonas
    Zona zona1 = new Zona(1, "nuevos horizontes", 1000);
    Zona zona2 = new Zona(2, "miraflores", 10);
    Zona zona3 = new Zona(2, "zona sur", 1005);
    Zona zona4 = new Zona(2, "Santiago2", 1003);

    PilaZonas zonas = new PilaZonas();
    zonas.adi(zona1);
    zonas.adi(zona2);
    zonas.adi(zona3);
    zonas.adi(zona4);

    // distritos
    Distrito dis1 = new Distrito(1, "ubicacion1");
    Distrito dis2 = new Distrito(2, "ubicacion2");

    PilaDistritos distritos = new PilaDistritos();
    distritos.adi(dis1);
    distritos.adi(dis2);
    /* distritos.mostrar(); */

    // a
    /* distritosConMayorZonas(distritos, zonas); */

    // b
    distritosConMayorSuperficie(distritos, zonas);
  }

  static void distritosConMayorSuperficie(PilaDistritos distritos,
                                          PilaZonas zonas) {
    PilaDistritos distritosAux = new PilaDistritos();
    int max = 0;
    while (!distritos.esVacia()) {
      Distrito x = distritos.eli();

      PilaZonas zonasAux = new PilaZonas();

      while (!zonas.esVacia()) {
        Zona z = zonas.eli();

        if (z.getSuperficie() >= max)
          max = z.getSuperficie();

        zonasAux.adi(z);
      }

      zonas.vaciar(zonasAux);
      distritosAux.adi(x);
    }

    distritos.vaciar(distritosAux);

    PilaZonas zonasAux = new PilaZonas();
    while (!zonas.esVacia()) {
      Zona z = zonas.eli();

      if (z.getSuperficie() == max) {
        System.out.println("nombre: " + z.getNombre());
      }

      zonasAux.adi(z);
    }
    zonas.vaciar(zonasAux);

    distritos.vaciar(distritosAux);
  }

  static void distritosConMayorZonas(PilaDistritos distritos, PilaZonas zonas) {
    PilaDistritos distritosAux = new PilaDistritos();
    int max = 0;
    while (!distritos.esVacia()) {
      Distrito x = distritos.eli();

      PilaZonas zonasAux = new PilaZonas();

      int counter = 0;
      while (!zonas.esVacia()) {
        Zona z = zonas.eli();

        if (x.getNroDistrito() == z.getNroDistrito())
          counter++;

        zonasAux.adi(z);
      }
      if (counter > max) {
        max = counter;
      }

      counter = 0;

      zonas.vaciar(zonasAux);
      distritosAux.adi(x);
    }

    distritos.vaciar(distritosAux);

    while (!distritos.esVacia()) {
      Distrito x = distritos.eli();

      PilaZonas zonasAux = new PilaZonas();
      int c = 0;
      while (!zonas.esVacia()) {
        Zona z = zonas.eli();

        if (x.getNroDistrito() == z.getNroDistrito()) {
          c++;
        }

        zonasAux.adi(z);
      }
      zonas.vaciar(zonasAux);
      if (c == max) {
        System.out.println("nroDistrito: " + x.getNroDistrito());
        /* System.out.println("ubicacion: " + x.getUbicacion()); */
      }

      distritosAux.adi(x);
    }

    distritos.vaciar(distritosAux);
  }
}
