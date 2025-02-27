import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String line = sc.next();
    sol(line);
  }

  public static void sol(String line) {
    int i = 0;
    String binaryString = "";
    String res = "";

    for (char ch : line.toCharArray()) {
      binaryString += ch;
      i++;
      if (i == 8) {
        int asciiVal = Integer.parseInt(binaryString, 2);
        char charVal = (char)asciiVal;
        res += charVal;
        binaryString = "";
        i = 0;
      }
    }
    if (!binaryString.isEmpty()) {
      int asciiVal = Integer.parseInt(binaryString, 2);
      res += (char)asciiVal;
    }
    System.out.println(res);
  }
}
