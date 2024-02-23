
import java.util.List; 
    
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

    public void procesarUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            SpootifyPaqueteGratis spoti = new SpootifyPaqueteGratis(precio);
            spoti.cobrar(usuario);
        }
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
        System.out.println("Querid@ " + usuario.getNombre() + ", estás disfrutando del plan gratuito de Spootify \n Si quieres quitar los anuncios contrata el PREMIUM " + usuario.getNombre() + ".");
    }
}
