import java.util.*;

public class AndEsDistintoDeCero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[][] mtx = new int[200001][18];
    Map<Integer, int[]> cache = new HashMap<>();
    /* cache.put(1, new int[] {7, 3, 4, 4, 1}); */
    /* cache.put(1, new int[] {20, 10, 10, 10, 8, 6}); */
    generate(1, 200000, mtx);
    int t = scanner.nextInt();

    for (int a = 0; a < t; a++) {
      int i = scanner.nextInt();
      int j = scanner.nextInt();

      System.out.println(calculate(mtx, i, j, cache));
    }

    System.out.println(" safsdfdsaf ");
    System.out.println(cache.size());
  }

  /* public static void main(String[] args) { */
  /*   int[][] mtx = new int[200001][18]; */
  /*   Map<Integer, int[]> cache = new HashMap<>(); */
  /*   generate(1, 200000, mtx); */
  /*   System.out.println(calculate(mtx, 104032, 184908, cache)); */
  /*   System.out.println(calculate(mtx, 1, 200000, cache)); */
  /* } */

  static int calculate(int[][] mtx, int a, int b, Map<Integer, int[]> cache) {
    int len = Integer.toBinaryString(b).length();

    int[] ans = new int[len];

    for (int i = 0; i < len; i++) {
      int sum = 0;

      for (int j = a - 1; j <= b - 1; j++) {
        if (cache.containsKey(j) && b >= cache.get(j)[0]) {
          if (i + 1 < cache.get(j).length) {
            sum += cache.get(j)[i + 1];
            j = cache.get(j)[0] - 1;
          }
          continue;
        } else {
          int n = mtx[j][i];
          sum += n;
        }
      }
      ans[i] = sum;
    }

    int max = 0;
    for (int n : ans) {
      /* System.out.print(n + " "); */
      if (n > max)
        max = n;
    }
    /* System.out.println(); // 5 6 4 4 */
    //

    if (cache.containsKey(a - 1) && cache.get(a - 1)[0] != b) {
      int[] sums = new int[ans.length + 1];

      sums[0] = b - 1;
      for (int i = 1; i < sums.length; i++) {
        sums[i] = ans[i - 1];
      }
      cache.put(a - 1, sums);
    }

    return (b - a) - max + 1;
  }

  static void generate(int i, int j, int[][] mtx) {
    int stringSize = Integer.toBinaryString(j).length();

    int currenCol = 0;

    int r = i;
    for (int x = i; x <= j; x++) {
      String numToBinary = Integer.toBinaryString(x);
      insertIntoMatrix(mtx, currenCol, numToBinary);
      currenCol++;

      if (x + 1 <= j) {
        int nextBit = x + 1;
        r = (r & nextBit);
      }
    }
    /* calculate(mtx); */
  }

  //   static void solution(int i, int j) {
  //       int stringSize = Integer.toBinaryString(j).length();

  //       int[][] mtx = new int[j - i + 1][stringSize];

  //       int currenCol = 0;

  //       for (int x = i; x <= j; x++) {
  //         String numToBinary = Integer.toBinaryString(x);
  //         insertIntoMatrix(mtx, currenCol, numToBinary);
  //         currenCol++;
  //       }

  //       calculate(mtx);
  //   }

  static void insertIntoMatrix(int[][] mtx, int indexRow, String row) {
    int col = 0;
    for (int i = row.length() - 1; i >= 0; i--) {

      mtx[indexRow][col] = Integer.parseInt(String.valueOf(row.charAt(i)));
      col++;
    }
  }

  /* static void calculate(int[][] mtx) { */
  /*   int colsize = mtx.length; */
  /*   int rowsize = mtx[0].length; */
  /*  */
  /*   int[] ans = new int[rowsize]; */
  /*  */
  /*   for (int i = 0; i < rowsize; i++) { */
  /*     int sum = 0; */
  /*     for (int j = 0; j < colsize; j++) { */
  /*       int n = mtx[j][i]; */
  /*       sum += n; */
  /*     } */
  /*     if (colsize - sum == 0) { */
  /*       system.out.println(0); */
  /*       return; */
  /*     } */
  /*     ans[i] = sum; */
  /*   } */
  /*  */
  /*   int max = 0; */
  /*   for (int i : ans) { */
  /*     if (i > max) { */
  /*       max = i; */
  /*     } */
  /*   } */
  /*  */
  /*   System.out.println(colSize - max); */
  /* } */
}
