import java.util.List;

public class Carrito{
    
    private Cliente cliente;
    private List<Item> items;

    public Carrito (Cliente cliente){
        this.cliente= cliente;
    }

    public void agregarProducto(Producto producto, int cantidad){
        items.add(new Item(producto, cantidad));
    }
    public void dejarProducto(Producto producto){
        items.removeIf(item -> item.producto().nombre().equals(producto.nombre()));
    }
}