import java.util.*;

public class SumaIgualAXOR1013 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      long n = sc.nextLong();

      solution(n);
    }
  }

  public static void solution(long decimalVal) {
    if ((decimalVal & (decimalVal - 1)) == 0 && decimalVal > 0) {
      System.out.println(decimalVal);
      return;
    }

    int k = decimalToBinary(decimalVal);
    int res = (int)Math.pow(2, k);
    System.out.println(res);
  }
  public static int decimalToBinary(long decimal) {
    int c = 0;

    while (decimal > 0) {
      int remainder = (int)decimal % 2;
      if (remainder == 0)
        c++;
      decimal /= 2;
    }
    return c;
  }
}
