/**
 * Clase que representa un paquete de suscripcion normal a Thinsey
 * Extiende la clase Thisney e implementa la interfaz ThisneyCobrador
 */
public class ThisneyPaqueteNormal extends Thisney implements ThisneyCobrador {

    private double precio;

    /**
     * Constructor para inicializar un paquete de suscripcion normal a THisney
     * 
     * @param precio El precio del paquete de suscripcion normal
     */
    public ThisneyPaqueteNormal(double precio) {
        this.precio = 160;
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
     * Implementacion del metodo de cobro para el paquete de suscripcion normal a THisney
     * Cobra al usuario por el paquete de suscripcion normal y realiza el pago
     * 
     * @param usuario El usuario al que se le cobrara por el paquete de suscripcion normal
     */
    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Cobrando " + precio + " por el plan de suscripción de Thisney.");
        usuario.realizarPago(usuario, precio);
    }
}