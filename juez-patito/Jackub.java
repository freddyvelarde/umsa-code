import java.util.HashMap;
import java.util.Scanner;

public class Jackub {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      String keyboard = sc.next();
      String word = sc.next();
      sol(keyboard, word);
    }
  }

  static void sol(String keyboard, String word) {
    HashMap<Character, Integer> map = new HashMap<>();

    int c = 1;
    for (int i = 0; i < keyboard.length(); i++) {
      char k = keyboard.charAt(i);
      map.put(k, c);
      c++;
    }

    int res = 0;
    for (int i = 0; i < word.length() - 1; i++) {
      char currChar = word.charAt(i);
      char nextChar = word.charAt(i + 1);

      int currCharVal = map.get(currChar);
      int nextCharVal = map.get(nextChar);

      int sum = Math.abs(currCharVal - nextCharVal);
      res += sum;
    }
    System.out.println(res);
  }
}
