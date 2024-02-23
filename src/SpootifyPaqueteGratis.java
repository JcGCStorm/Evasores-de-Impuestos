/**
 * Clase que representa un paquete de suscripcion gratuita a Spootify
 * Extiende la clase Spootify e implementa la interfaz SpootifyCobrador
 */
public class SpootifyPaqueteGratis extends Spootify implements SpootifyCobrador {

    private double precio;

    /**
     * Constructor para inicializar un paquete de suscripcion gratuita a Spootify
     * 
     * @param precio El precio del paquete de suscripcion gratuita a Spootify
     */
    public SpootifyPaqueteGratis(double precio) {
        this.precio = 0;
    }

    /**
     * Obtiene el precio del paquete de suscripcion gratuita
     * 
     * @return El precio del paquete de suscripcion gratuita
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Implementacion del metodo de cobro para el paquete de suscripcion gratuita a
     * Spootify
     * Cobra al usuario por el paquete de suscripcion gratuita y realiza el pago
     * 
     * @param usuario El usuario al que se le cobrara por el paquete de suscripcion
     *                gratuita
     */
    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Disfrute del plan gratuito de Spootify.");
    }
}
