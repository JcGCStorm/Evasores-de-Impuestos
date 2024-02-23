
import java.util.List;

/**
 * Clase que representa un paquete de suscripcion premium a Spootify
 * Extiende la clase Spootify e implementa la interfaz SpootifyCobrador
 */

public class SpootifyPaquetePremium extends Spootify implements SpootifyCobrador {

    private double precio;

    /**
     * Constructor para inicializar un paquete de suscripcion premium a Spootify
     * 
     * @param precio El precio del paquete de suscripcion premium a Spootify
     */
    public SpootifyPaquetePremium(double precio) {
        this.precio = 80;
    }

    /**
     * Obtiene el precio del paquete de suscripcion premium
     * 
     * @return El precio del paquete de suscripcion premium
     */
    public double getPrecio() {
        return precio;
    }


    public void procesarUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            SpootifyPaquetePremium spoti = new SpootifyPaquetePremium(precio);
            spoti.cobrar(usuario);
        }
    }

    /**
     * Implementacion del metodo de cobro para el paquete de suscripcion premium a
     * Spootify
     * Cobra al usuario por el paquete de suscripcion premium y realiza el pago
     * 
     * @param usuario El usuario al que se le cobrara por el paquete de suscripcion
     *                premium
     */

    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Querid@ " + usuario.getNombre() + "\n se está cobrando " + precio + " por el plan de suscripción PREMIUM de Spootify.");
        usuario.realizarPago(usuario, precio);
    }
}