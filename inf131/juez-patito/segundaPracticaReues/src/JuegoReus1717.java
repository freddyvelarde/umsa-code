import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class JuegoReus1717 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    for (int i = 0; i < t; i++) {
      int a = scanner.nextInt(), b = scanner.nextInt();
      Map<Integer, Stack<Integer>> g = new HashMap<>();
      HashSet<Integer> gSeen = new HashSet<>();

      solution(a, b, g, gSeen);
      findPath(g, a, b);
    }
  }

  public static void findPath(Map<Integer, Stack<Integer>> g, int a, int b) {
    Stack<Integer> stack = new Stack<>();
    HashSet<Integer> seen = new HashSet<>();
    seen.add(a);
    stack.push(a);

    while (!stack.isEmpty()) {
      int x = stack.peek();
      if (x == b) {
        stack.pop();
        break;
      }
      Stack<Integer> childs = g.get(x);

      if (childs != null && !childs.empty()) {
        int firstChild = childs.pop();
        stack.push(firstChild);
        seen.add(firstChild);
      } else {
        stack.pop();
      }
    }
    System.out.println(stack.size());
  }

  public static void solution(int a, int b, Map<Integer, Stack<Integer>> g,
                              HashSet<Integer> gSeen) {
    Queue<Integer> queue = new LinkedList<>();
    HashSet<Integer> seen = new HashSet<>();

    queue.add(a);

    while (!queue.isEmpty()) {
      Integer x = queue.poll();

      if (x == b) {
        break;
      }
      if (!seen.contains(x)) {
        queue.add(invertNumber(x));
        queue.add(addOne(x));
        seen.add(x);
        Stack<Integer> data = new Stack<>();
        if (!gSeen.contains(invertNumber(x))) {
          data.push(invertNumber(x));
          gSeen.add(invertNumber(x));
        }
        if (!gSeen.contains(addOne(x))) {
          data.push(addOne(x));
          gSeen.add(addOne(x));
        }
        g.put(x, data);
      }
    }
  }

  public static int addOne(int n) { return n + 1; }

  public static int invertNumber(int n) {
    int res = 0;
    while (n != 0) {
      int lastDigit = n % 10;
      n /= 10;
      res = res * 10 + lastDigit;
    }
    return res;
  }
}
