import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {

      nums[i] = scanner.nextInt();
    }

    if (isPalindrome(nums, 0, nums.length - 1)) {
      System.out.println("SI");
    } else {
      System.out.println("NO");
    }
  }
  public static boolean isPalindrome(int[] arr, int start, int end) {
    if (start >= end) {
      return true;
    }
    if (arr[start] != arr[end]) {
      return false;
    }
    return isPalindrome(arr, start + 1, end - 1);
  }
}
