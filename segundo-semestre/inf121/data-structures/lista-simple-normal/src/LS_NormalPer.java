public class LS_NormalPer extends ListaSimplePer {

  public LS_NormalPer() { super(); }

  public boolean esVacia() { return head == null; }

  public void adiPrincipio(Persona z) {
    NodoPer nuevo = new NodoPer(z);
    /* nuevo.setValue(z); */
    nuevo.setNext(head);
    head = nuevo;
    size++;
  }

  public void adiFinal(Persona z) {
    NodoPer nuevo = new NodoPer(z);
    size++;

    if (esVacia()) {
      head = nuevo;
      return;
    }
    NodoPer currentNode = head;

    while (currentNode.getNext() != null) {
      currentNode = currentNode.getNext();
    }
    currentNode.setNext(nuevo);
  }

  public int nroNodos() { return size; }

  public void mostrar() {
    NodoPer currentNode = head;
    while (currentNode != null) {
      currentNode.getValue().mostrar();
      currentNode = currentNode.getNext();
    }
  }
}
