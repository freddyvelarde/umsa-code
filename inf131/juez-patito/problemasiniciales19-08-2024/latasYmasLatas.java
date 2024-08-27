import java.util.Scanner;

public class latasYmasLatas {

  static void oddNumbers(int n, int j) {

    // int n = 7, j = 7;

    int greaterIndex = n / 2 + 1;

    int indexNormalized = j;
    if (j > greaterIndex)
      indexNormalized = (n % j) + 1;

    int nums[] = new int[greaterIndex - 1];

    int indeNums = greaterIndex - 2;
    int t = 1;
    for (int i = 1; i < greaterIndex; i++) {
      nums[indeNums] = t;
      t = t + 2;
      indeNums--;
    }

    int res = n;
    for (int i = 0; i < indexNormalized - 1; i++) {
      res += nums[i];
    }
    int count = (n * (n + 1)) / 2;
    System.out.println(count - res);
  }
  static void evenNumbers(int n, int j) {

    int greaterIndex = n / 2;

    int indexNormalized = j;
    if (j > greaterIndex)
      indexNormalized = (n % j) + 1;

    int nums[] = new int[greaterIndex - 1];

    int indeNums = greaterIndex - 2;
    int t = 2;
    for (int i = 1; i < greaterIndex; i++) {
      nums[indeNums] = t;
      t = t + 2;
      indeNums--;
    }

    int res = n;
    for (int i = 0; i < indexNormalized - 1; i++) {
      res += nums[i];
    }

    int count = (n * (n + 1)) / 2;
    System.out.println(count - res);
  }

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int j = scan.nextInt();
    if (n % 2 == 0) {
      evenNumbers(n, j);
    } else {
      oddNumbers(n, j);
    }
  }
}
