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
    /* ColaSimpleLibro libros = new ColaSimpleLibro(); */
    /* libros.llenar(4); */
    /* libros.mostrar(); */
    ClientesConMasPedidos(clientes, pedidos);
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
