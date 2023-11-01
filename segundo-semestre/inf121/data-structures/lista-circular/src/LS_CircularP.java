import java.util.Scanner;

public class LS_CircularP extends ListaSimpleP {
  private int size = 0;
  public LS_CircularP() { super(); }

  public boolean esVacia() { return this.P == null; }

  public int nroNodos() { return size; }

  public void adiFinal(String nom, int edad) {
    NodoP newNode = new NodoP();
    newNode.setNom(nom);
    newNode.setEdad(edad);

    if (this.P == null) {
      P = newNode;
      P.setSig(P);
    } else {
      NodoP currentNode = P;
      while (currentNode.getSig() != P) {
        currentNode = currentNode.getSig();
      }
      currentNode.setSig(newNode);
      newNode.setSig(P);
    }
    size++;
  }

  public void mostrar() {
    NodoP currentNode = P;
    if (P == null) {
      System.out.println("lista vacia");
      return;
    }

    while (currentNode.getSig() != P) {
      System.out.println("Nombre: " + currentNode.getNom() +
                         " edad: " + currentNode.getEdad());
      currentNode = currentNode.getSig();
    }
    System.out.println("Nombre: " + currentNode.getNom() +
                       " edad: " + currentNode.getEdad());
  }

  public void adiPrincipio(String nom, int edad) {
    NodoP newNode = new NodoP();
    newNode.setNom(nom);
    newNode.setEdad(edad);

    if (P == null) {
      P = newNode;
      P.setSig(P);
    } else {
      NodoP currentNode = P;
      while (currentNode.getSig() != P) {
        currentNode = currentNode.getSig();
      }
      currentNode.setSig(newNode);
      newNode.setSig(P);
      P = newNode;
      size++;
    }
  }

  public NodoP eliFinal() {
    NodoP node_a = new NodoP();
    if (P != null) {
      if (P.getSig() == P) {
        node_a = P;
        node_a.setSig(P);
        P = null;
      } else {
        NodoP node_b = new NodoP();
        NodoP currentNode = P;
        while (currentNode.getSig() != P) {
          node_b = currentNode;
          currentNode = currentNode.getSig();
        }

        node_a = currentNode;
        node_a.setSig(null);
        node_b.setSig(P);
      }
    }
    size--;
    return node_a;
  }

  public NodoP eliPrincipio() {
    NodoP node = new NodoP();
    if (esVacia()) {
      System.out.println("lista vacia");
      return node;
    }

    if (size == 1) {
      P = null;
      size--;
    } else {
      NodoP temp = P;
      node = P;
      while (temp.getSig() != P) {
        temp = temp.getSig();
      }
      temp.setSig(P.getSig());
      P = P.getSig();
      size--;
    }
    return node;
  }

  public void llenar1(int n) {
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < n; i++) {
      System.out.println("Insert: nom, edad: ");
      String nom = scanner.next();
      int edad = scanner.nextInt();

      adiFinal(nom, edad);
    }
  }
  public void llenar2(int n) {
    Scanner reader = new Scanner(System.in);
    String nom;
    int edad;

    for (int i = 1; i <= n; i++) {
      System.out.println("Insert: nom, edad:");
      nom = reader.next();
      edad = reader.nextInt();

      adiPrincipio(nom, edad);
    }
  }
}
