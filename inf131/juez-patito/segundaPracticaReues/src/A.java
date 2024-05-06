import java.util.HashSet;

public class A {
  public static void main(String[] args) {
    /* HashSet<Integer> repeated = new HashSet<>(); */

    /* solution(100, 301, 0, repeated); */
    /* solution(133, 233, 0, repeated); */
    /* solution(1, 9, 0, repeated); */
    /* System.out.println(invertNumber(100)); */
    /* System.out.println(checkRepeatedDigits(1)); */
    /* System.out.println(repeated.toString()); */
  }

  public static void solution(int A, int B) {

    while (A != B) {

      int invertedA = invertNumber(A);
      int increasedA = A + 1;

      if (invertedA == B) {
        A = B;
      }

      if (increasedA == B) {
        A = B;
      }
    }
  }

  /* static void solution(int A, int B, int counter, HashSet<Integer> repeated)
   * { */
  /*   if (A == B) { */
  /*     System.out.println("Result = " + counter); */
  /*     System.out.println("A = " + A); */
  /*     System.out.println("B = " + B); */
  /*     repeated.add(B); */
  /*     return; */
  /*   } */
  /*  */
  /*   [> if (repeated.contains(B)) { <] */
  /*   [>   return -1; <] */
  /*   [> } <] */
  /*  */
  /*   if (!repeated.contains(A)) { */
  /*     repeated.add(A); */
  /*     if (!checkRepeatedDigits(A)) { */
  /*       System.out.println(counter + " Inverted A: " + invertNumber(A)); */
  /*       solution(invertNumber(A), B, counter + 1, repeated); */
  /*     } */
  /*     if (A < B) { */
  /*       System.out.println(counter + " sum A + 1: " + (A + 1)); */
  /*       solution(A + 1, B, counter + 1, repeated); */
  /*     } */
  /*   } */
  /*   [> repeated.add(A); <] */
  /* } */
  public static int invertNumber(int n) {
    int res = 0;
    while (n != 0) {
      int lastDigit = n % 10;
      n /= 10;
      res = res * 10 + lastDigit;
    }
    return res;
  }

  public static boolean checkRepeatedDigits(int n) {
    String nStringyfied = Integer.toString(n);
    int lastIdx = nStringyfied.length() - 1;
    for (int i = 0; i < nStringyfied.length(); i++) {
      char start = nStringyfied.charAt(i);
      char end = nStringyfied.charAt(lastIdx);
      if (start != end) {
        return false;
      }
      lastIdx--;
    }
    return true;
  }

  static int sumOne(int n) { return n + 1; }
}
