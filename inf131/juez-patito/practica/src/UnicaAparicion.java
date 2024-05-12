import java.util.*;

public class UnicaAparicion {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<Long, Integer> numsDict = new HashMap<>();
    int t = scanner.nextInt();

    for (int i = 0; i < t; i++) {
      long x = scanner.nextLong();
      if (numsDict.containsKey(x)) {
        numsDict.put(x, numsDict.get(x) + 1);
      } else {
        numsDict.put(x, 1);
      }
    }
    for (Long key : numsDict.keySet()) {
      Integer value = numsDict.get(key);
      if (value == 1) {
        System.out.println(key);
        break;
      }
    }
  }
}
