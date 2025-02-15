import java.util.Scanner;

public class BinarioInverso {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      
      int n = sc.nextInt();

    String a = Integer.toBinaryString(n);
    StringBuilder reversed = new StringBuilder(a).reverse();
    int decimal = Integer.parseInt(reversed.toString(),2);
    System.out.println(decimal);
    }

  }
}
