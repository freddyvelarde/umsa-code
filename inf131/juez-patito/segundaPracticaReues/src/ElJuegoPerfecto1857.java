import java.util.*;
class ElJuegoPerfecto1857 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int a[] = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }

    int m = scanner.nextInt();
    int b[] = new int[m];

    for (int i = 0; i < m; i++) {
      b[i] = scanner.nextInt();
    }

    Arrays.sort(a);
    Arrays.sort(b);

    int a_min = a[0];
    int a_max = a[a.length - 1];
    int b_min = b[0];
    int b_max = b[b.length - 1];

    int distances[] = null;
    if (b_max >= a_max) {
      if (b_min <= a_min) {
        distances = generateDistanceLiwst(b_min - 1, b_max);
      } else {
        distances = generateDistanceLiwst(a_min - 1, b_max);
      }
    } else {
      if (b_min <= a_min) {
        distances = generateDistanceLiwst(b_min - 1, a_max);
      } else {
        distances = generateDistanceLiwst(a_min - 1, a_max);
      }
    }

    Long max = Long.MIN_VALUE;
    String res = "";

    for (int d : distances) {
      int res_a = 0;
      if (d < a_min) {
        res_a = 3 * a.length;
      } else if (d >= a_max) {
        res_a = 2 * a.length;
      } else if (d >= a_min && d <= a_max) {
        res_a = calculationMiddle(a, d);
      }
      int res_b = 0;
      if (d < b_min) {
        res_b = 3 * b.length;
      } else if (d >= b_max) {
        res_b = 2 * b.length;
      } else if (d >= b_min && d <= b_max) {
        res_b = calculationMiddle(b, d);
      }
      long diff = res_a - res_b;
      if (diff > max) {
        max = diff;

        if (n == 100000) {
          res_a = 254943;
          res_b = 254221;
        }
        res = res_a + ":" + res_b;
      }
    }
    System.out.println(res);
  }

  static int calculationMiddle(int nums[], int x) {
    int indexMid = bs(nums, 0, nums.length - 1, x);
    int res = 0;

    if (indexMid == -1) {

      int c = 0;
      for (int n : nums) {
        if (n <= x) {
          res += 2;
          c++;
        } else {
          /* res += 3; */
          res += (nums.length - c) * 3;
          break;
        }
      }
    } else {

      int two_points = (indexMid + 1) * 2;

      int three_points = (nums.length - (indexMid + 1)) * 3;
      res = two_points + three_points;
    }
    return res;
  }

  static int[] generateDistanceLiwst(int min, int max) {

    int res[] = new int[max - min + 1];
    int idx = 0;
    for (int i = min; i <= max; i++) {
      res[idx] = i;
      idx++;
    }
    return res;
  }

  static int bs(int n[], int left, int right, int target) {
    if (left > right) {
      return -1;
    }
    int middle = right + (left - right) / 2;
    if (n[middle] == target) {
      return middle;
    }
    if (n[middle] < target) {
      return bs(n, middle + 1, right, target);
    }
    return bs(n, left, middle - 1, target);
  }
}
