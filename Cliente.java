import java.util.List;

public class Cliente{
    private String nombre;
    private String direccionDeEnvio;
    private String direccionDeCobro;
    private String eMail;
    private List<Tarjeta> tarjetas;
    private List<Carrito> carritos;
    private float descuentoPreferencia;

    public float descuentoPreferencia() {
        return this.descuentoPreferencia;
    }

    public void agarrarCarrito(){
       carritos.add(new Carrito(this));
    }
    public void agregarTarjeta(Tarjeta tarjeta){
        tarjetas.add(tarjeta);
    }
}
