import java.util.Scanner;
class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), k = sc.nextInt();

    String str = Integer.toString(n);

    for (int i = 0; i < k; i++) {
      // System.out.println(i);
      if (str.charAt(str.length() - 1) != '0') {
        n--;
      } else {
        n /= 10;
      }
      str = Integer.toString(n);
    }

    System.out.println(n);
  }
}
