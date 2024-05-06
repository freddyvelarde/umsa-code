import java.util.*;

public class ReusCadenas1856 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      String a = sc.next();
      String b = sc.next();

      boolean res = solution(a, b);
      if (res) {
        System.out.println("SI");
      } else {
        System.out.println("NO");
      }
    }
  }

  static boolean solution(String a, String b) {
    if (a.equals(b)) {
      return true;
    }
    if (a.length() % 2 != 0) {
      return false;
    }

    if (a.length() <= 1) {
      return a.equals(b);
    }

    String a_1 = a.substring(0, a.length() / 2);
    String a_2 = a.substring(a.length() / 2);
    String b_1 = b.substring(0, b.length() / 2);
    String b_2 = b.substring(b.length() / 2);

    if (a_1.equals(a_2) && b_1.equals(b_2)) {
      return true;
    } else if (a_1.equals(b_2) && a_2.equals(b_1)) {
      return true;
    }

    return solution(a_1, b_1) && solution(a_2, b_2) ||
        solution(a_1, b_2) && solution(a_2, b_1);
  }
}
