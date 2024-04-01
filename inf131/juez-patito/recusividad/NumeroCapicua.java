import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String number = scanner.next();

    if (isPalindrome(number))
      System.out.println("S");
    else
      System.out.println("N");
  }

  public static int[] decomposeNumber(int number) {
    int numDigits = (int)Math.log10(number) + 1;
    int[] digits = new int[numDigits];

    for (int i = numDigits - 1; i >= 0; i--) {
      digits[i] = number % 10;
      number /= 10;
    }

    return digits;
  }

  public static boolean isPalindrome(String numString) {
    int length = numString.length();

    for (int i = 0; i < length / 2; i++) {
      if (numString.charAt(i) != numString.charAt(length - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}
