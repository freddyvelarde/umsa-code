import java.util.*;

public class CalcularElUltimoDigito2015 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<Long, Integer> digY = new HashMap<>();
    digY.put(1L, 3);
    digY.put(2L, 9);
    digY.put(3L, 7);
    digY.put(0L, 1);
    Map<Long, Integer> digX = new HashMap<>();
    digX.put(1L, 2);
    digX.put(2L, 4);
    digX.put(3L, 8);
    digX.put(0L, 6);

    while (sc.hasNext()) {

      long x = sc.nextLong();
      long y = sc.nextLong();

      long digXValue = digX.get(x % 4);
      long digYValue = digY.get(y % 4);
      long dig = (digXValue + digYValue) % 10;
      System.out.println(dig);
    }
  }
}
