import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    solve1006();
  }

  public static void solve1006() {
    Scanner scanner = new Scanner(System.in);

    int t = scanner.nextInt();

    scanner.nextLine();

    for (int i = 0; i < t; i++) {
      String input = scanner.nextLine();
      String res = "";

      int counter = 1;
      for (int j = 0; j < input.length(); j++) {
        char c = input.charAt(j);

        if (c == ' ') {res += " "; continue;}

        if (counter % 2 != 0) {
          res += Character.toUpperCase(c);
          counter++; 
        } else {
          res += Character.toLowerCase(c);
          counter++;
        }
        
      }


      counter = 0;
      System.out.println(res);
    }


  }

  public static void solve1000() {
    Scanner scanner = new Scanner(System.in);
    
    String input = scanner.nextLine();

    String[] nums = input.split(" ");

    int num1 = Integer.parseInt(nums[0]);
    int num2 = Integer.parseInt(nums[1]);

    System.out.println(num1 + num2);
  }
}
