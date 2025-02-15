import java.util.Scanner;

public class Adyacentes {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
      String s = sc.next();
      
      sol(s);
    }
  }
  public static void sol(String word) {

    for (int i = 0; i < word.length() - 1; i++) {
      char currChar = word.charAt(i);
      char nextChar = word.charAt(i + 1);

      if (currChar == nextChar && !String.valueOf( currChar).equals("r") && !String.valueOf(currChar).equals("l") ) {
        System.out.println("si");
        return;
      }

    }
    System.out.println("no");

  }
}
