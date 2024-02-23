/**
 * Clase que representa un paquete de suscripcion premium a Momazon
 * Extiende la clase Momazon e implementa la interfaz MomazonCobrador
 */
public class MomazonPaquetePremium extends Momazon implements MomazonCobrador {

    private double precio;
    
    /**
     * Constructor para inicializar un paquete de suscripcion premium a Momazon
     * 
     * @param precio El precio del paquete de suscripcion premium
     */
    public MomazonPaquetePremium(double precio) {
        this.precio = 110;
    }

    /**
     * Obtiene el precio del paquete de suscripcion premium
     * 
     * @return El precio del paquete de suscripcion premium
     */
    public double getPrecio() {
        return precio;
    }

     /**
     * Implementacion del metodo de cobro para el paquete de suscripcion premium a Momazon
     * Cobra al usuario por el paquete de suscripcion premium y realiza el pago
     * 
     * @param usuario El usuario al que se le cobrara por el paquete de suscripcion premium
     */
    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Cobrando " + precio + " por el plan de suscripción.");
    }
}
