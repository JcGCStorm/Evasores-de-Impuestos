import java.util.List;
/**
 * Clase que representa un paquete de suscripcion para cuatro dispositivos a Memeflix
 * Extiende la clase Memeflix e implementa la interfaz MemeflixCobrador
 */
public class MemeflixPaqueteCuatro extends Memeflix implements MemeflixCobrador {
    private double precio = 200;

    /**
     * Constructor para inicializar un paquete de suscripcion de 4 dispositivos a Memeflix
     * 
     * @param precio El precio del paquete de suscripcion de 4 dispositivos
     */
    public MemeflixPaqueteCuatro(double precio) {
        this.precio = 200;
    }

    /**
     * Obtiene el precio del paquete de suscripcion de 4 dispositivos
     * 
     * @return El precio del paquete de suscripcion de 4 dispositivos
     */
    public double getPrecio() {
        return precio;
    }

    public void procesarUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            MemeflixPaqueteCuatro meme = new MemeflixPaqueteCuatro(precio);
            meme.cobrar(usuario);
        }
    }

    /**
     * Implementacion del metodo de cobro para el paquete de suscripcion de 4 dispositivos a Memeflix
     * Cobra al usuario por el paquete de suscripcion de 4 dispositivos y realiza el pago
     * 
     * @param usuario El usuario al que se le cobrara por el paquete de suscripcion de 4 dispositivos
     */
    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Querid@ " + usuario.getNombre() + "\n se está cobrando " + precio + " por el plan de suscripción para cuatro dispositivos de Memeflix.");
        usuario.realizarPago(usuario, precio);
    }
}
