import java.util.List;

import javax.swing.text.PlainDocument;

public class Cliente{
    private String nombre;
    private String direccionDeEnvio;
    private String direccionDeCobro;
    private String eMail;
    private List<Tarjeta> tarjetas;
    private List<Carrito> carritos;
    private Boolean preferencial;
    private Double dinero;

    public void agarrarCarrito(){
       carritos.add(new Carrito(this));
    }
    public void agregarTarjeta(Tarjeta tarjeta){
        tarjetas.add(tarjeta);
    }
    public void pedirPlata(Double plata){
        dinero -= plata;
    }
}