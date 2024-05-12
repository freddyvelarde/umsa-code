import java.util.Scanner;

class FormandoAmigos1890 {
  public static void main(String[] args) {
    /* System.out.println(minNumberOfFriends(14449, 6797)); */
    System.out.println(maxNumberOfFriends(14449, 6797));
  }
  /* public static void main(String[] args) { */
  /*   Scanner sc = new Scanner(System.in); */
  /*   int t = sc.nextInt(); */
  /*  */
  /*   for (int i = 0; i < t; i++) { */
  /*     int m = sc.nextInt(); */
  /*     int n = sc.nextInt(); */
  /*  */
  /*     System.out.println("for: m = " + m + " and n = " + n); */
  /*     System.out.println(minNumberOfFriends(m, n) + " " + */
  /*                        maxNumberOfFriends(m, n)); */
  /*   } */
  /* } */

  static int maxNumberOfFriends(int m, int n) {
    int team = m - n + 1;
    /* System.out.println(team); */
    int numberOfFriends = combinatorics(team);
    return numberOfFriends;
  }

  static int minNumberOfFriends(int m, int n) {
    int i = (m / n);

    if (m % n == 0) {
      return combinatorics(i) * n;
    } else {
      int res = combinatorics(i) * (n - (m % n));
      for (int j = 0; j < i; j++) {
        res += combinatorics(i + 1);
      }
      return res;
    }
  }

  static int combinatorics(int n) {
    // C_n_r = r! / r! * (n - r)!
    return factorial(n) / (2 * factorial(n - 2));
  }

  static int factorial(int n) {
    if (n <= 1)
      return 1;

    return n * factorial(n - 1);
  }
}
