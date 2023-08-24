public class Main {
  public static void main(String[] args) {
    CustomStack myStack = new CustomStack();

    myStack.push(1);
    myStack.push(2);
    myStack.push(3);
    myStack.push(4);
    myStack.push(5);
    myStack.isEmpty();
    System.out.println(myStack.size());
    /* myStack.print(); */
  }
}
