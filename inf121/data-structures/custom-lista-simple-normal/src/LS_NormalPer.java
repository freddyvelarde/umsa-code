public class LS_NormalPer extends ListaSimplePer {
  private int size;

  public LS_NormalPer() { super(); }

  public boolean esVacia() { return this.head == null; }

  public void adiPrincipio(Persona newValue) {
    NodoPer newNode = new NodoPer(newValue);
    newNode.setNext(this.head);
    head = newNode;
    size++;
  }

  public void adiFinal(Persona newValue) {
    NodoPer newNode = new NodoPer(newValue);

    if (this.esVacia()) {
      head = newNode;
      size++;
      return;
    }
    NodoPer currentNode = head;

    while (currentNode.getNext() != null) {
      currentNode = currentNode.getNext();
    }
    currentNode.setNext(newNode);

    size++;
  }

  public void mostrar() {
    NodoPer currentNode = head;
    int i = 1;

    while (currentNode != null) {
      currentNode.getValue().mostrar();
      System.out.println("Node nro: " + i);
      currentNode = currentNode.getNext();
      i++;
    }
  }

  public NodoPer eliPrincipio() {
    NodoPer firstElement = new NodoPer();

    if (!this.esVacia()) {
      firstElement = head;
      head = head.getNext();
      firstElement.setNext(null);
    }
    size--;
    return firstElement;
  }

  public NodoPer eliFinal() {
    if (this.head == null)
      return null;

    if (size == 1) {
      NodoPer value = head;
      head = null;
      size--;
      return value;
    }

    NodoPer currentNode = head;

    while (currentNode.getNext() != null &&
           currentNode.getNext().getNext() != null) {
      currentNode = currentNode.getNext();
    }

    if (currentNode.getNext() == null) {
      NodoPer value = head;
      head = null;
      size--;
      return value;
    }
    NodoPer value = currentNode.getNext();
    currentNode.setNext(null);
    size--;
    return value;
  }
  // public NodoPer eliFinal() {
  //   NodoPer lastElement = new NodoPer();
  //
  //   if (!this.esVacia()) {
  //     if (this.nroNodos() == 1) {
  //       lastElement = head;
  //       head = null;
  //     } else {
  //       NodoPer currentNode_1 = head;
  //       NodoPer currentNode_2 = head;
  //
  //       while (currentNode_1.getNext() != null) {
  //         currentNode_2 = currentNode_1;
  //         currentNode_1 = currentNode_1.getNext();
  //       }
  //       lastElement = currentNode_1;
  //       currentNode_2.setNext(null);
  //     }
  //   }
  //   return lastElement;
  // }

  public void leer1(int n) {
    for (int i = 1; i <= n; i++) {
      Persona z = new Persona();
      z.leer();
      adiPrincipio(z);
    }
  }

  public void leer2(int n) {
    for (int i = 1; i <= n; i++) {
      Persona z = new Persona();
      z.leer();
      adiFinal(z);
    }
  }

  public int nroNodos() { return size; }
}
