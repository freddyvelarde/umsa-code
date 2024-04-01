import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      int k = scanner.nextInt();

      String[][] mtx = new String[n][m];

      for (int i = 0; i < n; i++) {
        String s = scanner.next();

        for (int j = 0; j < m; j++) {
          char c = s.charAt(j);
          mtx[i][j] = String.valueOf(c);
        }
      }

      if (solution(mtx, 0, 0, k)) {
        System.out.println("Intentalo Bob");
      } else {
        System.out.println("Descansa Bob");
      }
    }
  }
  static boolean solution(String[][] mtx, int row, int col, int k) {
    String bob = mtx[row][col];

    if (k < 0) {
      return false;
    }

    if (bob.equals("C")) {
      return true;
    }

    if (bob.equals(".")) {

      if (row < mtx.length - 1 && solution(mtx, row + 1, col, k - 1)) {
        return solution(mtx, row + 1, col, k - 1);
      }
      if (col < mtx[0].length - 1 && solution(mtx, row, col + 1, k - 1))
        return solution(mtx, row, col + 1, k - 1);
    }
    return false;
  }
}
