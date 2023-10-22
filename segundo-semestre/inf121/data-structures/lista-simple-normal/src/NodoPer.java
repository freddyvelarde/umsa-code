public class NodoPer {
  private Persona value;
  private NodoPer next;

  public NodoPer() { next = null; }

  public NodoPer(Persona newValue) {
    this.next = null;
    this.value = newValue;
  }

  public Persona getValue() { return value; }
  public void setValue(Persona newValue) { this.value = newValue; }

  public NodoPer getNext() { return next; }
  public void setNext(NodoPer nextNode) { this.next = nextNode; }
}
