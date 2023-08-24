public class Main {
  public static void main(String[] args) {
    CustomStack<Integer> numbers = new CustomStack<>(5);
    numbers.push(1);
    numbers.push(2);
    numbers.push(3);
    numbers.push(4);
    numbers.push(5);

    numbers.print();
  }
}
