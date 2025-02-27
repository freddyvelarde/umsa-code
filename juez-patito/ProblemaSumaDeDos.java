import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class ProblemaSumaDeDos {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      int len = sc.nextInt();
      int target = sc.nextInt();
      int nums[] = new int[len];

      for (int i = 0; i < len; i++) {
        int x = sc.nextInt();
        nums[i] = x;
      }
      Arrays.sort(nums, 0, nums.length);

      sol(nums, target);
    }
  }

  public static void sol(int nums[], int target) {
    HashSet<Integer> set = new HashSet<>();
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int x = nums[i];
      set.add(x);

      if (map.get(x) != null) {
        map.put(x, map.get(x) + 1);

      } else {
        map.put(x, 1);
      }
    }

    for (int i = 0; i < nums.length; i++) {

      int x = target - nums[i];

      if (set.contains(x)) {
        if (nums[i] != x || map.get(x) > 1) {

          System.out.println(nums[i] + " " + x);
          return;
        }
      }
    }

    System.out.println(-1);
  }
}
