class Node<T> {
  T data;
  Node next;

  public Node(T newData) {
    this.data = newData;
    this.next = null;
  }
}

public class SimpleLinkedList<I> {
  private Node head;
  private int size;

  public SimpleLinkedList() {
    this.head = null;
    this.size = 0;
  }

  public void append(I item) {
    Node newNode = new Node<>(item);
    if (this.head == null) {
      head = newNode;
      this.size++;
      return;
    }

    Node currentNode = this.head;

    while (currentNode.next != null) {
      currentNode = currentNode.next;
    }
    currentNode.next = newNode;
    this.size++;
  }

  public int length() { return this.size; }

  public void print() {
    Node currentNode = this.head;

    if (this.head == null) {
      System.out.println(this.head);
      return;
    }

    while (currentNode != null) {
      System.out.println(currentNode.data);
      currentNode = currentNode.next;
    }
  }
}
