public class Item {
    private Producto producto;
    private int cantidad;
    private double valor;

    public Item (Producto producto, int cantidad){
        this.producto=producto;
        this.cantidad=cantidad;
        this.valor= producto.precio() * cantidad;
    }

    public Producto producto(){
        return this.producto;
    }

    public double valor(){return this.valor;}
}
