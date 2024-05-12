import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] tiempos = new int[n];

    for (int i = 0; i < n; i++) {
      tiempos[i] = scanner.nextInt();
    }

    int consultas = scanner.nextInt();

    for (int i = 0; i < consultas; i++) {
      int k = scanner.nextInt();
      int minTiempo = calcularMinTiempo(tiempos, k);
      System.out.println("Tiempo minimo para " + k +
                         " trabajos es: " + minTiempo);
    }

    scanner.close();
  }

  public static int calcularMinTiempo(int[] tiempos, int k) {
    int minTiempo = Integer.MAX_VALUE;

    for (int i = 0; i < tiempos.length; i++) {
      int trabajos = k / tiempos[i];
      int tiempoTotal = tiempos[i] * (trabajos + 1);
      minTiempo = Math.min(minTiempo, tiempoTotal);
    }

    return minTiempo;
  }
}
