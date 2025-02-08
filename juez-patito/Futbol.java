import java.util.Scanner;

public class Futbol {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    // { plyer1 = [x, y], player2 = [x,y] ... player11 = [x, y] }
    int[][] players = new int[n][2];

    for (int i = 0; i < n; i++) {
      int x = scanner.nextInt(), y = scanner.nextInt();
      players[i][0] = x;
      players[i][1] = y;
    }

    int q = scanner.nextInt();
    for (int i = 0; i < q; i++) {
      int A = scanner.nextInt(), B = scanner.nextInt();

      int[] playerA = players[A - 1];
      int[] playerB = players[B - 1];

      // if (playerA[0] == playerB[0]) {
      //   double r = (double)Math.abs(playerA[1] - playerB[1]);
      //   System.out.println(String.format("%.2f", r));
      // } else {
      int catA = Math.abs(playerA[1] - playerB[1]);
      int catB = Math.abs(playerA[0] - playerB[0]);
      double a = (double)Math.sqrt(Math.pow(catA, 2) + Math.pow(catB, 2));
      System.out.println(String.format("%.2f", a));
      // }
    }
  }
}
