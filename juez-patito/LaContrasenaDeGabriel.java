import java.util.Scanner;
public class LaContrasenaDeGabriel {

  // capital char value A = 65 to Z = 90
  // a = 97 to b = 122
  // 0 = 48 to 9 = 57
  // * -> 42
  // ! -> 33
  // # -> 35
  // < -> 60
  // > -> 62

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      String line = sc.next();
      sol(line);
    }
  }

  public static void sol(String password) {
    if (password.length() < 10) {
      System.out.println("Debil");
      return;
    }

    int capCounter = 0;
    int lowerCounter = 0;
    int symbCounter = 0;
    int numsCounter = 0;

    for (int i = 0; i < password.length(); i++) {
      int ascii = (int)password.charAt(i);
      if (ascii >= 65 && ascii <= 90)
        capCounter++;
      else if (ascii >= 97 && ascii <= 122)
        lowerCounter++;
      else if (ascii >= 48 && ascii <= 57)
        numsCounter++;
      else if (ascii == 42 || ascii == 33 || ascii == 35 || ascii == 60 ||
               ascii == 62)
        symbCounter++;

      /* System.out.println(password.charAt(i) + " -> " + ascii); */
    }

    if (capCounter >= 2 && lowerCounter >= 2 && numsCounter >= 4 &&
        symbCounter >= 1) {
      System.out.println("Segura");
    } else {
      System.out.println("Debil");
    }
  }
}
