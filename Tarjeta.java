import java.time.*;
public class Tarjeta {
    
    private String nombre;
    private int numero;
    private int codigoSeguridad;
    private LocalDate fechaVencimiento;
    private Boolean verificada;

    public Tarjeta(String nombre, int numero, int codigoSeguridad, LocalDate fechaVencimiento, Boolean verificada){
        this.nombre = nombre;
        this.numero = numero;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaVencimiento = fechaVencimiento;
        this.verificada = verificada; 
    }
}
