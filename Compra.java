public class Compra{
    private Cliente cliente;
    private Carrito carrito;

    public void realizarCompra(){
        cliente.pedirPlata(this.carrito.monto());
    }

}