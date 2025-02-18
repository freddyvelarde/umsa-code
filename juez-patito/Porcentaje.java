import java.util.Scanner;
public class Porcentaje {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
      String line = sc.nextLine();
      if (line.equals("#"))
        return;

      String res = line.replaceAll("\\%", "%25")
                       .replaceAll("\\(", "%28")
                       .replaceAll("\\)", "%29")
                       .replaceAll("\\*", "%2a")
                       .replaceAll("\\$", "%24")
                       .replaceAll("\\!", "%21")

                       .replaceAll(" ", "%20");

      System.out.println(res);
    }
  }
}
