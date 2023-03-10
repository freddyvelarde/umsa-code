import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String[] a = new String[10];
    int b; // int b = 0 ???
    b = 0;
    while (b < 10) {
      System.out.println("Nombre:");
      String n = reader.nextLine();
      a[b] = n;
      b++;
    }
    for (b = 0; b < 9; b++) {
      System.out.println(a[b]);
    }
  }
}
