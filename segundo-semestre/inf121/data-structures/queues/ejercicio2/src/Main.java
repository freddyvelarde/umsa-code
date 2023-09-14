public class Main {
  public static void main(String[] args) {
    /* // Clientes */
    ColaSimpleCli clientes = new ColaSimpleCli();
    clientes.llenar(4);
    /* clientes.mostrar(); */

    // Pedidos
    ColaSimplePed pedidos = new ColaSimplePed();
    pedidos.llenar(3);
    /* pedidos.mostrar(); */

    /* // Libros */
    ColaSimpleLibro libros = new ColaSimpleLibro();
    libros.llenar(4);
    /* libros.mostrar(); */
    /* ClientesConMasPedidos(clientes, pedidos); */
    montoTotalPorCliente(clientes, pedidos, libros);
  }

  static void montoTotalPorCliente(ColaSimpleCli clientes,
                                   ColaSimplePed pedidos,
                                   ColaSimpleLibro libros) {
    ColaSimpleCli swap = new ColaSimpleCli();
    while (!clientes.esVacia()) {
      Cliente cliente = clientes.eli();
      int total = 0;

      ColaSimplePed swapPedidos = new ColaSimplePed();
      while (!pedidos.esVacia()) {
        Pedidos pedido = pedidos.eli();
        if (cliente.getCodigoCliente().equals(pedido.getCodCli())) {
          int cant = pedido.getCantidad();
          String codLib = pedido.getCodLib();
          int precio = precioLibCod(libros, codLib);
          total = total + (cant * precio);
        }
        swapPedidos.adi(pedido);
      }
      pedidos.vaciar(swapPedidos);
      System.out.println("Nombre cliente: " + cliente.getNombre());
      System.out.println("Monto total: " + total);

      swap.adi(cliente);
    }

    clientes.vaciar(swap);
  }

  static int precioLibCod(ColaSimpleLibro libros, String codLib) {
    ColaSimpleLibro swap = new ColaSimpleLibro();
    int precio = 0;
    while (!libros.esVacia()) {
      Libro x = libros.eli();
      if (x.getCodLib().equals(codLib)) {
        precio = x.getPrecio();
      }

      swap.adi(x);
    }
    libros.vaciar(swap);
    return precio;
  }

  static void ClientesConMasPedidos(ColaSimpleCli clientes,
                                    ColaSimplePed pedidos) {
    ColaSimpleCli swap = new ColaSimpleCli();

    int max = 0;
    while (!clientes.esVacia()) {
      Cliente x = clientes.eli();
      String codigoCliente = x.getCodigoCliente();
      int nroPedidos = nPedidos(pedidos, codigoCliente);

      if (nroPedidos > max)
        max = nroPedidos;
      swap.adi(x);
    }
    clientes.vaciar(swap);

    while (!clientes.esVacia()) {
      Cliente x = clientes.eli();
      String codCliente = x.getCodigoCliente();
      int nPedidos = nPedidos(pedidos, codCliente);
      if (max == nPedidos)
        System.out.println("El cliente con mas compras: " + x.getNombre());

      swap.adi(x);
    }
    clientes.vaciar(swap);
  }

  static int nPedidos(ColaSimplePed pedidos, String codCli) {
    ColaSimplePed swap = new ColaSimplePed();
    int counter = 0;
    while (!pedidos.esVacia()) {
      Pedidos pedido = pedidos.eli();
      /* System.out.println("<<-------------->>"); */
      /* System.out.println(pedido.getCodCli() + " " + codCli); */
      /* System.out.println("<<-------------->>"); */
      if (pedido.getCodCli().equals(codCli)) {
        System.out.println(pedido.getCodCli() + " << ---- >> " + codCli);
        counter++;
      }
      swap.adi(pedido);
    }
    pedidos.vaciar(swap);
    return counter;
  }
}
