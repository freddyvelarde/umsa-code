import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Chat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<Character, Integer> c = new HashMap<>();

    int n = sc.nextInt();
    while (sc.hasNext()) {
      String line = sc.next();
      charCounter(line, c);
    }

    Map<Character, Integer> sorted = sortByValue(c);
    for (Map.Entry<Character, Integer> entry : sorted.entrySet()) {
      Character ch = entry.getKey();
      Integer cant = entry.getValue();
      System.out.println(ch + " " + cant);
    }
  }

  public static void charCounter(String line, Map<Character, Integer> c) {
    for (int i = 0; i < line.length(); i++) {
      char ch = line.charAt(i);
      if (String.valueOf(ch).equals(" "))
        continue;

      if (c.get(ch) != null) {
        c.put(ch, c.get(ch) + 1);
      } else {
        c.put(ch, 1);
      }
    }
  }

  public static Map<Character, Integer>
  sortByValue(Map<Character, Integer> map) {
    List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

    list.sort(
        (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

    Map<Character, Integer> sortedMap = new LinkedHashMap<>();
    for (Map.Entry<Character, Integer> entry : list) {
      sortedMap.put(entry.getKey(), entry.getValue());
    }

    return sortedMap;
  }
}
