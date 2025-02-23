import java.util.Arrays;
import java.util.Scanner;

public class OrdenandoNumero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {

      String n = sc.next();
      sol(n);
    }
  }

  public static void sol(String numsStr) {
    int nums[] = new int[numsStr.length()];

    int ind = 0;
    for (int i = 0; i < numsStr.length(); i++) {
      char ch = numsStr.charAt(i);
      int x = Integer.parseInt(String.valueOf(ch));
      nums[ind] = x;
      ind++;
    }
    Arrays.sort(nums, 0, nums.length);
    // System.out.println(Arrays.toString(nums));

    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]);
    }
    System.out.println();
  }
}
