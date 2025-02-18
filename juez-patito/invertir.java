import java.util.Scanner;

public class invertir {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String line = sc.next();
    String lineReversed = "";

    for (int i = 0; i < line.length(); i++) {
      lineReversed = line.charAt(i) + lineReversed;
    }
    System.out.println(lineReversed);
  }
}
