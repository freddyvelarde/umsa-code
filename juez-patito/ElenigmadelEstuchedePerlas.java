import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int mtx[][] = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        mtx[i][j] = sc.nextInt();
      }
    }

    sol(mtx);
  }

  public static void sol(int mtx[][]) {
    int c = 0;

    while (!verify(mtx) && c < 4) {
      rotateLeft(mtx);
      c++;
    }

    if (verify(mtx)) {
      System.out.println(c);
      return;
    }

    c = 0;
    while (!verify(mtx) && c < 4) {
      rotateRight(mtx);
      c++;
    }

    System.out.println(c);
  }

  public static void rotateLeft(int mtx[][]) {
    int n = mtx.length;
    int[][] newMtx = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        newMtx[n - j - 1][i] = mtx[i][j];
      }
    }

    copyMatrix(mtx, newMtx);
  }

  public static void rotateRight(int mtx[][]) {
    int n = mtx.length;
    int[][] newMtx = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        newMtx[j][n - i - 1] = mtx[i][j];
      }
    }

    copyMatrix(mtx, newMtx);
  }

  public static void copyMatrix(int[][] dest, int[][] src) {
    for (int i = 0; i < dest.length; i++) {
      for (int j = 0; j < dest[i].length; j++) {
        dest[i][j] = src[i][j];
      }
    }
  }

  public static boolean verify(int mtx[][]) {
    int n = mtx.length;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - 1; j++) {
        if (mtx[i][j] > mtx[i][j + 1]) {
          return false;
        }
      }
    }

    for (int j = 0; j < n; j++) {
      for (int i = 0; i < n - 1; i++) {
        if (mtx[i][j] > mtx[i + 1][j]) {
          return false;
        }
      }
    }

    return true;
  }
}
