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

    public double monto(){ 
        double monto = items
            .stream()
            .mapToDouble(Item::valor)
            .sum();

        return monto*(1-cliente.descuentoPreferencia());
        /* double monto = 0;
        
        for(int elemento = 0; elemento< (this.items.size()-1);elemento++){
            monto += this.items.get(elemento).valor();
        }
        return monto*(1-cliente.descuentoPreferencia()); */
    }
}
