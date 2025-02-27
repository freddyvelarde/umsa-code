import java.util.Scanner;
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String line = sc.nextLine();

    sol(line);
  }

  public static void sol(String message) {
    String res = "";
    for (char ch : message.toCharArray()) {
      int ascciValue = (int)ch;
      String binaryStr = Integer.toBinaryString(ascciValue);

      // System.out.println(trim8Bits(binaryStr));
      res += trim8Bits(binaryStr);
    }
    System.out.println(res);
  }

  public static String trim8Bits(String binaryStr) {

    int len = binaryStr.length();

    if (len == 8)
      return binaryStr;

    int rem = 8 - len;

    String res = "";
    for (int i = 0; i < rem; i++) {
      res += "0";
    }
    res += binaryStr;

    return res;
  }
}
