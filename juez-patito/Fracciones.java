import java.util.Scanner;
public class Fracciones {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      String line = scanner.nextLine();

      String nums[] = line.split(" ");
      if (nums[0].equals("0") && nums[1].equals("0") && nums[2].equals("0") &&
          nums[3].equals("0")) {
        break;
      }

      double a = Double.parseDouble(nums[0]) / Double.parseDouble(nums[1]);
      double b = Double.parseDouble(nums[2]) / Double.parseDouble(nums[3]);
      if (a == b) {
        System.out.println("=");
      } else {
        System.out.println("!=");
      }
    }
  }
}
