import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
      int nums[] = Arrays.stream(sc.nextLine().trim().split("\\s"))
                       .mapToInt(Integer::parseInt)
                       .toArray();

      // System.out.println(Arrays.toString(nums));
      sol(nums);
    }
  }
  public static void sol(int nums[]) {
    int res = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      int curr = nums[i];
      int next = nums[i + 1];
      int remain = 0;

      if (curr >= next) {

        remain = Math.abs(curr - (next - 1));
        res += remain;
      }

      if (remain > next) {
        System.out.println(-1);
        return;
      }
    }
    System.out.println(res);
  }
}
