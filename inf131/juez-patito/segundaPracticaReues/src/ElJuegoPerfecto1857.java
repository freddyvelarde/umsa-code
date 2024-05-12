import java.util.*;

class ElJuegoPerfecto1857 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int a[] = new int[n];
    int min_value = Integer.MAX_VALUE;
    int max_value = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      int x = scanner.nextInt();

      a[i] = x;
      if (x > max_value)
        max_value = x;

      if (x < min_value)
        min_value = x;
    }

    int m = scanner.nextInt();
    int b[] = new int[m];

    for (int i = 0; i < m; i++) {
      int x = scanner.nextInt();
      b[i] = x;
      if (x > max_value)
        max_value = x;

      if (x < min_value)
        min_value = x;
    }

    Arrays.sort(a);
    Arrays.sort(b);

    int a_min = a[0];
    int a_max = a[a.length - 1];
    int b_min = b[0];
    int b_max = b[b.length - 1];

    int distances[] = generateDistanceLiwst(min_value - 1, max_value);

    Long max = Long.MIN_VALUE;
    String res = "";

    /* int max_value_a = 0; */
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

        res = res_a + ":" + res_b;
      }
    }
    System.out.println(res);
  }

  static int calculationMiddle(int nums[], int x) {
    /* int indexMid = bs(nums, 0, nums.length - 1, x); */
    int indexMid = bs(nums, x);
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
  static int bs(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    int res = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] == target) {
        res = mid;
        start = mid + 1;
      } else if (arr[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return res;
  }
}
