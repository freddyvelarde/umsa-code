public class EsUnNumeroCuadrado2319 {
  public static void main(String[] args) {
    int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90};

    solution(nums);
  }
  static void solution(int[] nums) {

    int r = 1;
    for (int n : nums) {
      r *= n;
    }

    System.out.println(r);
  }
}
