import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNext()) {
      long x = scanner.nextLong();
      long d = scanner.nextLong();

      int n = scanner.nextInt();
      long[] arr = new long[n + 1];

      arr[0] = 0;
      for (int i = 1; i <= n; i++) {
        long a = scanner.nextLong();
        arr[i] = a;
      }

      System.out.println(solution(arr, x, d));
    }
  }

  public static int solution(long[] arr, long x, long d) {
    Arrays.sort(arr);
    int c = 0;

    long gasAvailable = x;

    for (int i = 0; i < arr.length; i++) {
      long distance = 0;
      if (i < arr.length - 1) {
        long currentGasEstation = arr[i];
        long nextGasEstation = arr[i + 1];
        distance = nextGasEstation - currentGasEstation;
      } else {
        distance = d - arr[i];
      }

      if (gasAvailable < distance) {
        c++;
        gasAvailable = x;
      }
      gasAvailable = gasAvailable - distance;
    }
    return c;
  }
}
