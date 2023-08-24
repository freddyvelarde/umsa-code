public class CustomStack extends CustomVector {
  private int limit;

  public CustomStack() { this.limit = -1; }

  public boolean isFull() {
    if (this.limit == this.max - 1) {
      System.out.println("Stack is full.");
      return true;
    }
    return false;
  }

  public boolean isEmpty() {
    if (this.limit == -1) {
      return true;
    }
    return false;
  }

  public void push(int item) {
    if (this.isFull()) {
      return;
    }
    this.limit++;
    this.v[this.limit] = item;
  }

  public int pop() {
    int elem = -1;
    if (this.isEmpty()) {
      System.out.println("Pila Vacia!!");
      return elem;
    }
    elem = this.v[this.limit];
    this.limit--;
    return elem;
  }

  public void print() {
    for (int i = 0; i < this.v.length; i++) {
      if (this.v[i] != 0)
        System.out.println(this.v[i]);
    }
  }
  public int size() { return this.limit - 1; }
}
