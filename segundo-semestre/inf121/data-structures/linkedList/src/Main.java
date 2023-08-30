import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> nums = new LinkedList<>();

    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4);

    for (int i = 0; i < nums.size(); i++) {
      System.out.println(nums.get(i));
    }
  }
}
