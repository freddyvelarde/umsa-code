public class NodoPer {
  private Persona value;
  private NodoPer next;

  public NodoPer() { next = null; }

  public NodoPer(Persona newValue) {
    this.value = newValue;
    next = null;
  }

  public Persona getValue() { return value; }
  public void setValue(Persona value) { this.value = value; }
  public NodoPer getNext() { return next; }
  public void setNext(NodoPer next) { this.next = next; }
}
