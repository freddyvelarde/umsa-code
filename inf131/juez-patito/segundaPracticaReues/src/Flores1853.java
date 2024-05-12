import java.util.Scanner;

class Flores1853 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(), m = sc.nextInt(), w = sc.nextInt();
    int nums[] = new int[n];

    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    solution(nums, m, w);
  }

  static void solution(int nums[], int m, int w) {
    for (int j = 0; j < m; j++) {
      int i = findLower(nums);
      addOneToArr(nums, w, i);
    }

    int lowInd = findLower(nums);
    System.out.println(nums[lowInd]);
  }

  static void addOneToArr(int nums[], int w, int lowerInd) {

    int len = nums.length;
    int start = lowerInd;

    if (len - (lowerInd + 1) < w) {
      start = len - w;
    }

    for (int i = start; i < start + w; i++) {
      nums[i]++;
    }
  }

  static int findLower(int nums[]) {

    int min = Integer.MAX_VALUE;

    int ind = 0;

    for (int i = 0; i < nums.length; i++) {
      int n = nums[i];
      if (n < min) {
        min = n;
        ind = i;
      }
    }
    return ind;
  }
}
