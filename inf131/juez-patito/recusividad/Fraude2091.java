import java.util.*;

public class Fraude2091 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    for (int i = 0; i < t; i++) {
      int n = scanner.nextInt();
      int[] nums = new int[n];
      for (int j = 0; j < n; j++) {
        int x = scanner.nextInt();
        nums[j] = x;
      }
      int[] nums_copy = nums.clone();
      Map<Integer, Boolean> seen = new HashMap<>();
      Stack<Integer> sorted = sortToStack(nums_copy, seen);

      solution(nums, sorted, seen);
    }
  }

  static void solution(int[] nums, Stack<Integer> sorted,
                       Map<Integer, Boolean> seen) {
    int elemOnLeftSide = 0;
    int total = 0;
    for (int n : nums) {
      if (!sorted.isEmpty()) {
        int lastElement = sorted.peek();
        while (!seen.get(lastElement)) {
          sorted.pop();
          if (!sorted.isEmpty()) {
            lastElement = sorted.peek();
          } else {
            break;
          }
        }
        if (!sorted.isEmpty() && n == sorted.peek()) {
          sorted.pop();
          total += elemOnLeftSide;
          elemOnLeftSide = 0;
        } else {
          seen.put(n, false);
          elemOnLeftSide++;
        }
      } else {
        seen.put(n, false);
        elemOnLeftSide++;
      }
    }
    System.out.println(total);
  }

  public static Stack<Integer> sortToStack(int[] array,
                                           Map<Integer, Boolean> seen) {
    Stack<Integer> stack = new Stack<>();
    mergeSort(array, 0, array.length - 1);
    for (int i = array.length - 1; i >= 0; i--) {
      stack.push(array[i]);
      seen.put(array[i], true);
    }
    /* System.out.println("stack size: " + stack.size()); */
    return stack;
  }

  public static void mergeSort(int[] array, int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;
      mergeSort(array, left, mid);
      mergeSort(array, mid + 1, right);
      merge(array, left, mid, right);
    }
  }

  public static void merge(int[] array, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] L = new int[n1];
    int[] R = new int[n2];

    for (int i = 0; i < n1; ++i)
      L[i] = array[left + i];
    for (int j = 0; j < n2; ++j)
      R[j] = array[mid + 1 + j];

    int i = 0, j = 0;

    int k = left;
    while (i < n1 && j < n2) {
      if (L[i] >= R[j]) {
        array[k] = L[i];
        i++;
      } else {
        array[k] = R[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      array[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      array[k] = R[j];
      j++;
      k++;
    }
  }
}
