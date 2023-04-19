public class Producto {
    private String nombre;
    private Double precio;
    private String categoria;
    

    public Double precio(){
        return this.precio;
    }

    public String nombre(){
        return this.nombre;
    }

    public Producto(String nombre, Double precio, String categoria){
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        
    }
}
