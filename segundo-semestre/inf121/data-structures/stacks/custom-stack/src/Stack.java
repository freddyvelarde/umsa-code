public class Stack<T> {
  private int size;
  private int capacity;
  private Object[] stack;

  public Stack(int capacity) {
    this.capacity = capacity;
    this.size = 0;
    this.stack = new Object[this.capacity];
  }

  public int length() { return this.size; }

  public boolean isEmpty() {
    if (this.size == 0)
      return true;
    return false;
  }

  public boolean isFull() {
    if (this.size == this.capacity)
      return true;
    return false;
  }

  public T pop() {
    T lastElement = null;
    if (this.isEmpty())
      return lastElement;

    lastElement = (T)this.stack[this.size - 1];
    this.stack[this.size - 1] = null;
    this.size--;
    return lastElement;
  }

  public void push(T item) {
    if (this.isFull()) {
      System.out.println("The stack is full.");
      return;
    }
    this.stack[this.size] = item;
    this.size++;
  }

  public void clear() {
    if (this.isEmpty())
      return;

    this.stack = new Object[this.capacity];
  }

  public T get(int index) {
    T nElement = null;
    if (index >= this.capacity)
      return nElement;

    return (T)this.stack[index];
  }

  public T peek() {
    T lastElement = null;
    if (this.isEmpty())
      return lastElement;

    return (T)this.stack[this.size - 1];
  }

  public void print() {
    for (int i = 0; i < this.stack.length; i++) {
      System.out.println(this.stack[i]);
    }
  }
}
