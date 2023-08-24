public class Main {
  public static void main(String[] args) {
    Stack<String> vowels = new Stack<>(4);

    vowels.push("Freddy");
    vowels.push("Erick");
    vowels.push("Velarde");
    vowels.push("Silva");

    System.out.println(vowels.get(4));
  }
}
