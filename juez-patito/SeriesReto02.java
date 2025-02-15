import java.util.Scanner;

class SeriesReto02 {
  public static void main(String[] args) {
    int fib[] = generateFib();
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    for (int i=0; i < t; i++) {
      int n = sc.nextInt();
      sol(fib, n);
    }
    // sol(fib,10);
    // sol(fib,6);
    // sol(fib,7);
    // sol(fib,1);

  }

  public static int[] generateFib() {
    int fib[] = new int[1000];

    fib[0] = 0;
    fib[1] = 0;
    fib[2] = 1;
    fib[3] = 1;

    for (int i = 4; i < 1000 - 1; i++) {
      fib[i] = fib[i - 1] + fib[i - 3];
      fib[i + 1] = fib[i - 1] + fib[i - 3];
      i++;
    }

    return fib;
  }

  public static void sol(int fib[], int n) {

    for (int i = 0; i < n; i++) { 
      System.out.print(fib[i] + " ");
    }
    System.out.println();
    

  }
}
