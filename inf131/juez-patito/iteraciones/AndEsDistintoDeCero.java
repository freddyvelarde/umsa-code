import java.util.*;

public class AndEsDistintoDeCero {

  public static boolean checkBitABit(List<Integer> nums) {
    int r = nums.get(0);
    for (int n : nums) {
      if ((r & n) == 0)
        return false;
      else {
        r = (n & r);
      }
    }
    return true;
  }

  public static List<List<Integer>> generateCombinations(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    int n = nums.length;
    int max = 1 << n; // Maximum number of combinations

    for (int i = 0; i < max; i++) {
      List<Integer> combination = new ArrayList<>();
      for (int j = 0; j < n; j++) {
        if ((i & (1 << j)) != 0) {
          combination.add(nums[j]);
        }
      }
      result.add(combination);
    }

    return result;
  }

  public static void main(String[] args) {
    /* int[] n = {2, 3, 4, 5, 6, 7, 8}; */
    int[] n = new int[100001];

    int c = 0;
    for (int i = 100000; i <= 200000; i++) {
      n[c] = i;
      c++;
    }

    List<Integer> res = new ArrayList<>();

    List<List<Integer>> y = generateCombinations(n);
    for (List<Integer> a : y) {
      if (a.size() > 0 && checkBitABit(a)) {
        res.add(a.size());
      }
    }

    int max = 0;
    for (int r : res) {
      if (r > max)
        max = r;
    }
    System.out.println(max);
  }
}
