public class CustomStack<T> {
  private int stackSize = 0;
  private int capacity = 10;
  private Object[] stack;

  public CustomStack(int stackCapacity) {
    this.stackSize = 0;
    this.capacity = stackCapacity;
    this.stack = new Object[this.capacity];
    System.out.println("Stack created.");
  }

  public int size() { return this.stackSize; }

  public boolean isFull() {
    if (this.stackSize == this.capacity) {
      System.out.println("The stack is full.");
      return true;
    }
    return false;
  }

  public boolean isEmpty() {
    if (this.stackSize == 0) {
      System.out.println("The stack is Empty");
      return true;
    }

    return false;
  }

  public void push(T item) {
    if (this.isFull()) {
      return;
    }
    this.stack[this.stackSize] = item;
    this.stackSize++;
  }

  public T pop() {
    T lastElement = null;
    if (this.isEmpty())
      return lastElement;
    lastElement = (T)this.stack[this.stackSize - 1];
    this.stack[this.capacity - 1] = 0;
    this.stackSize--;
    return lastElement;
  }

  public void print() {
    for (int i = 0; i < this.stack.length; i++) {
      System.out.println(this.stack[i]);
    }
  }

  public void clean() {
    this.stack = new Object[this.capacity];
    System.out.println("The stack was cleaned.");
  }
}
