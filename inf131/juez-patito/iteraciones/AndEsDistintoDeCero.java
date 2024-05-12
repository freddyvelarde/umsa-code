import java.util.Scanner;

public class AndEsDistintoDeCero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    for (int a = 0; a < t; a++) {
      int i = scanner.nextInt();
      int j = scanner.nextInt();
      int stringSize = Integer.toBinaryString(j).length();
      int[][] mtx = new int[j - i + 1][stringSize];
      int currenCol = 0;
      for (int x = i; x <= j; x++) {
        String numToBinary = Integer.toBinaryString(x);
        insertIntoMatrix(mtx, currenCol, numToBinary);
        currenCol++;
      }
      calculate(mtx);
    }
  }
  static void insertIntoMatrix(int[][] mtx, int indexRow, String row) {
    int col = 0;
    for (int i = row.length() - 1; i >= 0; i--) {

      mtx[indexRow][col] = Integer.parseInt(String.valueOf(row.charAt(i)));
      col++;
    }
  }
  static void calculate(int[][] mtx) {
    int colSize = mtx.length;
    int rowSize = mtx[0].length;

    int[] ans = new int[rowSize];

    for (int i = 0; i < rowSize; i++) {
      int sum = 0;
      for (int j = 0; j < colSize; j++) {
        int n = mtx[j][i];
        sum += n;
      }
      /* if (colSize - sum == rowSize) { */
      /*   System.out.println(colSize - sum); */
      /*   return; */
      /* } */
      ans[i] = sum;
    }

    int max = 0;
    for (int i : ans) {
      System.out.print(i + " ");
      if (i > max) {
        max = i;
      }
    }
    System.out.println();
    System.out.println("max: " + max);
    System.out.println("length: " + colSize);

    System.out.println(colSize - max);
  }
}
