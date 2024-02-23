/**
 * Clase que representa un paquete de suscripcion normal a Momazon
 * Extiende la clase Momazon e implementa la interfaz MomazonCobrador
 */
public class MomazonPaqueteNormal extends Momazon implements MomazonCobrador {

    private double precio;

    /**
     * Constructor para inicializar un paquete de suscripcion normal a Momazon
     * 
     * @param precio El precio del paquete de suscripcion normal
     */
    public MomazonPaqueteNormal(double precio) {
        this.precio = 110;
    }

    /**
     * Obtiene el precio del paquete de suscripcion normal
     * 
     * @return El precio del paquete de suscripcion normal
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Implementacion del metodo de cobro para el paquete de suscripcion normal a
     * Momazon
     * Cobra al usuario por el paquete de suscripcion normal y realiza el pago
     * 
     * @param usuario El usuario al que se le cobrara por el paquete de suscripcion
     *                normal
     */
    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Cobrando " + precio + " por el plan de suscripción normal de Momazon.");
        usuario.realizarPago(usuario, precio);
    }
}
