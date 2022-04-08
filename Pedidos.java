public class Pedidos {
    String estadoPedido; //en espera, preparando , cocinando, terminado
    Boolean entregado;

    Pedidos(String estadoPedido, Boolean entregado){
        this.estadoPedido = estadoPedido;
        this.entregado = entregado;
    }
}
