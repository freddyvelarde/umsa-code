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

![Imgur](https://i.imgur.com/4ysQnHA.png)

- `nroNodos():`

```java
  int nroNodos() {
    int c = 0;
    NodoP R = this.P;
    while (R != null) {
      c++;
      R = R.getSig();
    }
    return c;
  }
```

output:

![Imgur](https://i.imgur.com/7MWSnhF.png)

- `adiPrimero():`

```java
  void adiPrimero(Proyecto z) {
    NodoP nuevo = new NodoP();
    nuevo.setProy(z);
    if (esVacia())
      P = nuevo;
    else {
      nuevo.setSig(P);
      P.setAnt(nuevo);
      P = nuevo;
    }
  }

```

output:

![Imgur](https://i.imgur.com/Q5BocHm.png)

- `adiFinal():`

```java
  void adiFinal(Proyecto z) {
    NodoP newNode = new NodoP();
    newNode.setProy(z);
    if (esVacia()) {
      this.P = newNode;
      return;
    }

    NodoP temp = P;
    while (temp.getSig() != null) {
      temp = temp.getSig();
    }
    temp.setSig(newNode);
    newNode.setAnt(temp);
  }
```

output:

![Imgur](https://i.imgur.com/cT8S9nS.png)

- `eliFinal():`

```java
  NodoP eliFinal() {
    NodoP x = new NodoP();
    if (!esVacia()) {
      if (nroNodos() == 1) {
        x = P;
        P = null;
      } else {
        NodoP r = P;
        while (r.getSig() != null) {
          r = r.getSig();
        }
        x = r;
        NodoP aux = r.getAnt();
        aux.setSig(null);
        x.setAnt(null);
      }
    }
    return x;
  }
```

output:

![Imgur](https://i.imgur.com/Xe9UV5k.png)

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
        P = P.getSig();
        P.setAnt(null);
        x.setSig(null);
      }
    }
    return x;
  }
```

output:

![Imgur](https://i.imgur.com/iUz0tMV.png)

- `leer1():`

```java
  void leer1(int n) {
    for (int i = 1; i <= n; i++) {
      Proyecto z = new Proyecto();
      z.leer();
      adiPrimero(z);
    }
  }
```

output:

![Imgur](https://i.imgur.com/rN7ep7E.png)

- `leer2():`

```java
  void leer2(int n) {
    for (int i = 1; i <= n; i++) {
      Proyecto z = new Proyecto();
      z.leer();
      adiFinal(z);
    }
  }
```

output:

![Imgur](https://i.imgur.com/Z3DXl3s.png)
