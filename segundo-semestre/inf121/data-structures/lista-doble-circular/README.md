# Tarea INF 121

Nombre: Freddy Erick Velarde Silva

Enviar en un archivo comprimido la implementación de la lista doble de objetos proyecto, y captura de pantalla de la ejecución de cada método de la lista doble

- `esVacia():`

```java
  boolean esVacia() {
    return this.P == null;
  }
```

output:

![Imgur](https://i.imgur.com/UCb7dWC.png)

- `nroNodos():`

```java
  int nroNodos() {
    int c = 0;
    NodoP R = P;
    if (esVacia()) {
      return c;
    }
    while (R.getSig() != P) {
      c++;
      R = R.getSig();
    }
    c++;
    return c;
  }
```

output:

![Imgur](https://i.imgur.com/tiHawon.png)

- `adiPrimero():`

```java
  void adiPrimero(Proyecto z) {
      NodoP nuevo = new NodoP();
    nuevo.setNom(nom);
    nuevo.setEdad(edad);
    if (esVacia()) {
      P = nuevo;
      P.setSig(P);
      P.setAnt(P);
    } else {
      NodoP R = new NodoP();
      nuevo.setSig(P);
      P.setAnt(nuevo);
      P = nuevo;
      P.setAnt(R);
      R.setSig(P);
    }
  }

```

output:

![Imgur](https://i.imgur.com/yFKyvUH.png)

- `adiFinal():`

```java
  void adiFinal(Proyecto z) {
      NodoP nuevo = new NodoP();
      nuevo.setNom(nom);
    nuevo.setEdad(edad);

    if (esVacia()) {
      P = nuevo;
          P.setSig(P);
      P.setAnt(P);
    } else {
      NodoP R = P.getAnt();
      R.setSig(nuevo);
      nuevo.setAnt(R);
      nuevo.setSig(P);
      P.setAnt(nuevo);
    }
  }
```

output:

![Imgur](https://i.imgur.com/1wQyR1O.png)

- `eliFinal():`

```java
NodoP eliFinal() {
    NodoP x = new NodoP();
    if (!esVacia()) {
      if (P.getSig() == P) {
        x = P;
        P = null;
      } else {
        NodoP R = new NodoP();
        x = P.getAnt();
        R = x.getAnt();
        R.setSig(P);
        P.setAnt(R);
      }
      x.setAnt(null);
      x.setSig(null);
    }
    return x;

  }
```

output:

![Imgur](https://i.imgur.com/2lCaV49.png)

- `eliPrimero():`

```java
  NodoP eliPrimero() {
    NodoP x = new NodoP();
    if (!esVacia()) {
      if (nroNodos() == 1) {
        x = P;
        P = null;
      } else {
        x = P;
        NodoP R = P.getAnt();
        P = P.getSig();
        P.setAnt(R);
        R.setSig(P);
      }
      x.setSig(null);
      x.setAnt(null);
    }
    return x;
  }
```

output:

![Imgur](https://i.imgur.com/Y0t1OI7.png)

- `leer1():`

```java
  void leer1(int n) {
      Scanner scanner = new Scanner(System.in);
    String nom;
    int edad;

    for (int i = 0; i < n; i++) {
      System.out.println("insert: nom, edad:");
      nom = scanner.next();
      edad = scanner.nextInt();

      adiFinal(nom, edad);
    }
  }
```

output:

![Imgur](https://i.imgur.com/tijiXlz.png)

- `leer2():`

```java
  void leer2(int n) {

    Scanner scanner = new Scanner(System.in);
    String nom;
    int edad;

    for (int i = 0; i < n; i++) {
      System.out.println("insert: nom, edad:");
      nom = scanner.next();
      edad = scanner.nextInt();

      adiPrimero(nom, edad);
    }
  }
```

output:

![Imgur](https://i.imgur.com/HqfNYzZ.png)
