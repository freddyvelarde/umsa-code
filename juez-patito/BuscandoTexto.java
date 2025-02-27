import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String T = scanner.nextLine().toLowerCase(); // Convertir a minúsculas
    String S = scanner.nextLine().toLowerCase(); // Convertir a minúsculas
    scanner.close();

    List<Integer> positions = new ArrayList<>();
    for (int i = 0; i <= T.length() - S.length(); i++) {
      if (T.substring(i, i + S.length()).equals(S)) {
        positions.add(i);
      }
    }

    for (int pos : positions) {
      System.out.println(pos);
    }
  }
}
