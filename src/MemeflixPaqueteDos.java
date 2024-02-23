/**
 * Clase que representa un paquete de suscripcion para dos dispositivos a Memeflix
 * Extiende la clase Memeflix e implementa la interfaz MemeflixCobrador
 */
public class MemeflixPaqueteDos extends Memeflix implements MemeflixCobrador { 
    private double precio;
    
    /**
     * Constructor para inicializar un paquete de suscripcion de dos dispositivos a Memeflix
     * 
     * @param precio El precio del paquete de suscripcion de dos dispositivos
     */
    public MemeflixPaqueteDos(double precio) {
        this.precio = 170;
    }
    
    /**
     * Obtiene el precio del paquete de suscripcion de dos dispositivos
     * 
     * @return El precio del paquete de suscripcion de dos dispositivos
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Implementacion del metodo de cobro para el paquete de suscripcion de dos dispositivos a Memeflix
     * Cobra al usuario por el paquete de suscripcion de dos dispositivos y realiza el pago
     * 
     * @param usuario El usuario al que se le cobrara por el paquete de suscripcion de dos dispositivos
     */
    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Cobrando " + precio + " por el plan de suscripción para dos dispositivos de HVO_MAX.");
        usuario.realizarPago(usuario, precio);
    }
}