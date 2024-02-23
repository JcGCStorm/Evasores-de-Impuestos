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

    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Cobrando " + precio + " por el plan de suscripción para cuatro dispositivos de Memeflix.");
        usuario.realizarPago(usuario, precio);
    }
}
