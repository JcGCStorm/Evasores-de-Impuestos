/**
 * Clase que representa un paquete de suscripcion de los primeros 3 meses a
 * Thisney
 * Extiende la clase Thisney e implementa la interfaz ThisneyCobrador
 */
public class ThisneyPaqueteTresMeses extends Thisney implements ThisneyCobrador {
    private double precio;
    ThisneyPaqueteNormal paqueteNormal = new ThisneyPaqueteNormal(precio);

    /**
     * Constructor para inicializar un paquete de suscripcion de los primeros 3
     * meses a THisney
     * 
     * @param precio El precio del paquete de suscripcion de los primeros 3 meses
     */
    public ThisneyPaqueteTresMeses(double precio) {
        this.precio = 130;
    }

    /**
     * Obtiene el precio del paquete de suscripcion de los primeros 3 meses
     * 
     * @return El precio del paquete de suscripcion de los primeros 3 meses
     */
    public double getPrecio() {
        return precio;
    }

     /**
     * Implementacion del metodo de cobro para el paquete de suscripcion de los primeros 3 meses
     * a THisney
     * Cobra al usuario por el paquete de suscripcion de los primeros 3 meses
     * y realiza el pago
     * 
     * @param usuario El usuario al que se le cobrara por el paquete de suscripcion de los primeros 3 meses
     */
    @Override
    public void cobrar(Usuario usuario) {
        if (usuario.getMes(1) < 3) {
            System.out.println(usuario.getNombre() + ", se cobrará tu suscripciónn de Thisney de $130,");
            usuario.setMes(1, (usuario.getMes(1) + 1));
            usuario.realizarPago(usuario, precio);
            System.out.println("aún te quedan " + (3 - usuario.getMes(1)) + " meses/es");
        } else {
            System.out.println(usuario.getNombre() + ", tú suscripciónn de HVO_MAX con paquete gratis ha expirado.");
            usuario.cambiarVersion();
            paqueteNormal.cobrar(usuario);
        }
    }
}