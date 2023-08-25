public class DynamicVector<T> {
  private int size;
  private int capacity;
  private Object[] vector;

  public DynamicVector(int capacity) {
    this.capacity = capacity;
    this.size = 0;
    this.vector = new Object[this.capacity];
  }

  public DynamicVector() {
    this.capacity = 5;
    this.size = 0;
    this.vector = new Object[this.capacity];
  }

  private boolean isFull() {
    if (this.size == this.capacity)
      return true;
    return false;
  }

  public boolean isEmpty() {
    if (this.size == 0)
      return true;
    return false;
  }
  private void resize(int newCapacity) {
    Object[] newVector = new Object[newCapacity];

    for (int i = 0; i < this.vector.length; i++) {
      newVector[i] = this.vector[i];
    }
    this.capacity = newCapacity;
    this.vector = newVector;
  }

  public void push(T item) {
    if (this.isFull()) {
      this.resize(this.capacity * 2);
    }
    this.vector[this.size] = item;
    this.size++;
  }

  public int length() { return this.size; }

  public void print() {
    for (int i = 0; i < this.vector.length; i++) {
      System.out.println(this.vector[i]);
    }
  }
}
