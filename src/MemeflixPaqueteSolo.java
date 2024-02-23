
import java.util.List;
/**
 * Clase que representa un paquete de suscripcion individual a Memeflix
 * Extiende la clase Memeflix e implementa la interfaz MemeflixCobrador
 */
public class MemeflixPaqueteSolo extends Memeflix implements MemeflixCobrador {
        private double precio;
    
        /**
     * Constructor para inicializar un paquete de suscripcion individual a Memeflix
     * 
     * @param precio El precio del paquete de suscripcion individual
     */
        public MemeflixPaqueteSolo(double precio) {
            this.precio = 120;
        }
    
         /**
     * Obtiene el precio del paquete de suscripcion individual
     * 
     * @return El precio del paquete de suscripcion individual
     */
        public double getPrecio() {
            return precio;
        }

        public void procesarUsuarios(List<Usuario> usuarios) {
            for (Usuario usuario : usuarios) {
                MemeflixPaqueteSolo thisney = new MemeflixPaqueteSolo(precio);
                // Realizar alguna acción con el usuario actual
                thisney.cobrar(usuario);
                // Aquí puedes hacer cualquier otra acción que necesites con el usuario actual
            }
        }
    
        /**
     * Implementacion del metodo de cobro para el paquete de suscripcion individual a Memeflix
     * Cobra al usuario por el paquete de suscripcion individual y realiza el pago
     * 
     * @param usuario El usuario al que se le cobrara por el paquete de suscripcion individual
     */
        @Override
        public void cobrar(Usuario usuario) {
            System.out.println("Querid@ " + usuario.getNombre() + "\n se está cobrando " + precio + " por el plan de suscripción para un dispositivo de HVO_MAX.");
            usuario.realizarPago(usuario, precio);
        }

    }