# Tarea inf-121

Lista simple normal de objetos `Persona`

Archivo: Principal.java

```java
public class Principal {
  public static void main(String[] args) {
    LS_NormalPer firstLinkedList = new LS_NormalPer();

    Persona z1 = new Persona("mario", 15);
    Persona z2 = new Persona("luis", 22);
    Persona z3 = new Persona("alan", 20);
    Persona z4 = new Persona("lupe", 22);
    Persona z5 = new Persona("marcelo", 25);
    Persona z6 = new Persona("wilson", 19);

    firstLinkedList.adiFinal(z4);
    firstLinkedList.adiFinal(z3);
    firstLinkedList.adiFinal(z2);
    firstLinkedList.adiFinal(z1);

    LS_NormalPer secondLinkedList = new LS_NormalPer();

    secondLinkedList.adiFinal(z6);
    secondLinkedList.adiFinal(z5);
    secondLinkedList.adiFinal(z3);
    secondLinkedList.adiFinal(z2);
    secondLinkedList.adiFinal(z1);

    // d)
    System.out.println("Personas que se repiten en ambas listas: ");
    printIntersectionOfLists(firstLinkedList, secondLinkedList);

    // e)
    int index = 3;
    System.out.println("Encuentra a la persona con index: " + index);
    findNodeByIndex(firstLinkedList, index); // index 3 = luis
    index = 6;
    System.out.println("Encuentra a la persona con index: " + index);
    findNodeByIndex(firstLinkedList, index); // index 6 = no existe
  }
}
```

- d) Sean 2 listas de objetos Persona, mostrar las personas que estan es ambas listas.

```java
  static void printIntersectionOfLists(LS_NormalPer l1, LS_NormalPer l2) {
    NodoPer currentNodeL1 = l1.getP();
    NodoPer currentNodeL2 = l2.getP();

    while (currentNodeL1 != null) {
      Persona p = currentNodeL1.getQ();
      while (currentNodeL2 != null) {
        if (currentNodeL1.getQ().getNom() == currentNodeL2.getQ().getNom()) {
          p.mostrar();
          break;
        }
        currentNodeL2 = currentNodeL2.getSig();
      }
      currentNodeL2 = l2.getP();
          currentNodeL1 = currentNodeL1.getSig();
    }
  }
```

Output:

![Imgur](https://i.imgur.com/I1glbs8.png)

- e) Sea una lista de personas, mostrar el nodo i-ésimo.

![Imgur](https://i.imgur.com/8V95rbj.png)

```java
  static void findNodeByIndex(LS_NormalPer people, int index) {

    if (people.nroNodos() < index) {
      System.out.println("No existe!!");
      return;
    }

    int i = 1;
    NodoPer currentNode = people.getP();

    while (currentNode != null) {
      if (index == i) {
        currentNode.getQ().mostrar();
        return;
      }
      i++;

      currentNode = currentNode.getSig();
    }
  }
```

Output:

![Imgur](https://i.imgur.com/8MvkG2H.png)
